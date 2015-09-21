/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mfiari.pokemon.core.type;

import mfiari.pokemon.core.capacite.Attributs;

/**
 *
 * @author mike
 */
public enum Forme {
    
    normal, shiney, geant, mini;
    
    public int alterStat (Attributs attribut) {
        switch (this) {
            case geant :
                switch (attribut) {
                    case att :
                        return 5;
                    case def :
                        return 5;
                    case attSpe :
                        return 5;
                    case defSpe :
                        return 5;
                    case vit :
                        return -5;
                    case esq :
                        return -5;
                    case prec :
                        return -5;
                }
                break;
            case mini :
                switch (attribut) {
                    case att :
                        return -5;
                    case def :
                        return -5;
                    case attSpe :
                        return -5;
                    case defSpe :
                        return -5;
                    case vit :
                        return 5;
                    case esq :
                        return 5;
                    case prec :
                        return 5;
                }
                break;
            case shiney :
                switch (attribut) {
                    case att :
                        return 5;
                    case def :
                        return 5;
                    case attSpe :
                        return 5;
                    case defSpe :
                        return 5;
                    case vit :
                        return 5;
                    case esq :
                        return 5;
                    case prec :
                        return 5;
                }
                break;
        }
        return 0;
    }
    
}
