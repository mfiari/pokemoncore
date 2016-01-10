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
import mfiari.pokemon.core.objet.Type_objet;

/**
 *
 * @author mike
 */
public class Maison extends Batiments {

    public Maison (String nom, int positionX, int positionY,int longueur, int largeur, int etageMax, Orientation orientation, 
            Quartier endroitBatiment, boolean maisonClassqiue) {
        super(nom, positionX, positionY, longueur, largeur, 0, etageMax, orientation, endroitBatiment);
        if (maisonClassqiue) {
            Salle basMaison = new Salle("rez de chausse", 0, 0, 20, 17, this, 0);
            basMaison.supprimeObjetEndroit(basMaison.getObjetEndroit(0));
            basMaison.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 11, 10, new Position(positionX+1, positionY, endroitBatiment)));
            for (int i = 0 ; i < 5 ; i++) {
                for (int j = 0 ; j < 20; j++) {
                    basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur, i, j));
                }
            }
            for (int i = 12 ; i < 17 ; i++) {
                for (int j = 0 ; j < 20; j++) {
                    basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur, i, j));
                }
            }
            for (int i = 5 ; i < 12 ; i++) {
                for (int j = 0 ; j < 5 ; j++) {
                    basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur, i, j));
                }
            }
            for (int i = 5 ; i < 12 ; i++) {
                for (int j = 15 ; j < 20 ; j++) {
                    basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur, i, j));
                }
            }
            basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.table, 8, 10));
            basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.tele, 5, 8));
            basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.evier, 5, 5));
            basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.frigo, 5, 7));
            basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 11, 5));
            basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.plante, 11, 14));
            basMaison.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.etagere, 5, 14));
            basMaison.setSol(Sol.bois);
        }
    }

}