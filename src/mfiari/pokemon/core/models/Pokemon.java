/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.models;

import java.sql.Connection;
import mfiari.lib.game.connexionBD.ConnexionBD;
import mfiari.lib.game.connexionBD.Methode;

/**
 *
 * @author mike
 */
public class Pokemon extends Methode {

    public Pokemon() {
        super((new ConnexionBD()).getConnexionHSQL("database/pokemon", "sa", ""));
    }
    
    public Pokemon (Connection connection) {
        super(connection);
    }
    
    public mfiari.pokemon.core.perso.pokemon.Pokemon getPokemon (int numero) {
        return null;
    }
    
}
