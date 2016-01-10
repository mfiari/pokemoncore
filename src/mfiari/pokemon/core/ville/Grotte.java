/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.ville;

import mfiari.lib.game.position.Orientation;

/**
 *
 * @author mike
 */
public class Grotte extends Batiments {

    public Grotte (String nom, int positionX, int positionY,int longueur, int largeur, int etageMax, Orientation orientation, 
            Quartier endroitBatiment) {
        super(nom, positionX, positionY, longueur, largeur, 0, etageMax, orientation, endroitBatiment);
    }

    public Grotte (String nom, int positionX, int positionY,int longueur, int largeur, int etageMin, int etageMax, Orientation orientation, 
            Quartier endroitBatiment) {
        super(nom, positionX, positionY, longueur, largeur, etageMin, etageMax, orientation, endroitBatiment);
    }
}