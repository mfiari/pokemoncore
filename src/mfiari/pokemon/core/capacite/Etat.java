/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.capacite;

/**
 *
 * @author mike
 */
public enum Etat {
    aucun, poison, paralise, someil, folie, brulure, gel, peur;
    
    @Override
    public String toString () {
        switch (this) {
            /*case poison:
                return Texte.getEmpoisonne();
            case paralise:
                return Texte.getParalise();
            case someil:
                return Texte.getSommeil();
            case folie:
                return Texte.getFolie();
            case brulure:
                return Texte.getBrulure();
            case gel:
                return Texte.getGel();
            case peur:
                return Texte.getPeur();*/
            default :
                return "";
        }
    }
    
    public String getName () {
        switch (this) {
            case aucun:
                return "";
            default :
                return this.name();
        }
    }
    
    public double getBonus () {
        switch (this) {
            case poison:
                return 1.5;
            case paralise:
                return 1.5;
            case someil:
                return 2;
            case folie:
                return 1.5;
            case brulure:
                return 1.5;
            case gel:
                return 2;
            case peur:
                return 1;
            default :
                return 1;
        }
    }
}
