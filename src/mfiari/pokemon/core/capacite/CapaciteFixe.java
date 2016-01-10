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
public class CapaciteFixe extends Capacite {
    
    private static final long serialVersionUID = 1L;
    
    public CapaciteFixe () {
        super();
    }
    
    public CapaciteFixe (String nom, Type type, int force, int prec, int pp, Attribut classe) {
        super(nom, type, force, prec, pp, classe);
    }

    public CapaciteFixe (String nom, Type type, int force, int prec, int pp, Attribut classe, PokemonVise pokemonVise) {
        super(nom, type, force, prec, pp, classe, pokemonVise);
    }

    public CapaciteFixe (CapaciteFixe c) {
        super(c);
    }
}