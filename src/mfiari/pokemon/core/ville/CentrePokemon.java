/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.ville;

import mfiari.lib.game.objet.ObjetEndroitClassique;
import mfiari.lib.game.objet.ObjetEndroitPassage;
import mfiari.lib.game.position.Orientation;
import mfiari.lib.game.position.Position;
import mfiari.pokemon.core.objet.Objet_endroit_pc;
import mfiari.pokemon.core.objet.Objet_endroit_soin;
import mfiari.pokemon.core.objet.Type_objet;

/**
 *
 * @author mike
 */
public class CentrePokemon extends Batiments {
    
    private static final long serialVersionUID = 1L;

    public CentrePokemon (String nom, int positionX, int positionY,int longueur, int largeur, int etageMax, Orientation orientation, 
            Quartier endroitBatiment) {
        super(nom, positionX, positionY, longueur, largeur, 0, etageMax, orientation, endroitBatiment);
        Salle basCentrePokemon = new Salle("rez de chausse centre pokemon", 0, 0, 20, 17, this, 0);
        basCentrePokemon.supprimeObjetEndroit(basCentrePokemon.getObjetEndroit(0));
        basCentrePokemon.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 11, 10, new Position(positionX+1, positionY, endroitBatiment)));
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0 ; j < 20; j++) {
                basCentrePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur, i, j));
            }
        }
        for (int i = 12 ; i < 17 ; i++) {
            for (int j = 0 ; j < 20; j++) {
                basCentrePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur, i, j));
            }
        }
        for (int i = 5 ; i < 12 ; i++) {
            for (int j = 0 ; j < 5 ; j++) {
                basCentrePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur, i, j));
            }
        }
        for (int i = 5 ; i < 12 ; i++) {
            for (int j = 15 ; j < 20 ; j++) {
                basCentrePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur, i, j));
            }
        }
        basCentrePokemon.ajouterObjetEndroit(new Objet_endroit_soin(Type_objet.infirmiere_joel, 5, 10, "voulez vous soignez vos pokemon ?"));
        basCentrePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 11, 5));
        basCentrePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 11, 14));
        basCentrePokemon.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 8, 7));
        basCentrePokemon.ajouterObjetEndroit(new Objet_endroit_pc(Type_objet.pc_leo, 5, 14));
        basCentrePokemon.setSol(Sol.carrelage);
    }
}