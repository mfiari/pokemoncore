/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.perso.dresseur;

/**
 *
 * @author mike
 */
public class DresseurFactory {
    
    public Dresseur createDresseur (String code) {
        mfiari.pokemon.core.models.Dresseur model = new mfiari.pokemon.core.models.Dresseur();
        return model.getDresseur(code);
    }
    
}
