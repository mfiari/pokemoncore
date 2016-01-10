/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.tournoi;

import java.io.Serializable;
import mfiari.pokemon.core.perso.dresseur.Dresseur;

/**
 *
 * @author mike
 */
public class Groupe extends mfiari.lib.game.tournoi.Groupe implements Serializable {
    
    private int nbPokemon;
    
    public Groupe () {
        this(4);
    }
    
    public Groupe (int nbParticipant) {
        super(nbParticipant);
        this.nbPokemon = 3;
    }
    
    public Groupe (int nbParticipant, int nbPokemon) {
        super(nbParticipant);
        this.nbPokemon = nbPokemon;
    }
    
    public int getNbPokemon () {
        return this.nbPokemon;
    }
    
    public void repartirPoint (Dresseur dress1, Dresseur dress2) {
        if (!dress1.aPokemon() && !dress2.aPokemon()) {
            this.egalite(dress1);
            this.egalite(dress2);
        } else if (dress1.aPokemon()) {
            this.gagner(dress1);
            this.perdu(dress2);
        } else if (dress2.aPokemon()) {
            this.gagner(dress2);
            this.perdu(dress1);
        }
        //this.repartirPoint(dress1, dress2);
    }
    
}