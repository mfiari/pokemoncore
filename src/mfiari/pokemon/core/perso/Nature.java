/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.perso;

import mfiari.pokemon.core.capacite.Attributs;

/**
 *
 * @author mike
 */
public enum Nature {
    
    solo, brave, rigide, mauvais, assure, relaxe, malin, lache, timide, presse, jovial, naif, modeste, doux, discret, foufou, calme, gentil, 
    malpoli, prudent, bizarre, docile, hardi, pudique, serieux;
    
    public int getBonus (Attributs attribut) {
        switch (this) {
            case solo:
            case brave:
            case rigide:
            case mauvais:
                if (attribut == Attributs.att) {
                    return 10;
                }
                break;
            case assure:
            case relaxe:
            case malin:
            case lache:
                if (attribut == Attributs.def) {
                    return 10;
                }
                break;
            case timide:
            case presse:
            case jovial:
            case naif:
                if (attribut == Attributs.vit) {
                    return 10;
                }
                break;
            case modeste:
            case doux:
            case discret:
            case foufou:
                if (attribut == Attributs.attSpe) {
                    return 10;
                }
                break;
            case calme:
            case gentil:
            case malpoli:
            case prudent:
                if (attribut == Attributs.defSpe) {
                    return 10;
                }
                break;
        }
        return 0;
    }
    
    public int getMalus (Attributs attribut) {
        switch (this) {
            case solo:
            case presse:
            case doux:
            case gentil:
                if (attribut == Attributs.def) {
                    return 10;
                }
                break;
            case brave:
            case relaxe:
            case jovial:
            case discret:
                if (attribut == Attributs.vit) {
                    return 10;
                }
                break;
            case rigide:
            case malin:
            case naif:
            case malpoli:
                if (attribut == Attributs.attSpe) {
                    return 10;
                }
                break;
            case mauvais:
            case lache:
            case foufou:
            case prudent:
                if (attribut == Attributs.defSpe) {
                    return 10;
                }
                break;
            case assure:
            case timide:
            case modeste:
            case calme:
                if (attribut == Attributs.att) {
                    return 10;
                }
                break;
        }
        return 0;
    }
    
}
