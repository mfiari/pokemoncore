/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.objet;

import mfiari.lib.game.objet.Objet;

/**
 *
 * @author mike
 */
public class Objet_divers extends Objet {
    
    private String effet1;
    private String effet2;
    
    public Objet_divers() {
        super();
    }

    public Objet_divers(String nom, Type_objet type, String effet1, String effet2, int pv, int pm,
            int force, int def, int magie, int res, int vit, int prec, int agi, int prixAchat,
            int prixVente, String description, int quantite) {

        super(nom, type, pv, pm, force, def, magie, res, vit, prec, agi, prixAchat, prixVente,
                description, quantite);
        this.effet1 = effet1;
        this.effet2 = effet2;
    }
    
    public Objet_divers (Objet_divers od) {
        super(od.getNom(), od.getType(), od.getPv(), od.getPm(), od.getForce(), od.getDef(), od.getMagie(), od.getRes(), od.getVit(), od.getPrec(), 
                od.getAgi(), od.getPrixAchat(), od.getPrixVente(), od.getDescription(), od.getQuantite());
        this.effet1 = od.effet1;
        this.effet2 = od.effet2;
    }

    public String getEffet1() {
        return this.effet1;
    }

    public String getEffet2() {
        return this.effet2;
    }
    
}
