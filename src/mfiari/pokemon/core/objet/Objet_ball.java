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
public class Objet_ball extends Objet {
    
    private double bonus;
    
    public Objet_ball(String nom, Type_objet type, int pv, int pm, int force, int def, int magie, int res, 
            int vit, int prec, int agi, int prixAchat, int prixVente, String description, int quantite, double bonus) {
        super(nom, type, pv, pm, force, def, magie, res, vit, prec, agi, prixAchat, prixVente, description, quantite);
        this.bonus = bonus;
    }
    
    public Objet_ball (Objet_ball od) {
        super(od.getNom(), od.getType(), od.getPv(), od.getPm(), od.getForce(), od.getDef(), od.getMagie(), od.getRes(), od.getVit(), od.getPrec(), 
                od.getAgi(), od.getPrixAchat(), od.getPrixVente(), od.getDescription(), od.getQuantite());
        this.bonus = od.bonus;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
}
