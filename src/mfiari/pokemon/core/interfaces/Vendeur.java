/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.interfaces;

import mfiari.pokemon.core.perso.dresseur.Dresseur;

/**
 *
 * @author mike
 */
public interface Vendeur extends mfiari.lib.game.interfaces.Vendeur {
    
    
    public void ajouterDresseur(Dresseur dresseur);
    
    public Dresseur getDresseur();
    
}