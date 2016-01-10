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
public class Batiment extends Batiments {

    private final TypeBatiment type;

    public Batiment (String nom, int positionX, int positionY,int longueur, int largeur, int etageMin, int etageMax, Orientation orientation, 
            Quartier endroitBatiment, TypeBatiment type) {
        super(nom, positionX, positionY, longueur, largeur, etageMin, etageMax, orientation, endroitBatiment);
        this.type = type;
    }
    
    public TypeBatiment getType() {
        return this.type;
    }

}