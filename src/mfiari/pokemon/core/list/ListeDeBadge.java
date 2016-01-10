/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.list;

import java.io.Serializable;
import mfiari.pokemon.core.objet.Badge;

/**
 *
 * @author mike
 */
public class ListeDeBadge implements Serializable {
    
    Badge[] badgeKanto;
    Badge[] badgeLigueOrange;
    Badge[] badgeJohto;
    Badge[] badgeHoenn;
    Badge[] badgeSinnoh;
    
    public ListeDeBadge () {
        
        this.badgeKanto = new Badge[12];
        this.badgeLigueOrange = new Badge[4];
        this.badgeJohto = new Badge[8];
        this.badgeHoenn = new Badge[8];
        this.badgeSinnoh = new Badge[8];
    }
    
    public void ajouterBadge (Badge b) {
        /*if (!this.possedeBadge(b)) {
            if (b.getPays().equals(Endroits.Kanto)) {
                this.ajouterBadgeKanto(b);
            } else if (b.getPays().equals(Endroits.ile_orange)) {
                this.ajouterBadgeLigueOrange(b);
            } else if (b.getPays().equals(Endroits.Jhoto)) {
                this.ajouterBadgeJohto(b);
            } else if (b.getPays().equals(Endroits.Hoenn)) {
                this.ajouterBadgeHoenn(b);
            } else if (b.getPays().equals(Endroits.Sinnoh)) {
                this.ajouterBadgeSinnoh(b);
            }
        }*/
    }
    
    public boolean possedeBadge (Badge b) {
        /*if (b.getPays().equals(Endroits.Kanto) && this.aBadgeKanto(b)) {
            return true;
        }
        if (b.getPays().equals(Endroits.ile_orange) && this.aBadgeLigueOrange(b)) {
            return true;
        }
        if (b.getPays().equals(Endroits.Jhoto) && this.aBadgeJohto(b)) {
            return true;
        }
        if (b.getPays().equals(Endroits.Hoenn) && this.aBadgeHoenn(b)) {
            return true;
        }
        if (b.getPays().equals(Endroits.Sinnoh) && this.aBadgeSinnoh(b)) {
            return true;
        }*/
        return false;
    }
    
    public int getNbBadge () {
        return this.getNbBadgeKanto() + this.getNbBadgeLigueOrange() + this.getNbBadgeJohto() + this.getNbBadgeHoenn() + this.getNbBadgeSinnoh();
    }
    
    public boolean ajouterBadgeKanto (Badge b) {
        for (int i = 0 ; i < this.badgeKanto.length ; i++) {
            if (this.badgeKanto[i] == null) {
                this.badgeKanto[i] = b;
                return true;
            }
        }
        return false;
    }
    
    public int getSizeBadgeKanto () {
        return this.badgeKanto.length;
    }
    
    public int getNbBadgeKanto () {
        int qte = 0;
        for (Badge badgeKanto1 : this.badgeKanto) {
            if (badgeKanto1 != null) {
                qte++;
            }
        }
        return qte;
    }
    
    public boolean ajouterBadgeLigueOrange (Badge b) {
        for (int i = 0 ; i < this.badgeLigueOrange.length ; i++) {
            if (this.badgeLigueOrange[i] == null) {
                this.badgeLigueOrange[i] = b;
                return true;
            }
        }
        return false;
    }
    
    public int getSizeBadgeLigueOrange () {
        return this.badgeLigueOrange.length;
    }
    
    public int getNbBadgeLigueOrange () {
        int qte = 0;
        for (Badge badgeLigueOrange1 : this.badgeLigueOrange) {
            if (badgeLigueOrange1 != null) {
                qte++;
            }
        }
        return qte;
    }
    
    public boolean ajouterBadgeJohto (Badge b) {
        for (int i = 0 ; i < this.badgeJohto.length ; i++) {
            if (this.badgeJohto[i] == null) {
                this.badgeJohto[i] = b;
                return true;
            }
        }
        return false;
    }
    
    public int getSizeBadgeJohto () {
        return this.badgeJohto.length;
    }
    
    public int getNbBadgeJohto () {
        int qte = 0;
        for (Badge badgeJohto1 : this.badgeJohto) {
            if (badgeJohto1 != null) {
                qte++;
            }
        }
        return qte;
    }
    
    public boolean ajouterBadgeHoenn (Badge b) {
        for (int i = 0 ; i < this.badgeHoenn.length ; i++) {
            if (this.badgeHoenn[i] == null) {
                this.badgeHoenn[i] = b;
                return true;
            }
        }
        return false;
    }
    
    public int getSizeBadgeHoenn () {
        return this.badgeHoenn.length;
    }
    
    public int getNbBadgeHoenn () {
        int qte = 0;
        for (Badge badgeHoenn1 : this.badgeHoenn) {
            if (badgeHoenn1 != null) {
                qte++;
            }
        }
        return qte;
    }
    
    public boolean ajouterBadgeSinnoh (Badge b) {
        for (int i = 0 ; i < this.badgeSinnoh.length ; i++) {
            if (this.badgeSinnoh[i] == null) {
                this.badgeSinnoh[i] = b;
                return true;
            }
        }
        return false;
    }
    
    public int getSizeBadgeSinnoh () {
        return this.badgeSinnoh.length;
    }
    
    public int getNbBadgeSinnoh () {
        int qte = 0;
        for (Badge badgeSinnoh1 : this.badgeSinnoh) {
            if (badgeSinnoh1 != null) {
                qte++;
            }
        }
        return qte;
    }
    
    public Badge getBadgeKanto (int i) {
        return this.badgeKanto[i];
    }
    
    public Badge getBadgeLigueOrange (int i) {
        return this.badgeLigueOrange[i];
    }
    
    public Badge getBadgeJohto (int i) {
        return this.badgeJohto[i];
    }
    
    public Badge getBadgeHoenn (int i) {
        return this.badgeHoenn[i];
    }
    
    public Badge getBadgeSinnoh (int i) {
        return this.badgeSinnoh[i];
    }
    
    public boolean aBadgeKanto (Badge b) {
        for (Badge badgeKanto1 : this.badgeKanto) {
            if (badgeKanto1 != null && badgeKanto1.equals(b)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean aBadgeKanto (int i) {
        return this.badgeKanto[i] != null;
    }
    
    public boolean aBadgeLigueOrange (Badge b) {
        for (Badge badgeLigueOrange1 : this.badgeLigueOrange) {
            if (badgeLigueOrange1 != null && badgeLigueOrange1.equals(b)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean aBadgeLigueOrange (int i) {
        return this.badgeLigueOrange[i] != null;
    }
    
    public boolean aBadgeJohto (Badge b) {
        for (Badge badgeJohto1 : this.badgeJohto) {
            if (badgeJohto1 != null && badgeJohto1.equals(b)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean aBadgeJohto (int i) {
        return this.badgeJohto[i] != null;
    }
    
    public boolean aBadgeHoenn (Badge b) {
        for (Badge badgeHoenn1 : this.badgeHoenn) {
            if (badgeHoenn1 != null && badgeHoenn1.equals(b)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean aBadgeHoenn (int i) {
        return this.badgeHoenn[i] != null;
    }
    
    public boolean aBadgeSinnoh (Badge b) {
        for (Badge badgeSinnoh1 : this.badgeSinnoh) {
            if (badgeSinnoh1 != null && badgeSinnoh1.equals(b)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean aBadgeSinnoh (int i) {
        return this.badgeSinnoh[i] != null;
    }
    
}