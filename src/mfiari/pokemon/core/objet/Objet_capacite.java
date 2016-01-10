/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.objet;

import mfiari.lib.game.objet.Objet;
import mfiari.pokemon.core.capacite.Capacite;

/**
 *
 * @author mike
 */
public class Objet_capacite extends Objet {
    
    private final String nom;
    private final Capacite capacite;
    
    public Objet_capacite() {
        this.nom = null;
        this.capacite = null;
    }
    
    public Objet_capacite(String nom, Capacite capacite) {
        this.nom = nom;
        this.capacite = capacite;
    }
    
    @Override
    public String getNom() {
        return this.nom;
    }
    
    public Capacite getCapacite () {
        return this.capacite;
    }
    
}