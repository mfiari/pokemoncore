/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.ville;

import java.io.Serializable;
import mfiari.pokemon.core.capacite.Capacite;
import mfiari.pokemon.core.perso.pokemon.Pokemon;
import mfiari.pokemon.core.type.Type;

/**
 *
 * @author mike
 */
public class Terrain extends mfiari.lib.game.ville.Terrain implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private final Type type;
    
    public Terrain () {
        this.type = Type.normal;
    }
    
    public Terrain (Type t) {
        this.type = t;
    }
    
    @Override
    public Type getType () {
        return this.type;
    }
    
    public boolean affaibliPokemon (Pokemon pk) {
        return pk.estFaible(this.type) && pk.getType1() != this.type && pk.getType2() != this.type;
    }
    
    public boolean renforcePokemon (Pokemon pk) {
        return pk.getType1() == this.type || pk.getType2() == this.type;
    }
    
    public boolean affaibliAttaque (Capacite c) {
        return c.getType().faible(this.type);
    }
    
    public boolean renforceAttque (Capacite c) {
        return c.getType() == this.type;
    }
    
    @Override
    public String toString () {
        return "terrain " + this.type.name();
    }
    
}