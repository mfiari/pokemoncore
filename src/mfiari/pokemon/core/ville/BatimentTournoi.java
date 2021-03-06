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
import mfiari.pokemon.core.objet.ObjetEndroitTournoi;
import mfiari.pokemon.core.objet.Type_objet;
import mfiari.pokemon.core.perso.dresseur.Dresseur;
import mfiari.pokemon.core.tournoi.NiveauTournoi;
import mfiari.pokemon.core.type.TypeTournoi;

/**
 *
 * @author mike
 */
public class BatimentTournoi extends Batiments {
    
    private static final long serialVersionUID = 1L;
    
    private final ObjetEndroitTournoi objetEndroitTournoi;
    
    public BatimentTournoi (String nom, int positionX, int positionY,int longueur, int largeur, int etageMin, int etageMax, Orientation orientation, 
            Quartier endroitBatiment, TypeTournoi typeTournoi, NiveauTournoi niveau) {
        this(nom, positionX, positionY, longueur, largeur, etageMin, etageMax, orientation, endroitBatiment, typeTournoi, niveau, NiveauTournoi.topDresseur);
    }
    
    public BatimentTournoi (String nom, int positionX, int positionY,int longueur, int largeur, int etageMin, int etageMax, Orientation orientation, 
            Quartier endroitBatiment, TypeTournoi typeTournoi, NiveauTournoi niveauMin, NiveauTournoi niveauMax) {
        super(nom, positionX, positionY, longueur, largeur, etageMin, etageMax, orientation, endroitBatiment);
        this.objetEndroitTournoi = new ObjetEndroitTournoi(Type_objet.vendeur_shop, 5, 5, typeTournoi, niveauMin, niveauMax);
        Salle basTournoi = new Salle("rez de chausse tournoi", 0, 0, 20, 17, this, 0);
        basTournoi.supprimeObjetEndroit(basTournoi.getObjetEndroit(0));
        basTournoi.ajouterObjetEndroit(new ObjetEndroitPassage(Type_objet.porte, 11, 10, new Position(positionX+1, positionY, endroitBatiment)));
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0 ; j < 20; j++) {
                basTournoi.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur, i, j));
            }
        }
        for (int i = 12 ; i < 17 ; i++) {
            for (int j = 0 ; j < 20; j++) {
                basTournoi.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur, i, j));
            }
        }
        for (int i = 5 ; i < 12 ; i++) {
            for (int j = 0 ; j < 5 ; j++) {
                basTournoi.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur, i, j));
            }
        }
        for (int i = 5 ; i < 12 ; i++) {
            for (int j = 15 ; j < 20 ; j++) {
                basTournoi.ajouterObjetEndroit(new ObjetEndroitClassique(Type_objet.mur, i, j));
            }
        }
        basTournoi.ajouterObjetEndroit(this.objetEndroitTournoi);
        basTournoi.setSol(Sol.carrelage);
    }
    
    public void ajouterParticipant (Dresseur participant) {
        this.objetEndroitTournoi.ajouterParticipant(participant);
    }
    
    /*@Override
    public void entrer(Dresseur equipe) {
        if (this.tournoi == null) {
            this.vosDresseurs.ajouterDresseur(equipe);
            ListeDeDresseur participantsTournois = new ListeDeDresseur();
            participantsTournois.ajouterDresseur(equipe);
            while (participantsTournois.size() < this.typeTournoi.getNbParticiapntByTournoiAndNiveau(this.niveau)) {
                int alea = (int) (Math.random() * this.participants.size() - 1);
                participantsTournois.ajouterDresseur(this.participants.removeDresseur(alea));

            }
            this.tournoi = new Tournoi (participantsTournois, this.vosDresseurs, Terrains.getTerrain(this.typeTournoi));
            Vues.createVue(this.tournoi);
            this.tournoi.commencerTournoi();
        } else {
            this.tournoi.continuer();
        }
    }*/
    
}