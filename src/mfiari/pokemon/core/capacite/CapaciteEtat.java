/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.capacite;

import mfiari.pokemon.core.type.Attribut;
import mfiari.pokemon.core.type.Type;

/**
 *
 * @author mike
 */
public class CapaciteEtat extends Capacite {
    
    private static final long serialVersionUID = 1L;
    
    private final Etat etat;
    private int pourcentageReussi;
    
    public CapaciteEtat () {
        super();
        this.etat = Etat.aucun;
    }
    
    public CapaciteEtat (String nom, Type type, int force, int prec, int pp, Attribut classe, Etat etat) {
        super(nom, type, force, prec, pp, classe);
        this.etat = etat;
        this.pourcentageReussi = 100;
    }
    
    public CapaciteEtat (String nom, Type type, int force, int prec, int pp, Attribut classe, Etat etat, int pourCent) {
        super(nom, type, force, prec, pp, classe);
        this.etat = etat;
        this.pourcentageReussi = pourCent;
    }

    public CapaciteEtat (String nom, Type type, int force, int prec, int pp, Attribut classe, PokemonVise pokemonVise, Etat etat) {
        super(nom, type, force, prec, pp, classe, pokemonVise);
        this.etat = etat;
        this.pourcentageReussi = 100;
    }

    public CapaciteEtat (String nom, Type type, int force, int prec, int pp, Attribut classe, PokemonVise pokemonVise, Etat etat, int pourCent) {
        super(nom, type, force, prec, pp, classe, pokemonVise);
        this.etat = etat;
        this.pourcentageReussi = pourCent;
    }

    public CapaciteEtat (CapaciteEtat c) {
        super(c);
        this.etat = c.etat;
        this.pourcentageReussi = c.pourcentageReussi;
    }
    
    public boolean affecte () {
        return ((int) (Math.random() * 100 + 1)) <= this.pourcentageReussi;
    }
    
    public Etat getEtat () {
        return this.etat;
    }
}