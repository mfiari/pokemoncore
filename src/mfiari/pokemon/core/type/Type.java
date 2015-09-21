/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.type;

/**
 *
 * @author mike
 */
public enum Type implements mfiari.lib.game.interfaces.Type {

    plante, eau, feu, roche, glace, sol, psy, acier, vol, insecte, poison, dragon, tenebres, electrique, combat, spectre,
    normal, tous, aucun;

    public boolean faible(Type type) {
        switch (this) {
            case plante:
                return (type.equals(feu) || type.equals(glace) || type.equals(vol) || type.equals(insecte) || type.equals(poison));
            case eau:
                return (type.equals(plante) || type.equals(electrique));
            case feu:
                return (type.equals(eau) || type.equals(roche) || type.equals(sol));
            case roche:
                return (type.equals(plante) || type.equals(eau) || type.equals(sol) || type.equals(acier) || type.equals(combat));
            case glace:
                return (type.equals(feu) || type.equals(roche) || type.equals(acier) || type.equals(combat));
            case sol:
                return (type.equals(plante) || type.equals(eau) || type.equals(glace));
            case psy:
                return (type.equals(insecte) || type.equals(tenebres) || type.equals(spectre));
            case acier:
                return (type.equals(feu) || type.equals(sol) || type.equals(combat));
            case vol:
                return (type.equals(roche) || type.equals(glace) || type.equals(electrique));
            case insecte:
                return (type.equals(feu) || type.equals(roche) || type.equals(vol));
            case poison:
                return (type.equals(sol) || type.equals(psy));
            case dragon:
                return (type.equals(glace) || type.equals(dragon));
            case tenebres:
                return (type.equals(insecte) || type.equals(combat));
            case electrique:
                return (type.equals(sol));
            case combat:
                return (type.equals(psy) || type.equals(vol));
            case spectre:
                return (type.equals(tenebres) || type.equals(spectre));
            default:
                return (type.equals(combat));
        }
    }

    public boolean fort(Type type) {
        switch (this) {
            case plante:
                return (type.equals(plante) || type.equals(eau) || type.equals(sol) || type.equals(electrique));
            case eau:
                return (type.equals(eau) || type.equals(feu) || type.equals(glace) || type.equals(acier));
            case feu:
                return (type.equals(plante) || type.equals(feu) || type.equals(glace) || type.equals(acier) || type.equals(insecte));
            case roche:
                return (type.equals(feu) || type.equals(vol) || type.equals(poison) || type.equals(normal));
            case glace:
                return (type.equals(glace));
            case sol:
                return (type.equals(roche) || type.equals(poison));
            case psy:
                return (type.equals(combat) || type.equals(psy));
            case acier:
                return (type.equals(plante) || type.equals(roche) || type.equals(glace) || type.equals(psy) || type.equals(acier) || type.equals(vol)
                         || type.equals(insecte) || type.equals(dragon) || type.equals(tenebres) || type.equals(spectre) || type.equals(normal));
            case vol:
                return (type.equals(plante) || type.equals(insecte) || type.equals(combat));
            case insecte:
                return (type.equals(plante) || type.equals(sol) || type.equals(combat));
            case poison:
                return (type.equals(plante) || type.equals(insecte) || type.equals(poison) || type.equals(combat));
            case dragon:
                return (type.equals(plante) || type.equals(eau) || type.equals(feu) || type.equals(electrique));
            case tenebres:
                return (type.equals(tenebres) || type.equals(spectre));
            case electrique:
                return (type.equals(acier) || type.equals(vol) || type.equals(electrique));
            case combat:
                return (type.equals(roche) || type.equals(insecte) || type.equals(tenebres));
            case spectre:
                return (type.equals(insecte) || type.equals(poison));
            default:
                return false;
        }
    }

    public boolean ineficace(Type type) {
        switch (this) {
            case plante:
                return false;
            case eau:
                return false;
            case feu:
                return false;
            case roche:
                return false;
            case glace:
                return false;
            case sol:
                return (type.equals(electrique));
            case psy:
                return false;
            case acier:
                return (type.equals(poison));
            case vol:
                return (type.equals(sol));
            case insecte:
                return false;
            case poison:
                return false;
            case dragon:
                return false;
            case tenebres:
                return (type.equals(psy));
            case electrique:
                return false;
            case combat:
                return false;
            case spectre:
                return (type.equals(combat) || type.equals(normal));
            default:
                return (type.equals(spectre));
        }
    }
}
