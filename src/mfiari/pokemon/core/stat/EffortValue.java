/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.stat;

import java.io.Serializable;
import mfiari.pokemon.core.capacite.Attributs;

/**
 *
 * @author mike
 */
public class EffortValue implements Serializable {
    
    private int pv;
    private int att;
    private int def;
    private int attSpe;
    private int defSpe;
    private int vit;
    private final static int EV_MAX = 510;
    private final static int EV_MAX_STAT = 255;

    public EffortValue() {
        this.pv = 0;
        this.att = 0;
        this.def = 0;
        this.attSpe = 0;
        this.defSpe = 0;
        this.vit = 0;
    }
    
    private boolean evMaxAtteint () {
        return EV_MAX == this.pv + this.att + this.def + this.attSpe + this.defSpe + this.vit;
    }
    
    public void set (Attributs attribut, int value) {
        switch (attribut) {
            case att :
                this.att = value;
                break;
            case def :
                this.def = value;
                break;
            case attSpe :
                this.attSpe = value;
                break;
            case defSpe :
                this.defSpe = value;
                break;
            case vit :
                this.vit = value;
                break;
        }
    }
    
    public int get (Attributs attribut) {
        switch (attribut) {
            case att :
                return this.att;
            case def :
                return this.def;
            case attSpe :
                return this.attSpe;
            case defSpe :
                return this.defSpe;
            case vit :
                return this.vit;
            default:
                return 0;
        }
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        if (!this.evMaxAtteint() && (EV_MAX_STAT < this.pv)) {
            this.pv += pv;
        }
    }

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        if (!this.evMaxAtteint() && (EV_MAX_STAT < this.att)) {
            this.att += att;
        }
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        if (!this.evMaxAtteint() && (EV_MAX_STAT < this.def)) {
            this.def += def;
        }
    }

    public int getAttSpe() {
        return attSpe;
    }

    public void setAttSpe(int attSpe) {
        if (!this.evMaxAtteint() && (EV_MAX_STAT < this.attSpe)) {
            this.attSpe += attSpe;
        }
    }

    public int getDefSpe() {
        return defSpe;
    }

    public void setDefSpe(int defSpe) {
        if (!this.evMaxAtteint() && (EV_MAX_STAT < this.defSpe)) {
            this.defSpe += defSpe;
        }
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        if (!this.evMaxAtteint() && (EV_MAX_STAT < this.vit)) {
            this.vit += vit;
        }
    }
    
}
