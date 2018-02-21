/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.objet;

import mfiari.lib.game.interfaces.TypeObjet;
import mfiari.lib.game.personnage.Personnage;
import mfiari.lib.game.position.Orientation;
import mfiari.lib.game.position.Position;
import mfiari.pokemon.core.ville.Endroit;
import mfiari.pokemon.core.ville.EndroitFactory;

/**
 *
 * @author mike
 */
public class ObjetEndroitPassage extends mfiari.lib.game.objet.ObjetEndroitPassage {
    
    private String endroit;
    private int postionArriveX;
    private int postionArriveY;
    private int postionArriveZ;
    private Orientation orientation;

    public ObjetEndroitPassage(TypeObjet nom, int positionX, int positionY, Position p) {
        super(nom, positionX, positionY, p);
    }
    
    public ObjetEndroitPassage (TypeObjet nom, int positionX, int positionY, String endroit, int x, int y, int z, Orientation orientation) {
        super(nom, positionX, positionY, null);
        this.endroit = endroit;
        this.postionArriveX = x;
        this.postionArriveY = y;
        this.postionArriveZ = z;
        this.orientation = orientation;
    }
    
    @Override
    public void prendre (Personnage p) {
        if (this.getEndroitDarive() != null) {
            super.prendre(p);
        } else {
            EndroitFactory endroitFactory = new EndroitFactory();
            Endroit endroitArrive = endroitFactory.createEndroit(this.endroit);
            if (endroit != null) {
                Position positionArrive = new Position(this.postionArriveX, this.postionArriveY, this.postionArriveZ, endroitArrive, this.orientation);
                System.out.println(positionArrive);
                p.setPosition(positionArrive);
            }
        }
    }
    
}
