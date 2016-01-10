/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.ville;

import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.objet.ObjetEndroitClassique;
import mfiari.lib.game.objet.ObjetEndroitPassage;
import mfiari.lib.game.position.Orientation;
import mfiari.lib.game.position.Position;
import mfiari.pokemon.core.objet.Objet_endroit_vente;
import mfiari.pokemon.core.objet.Type_objet;

/**
 *
 * @author mike
 */
public class Magasin extends Batiments {
    
    private static final long serialVersionUID = 1L;
    
    private final Objet_endroit_vente magasin;

    public Magasin (String nom, int positionX, int positionY, int longueur, int largeur, int etageMax, Orientation orientation, 
            Quartier endroitBatiment) {
        super(nom, positionX, positionY, longueur, largeur, 0, etageMax, orientation, endroitBatiment);
        this.magasin = new Objet_endroit_vente(Type_objet.vendeur_shop, 5, 5);
        Salle basShop = new Salle("rez de chausse shop", 0, 0, 20, 17, this, 0);
        basShop.supprimeObjetEndroit(basShop.getObjetEndroit(0));
        basShop.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 11, 10, new Position(positionX+1, positionY, endroitBatiment)));
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0 ; j < 20; j++) {
                basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur, i, j));
            }
        }
        for (int i = 12 ; i < 17 ; i++) {
            for (int j = 0 ; j < 20; j++) {
                basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur, i, j));
            }
        }
        for (int i = 5 ; i < 12 ; i++) {
            for (int j = 0 ; j < 5 ; j++) {
                basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur, i, j));
            }
        }
        for (int i = 5 ; i < 12 ; i++) {
            for (int j = 15 ; j < 20 ; j++) {
                basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur, i, j));
            }
        }
        basShop.ajouterObjetEndroit(this.magasin, Environnement.aucun);
        basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.vitrine_shop, 5, 7));
        basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere_mur_shop, 5, 9));
        basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere_mur_shop, 5, 11));
        basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere_gauche_shop, 8, 9));
        basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere_droite_shop, 8, 10));
        basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere_gauche_shop, 8, 14));
        basShop.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 11, 14));
        basShop.setSol(Sol.carrelage);
    }

    public void ajouterObjet (Objet o) {
        this.magasin.ajouterObjet(o);
    }
}
