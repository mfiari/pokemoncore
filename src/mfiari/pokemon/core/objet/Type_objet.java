/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.objet;

import mfiari.lib.game.interfaces.TypeObjet;

/**
 *
 * @author mike
 */
public enum Type_objet implements TypeObjet {
    
    /*objet*/
    soin, soin_stat, soin_etat, rare, ball, pierre,
    /*objet passage*/
    porte, escalier_montant, escalier_descendant, chemin,
    /*objet coffre */
    bureau, coffre,
    /*objet observable ou coffre*/
    etagere,
    /* objet observable */
    evier, tele, etagere_gauche_shop, etagere_droite_shop, etagere_mur_shop, vitrine_shop, pc_leo, panneau, panneau_arene, panneau_pokemon, machine1,
    machine2, grande_etagere, table_pc, table_pokemon,
    /*objet classique */
    table, arbre, lit, mur, grand_chene, place, fontaine, haute_herbe, riviere, mer, frigo, plante, herbe, pont, bitume, 
    mur_montagne, mur_montagne_haut, mur_montagne_bas, mur_montagne_droite, mur_montagne_gauche, roche, rail, barriere, bordure, dos_maison,
    train, aquaria, tabouret, pouf, arbuste, vide, rocher,
    /*objet soin*/
    machine_soin, infirmiere_joel,
    /* objet vendeur */
     vendeur_shop;
    
    @Override
    public boolean estPassageDirect () {
        switch (this) {
            case porte :
                return true;
            case escalier_montant :
                return true;
            case escalier_descendant :
                return true;
        }
        return false;
    }

    @Override
    public boolean estBloquant() {
        switch (this) {
            case arbre :
                return true;
            case arbuste :
                return true;
            case barriere :
                return true;
            case dos_maison :
                return true;
            case frigo :
                return true;
            case lit :
                return true;
            case mer :
                return true;
            case mur :
                return true;
            case mur_montagne :
                return true;
            case mur_montagne_haut :
                return true;
            case mur_montagne_bas :
                return true;
            case mur_montagne_gauche :
                return true;
            case mur_montagne_droite :
                return true;
            case riviere :
                return true;
            case table :
                return true;
            case plante :
                return true;
            case panneau :
                return true;
            case panneau_arene :
                return true;
            case panneau_pokemon :
                return true;
            case evier :
                return true;
            case tele :
                return true;
            case etagere :
                return true;
        }
        return false;
    }
    
}
