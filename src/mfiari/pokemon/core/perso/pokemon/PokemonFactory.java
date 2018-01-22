/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.perso.pokemon;

/**
 *
 * @author mike
 */
public class PokemonFactory {
    
    public Pokemon createPokemon (int numero) {
        mfiari.pokemon.core.models.Pokemon model = new mfiari.pokemon.core.models.Pokemon();
        return model.getPokemon(numero);
    }
    
}
