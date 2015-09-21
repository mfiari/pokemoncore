/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.tournoi;

/**
 *
 * @author etudiant
 */
public enum NiveauTournoi {
    
    gamin, dresseurPkmn, topDresseur, champion, maitre;
    
    public int getNiveauPokemon () {
        switch (this) {
            case gamin:
                return 30;
            case dresseurPkmn:
                return 50;
            case topDresseur :
                return 80;
            case champion:
                return 100;
            case maitre:
                return 120;
            default:
                return 100;
        }
    }
    
}
