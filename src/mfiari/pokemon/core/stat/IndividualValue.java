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
public class IndividualValue implements Serializable {
    
    private int pv;
    private int att;
    private int def;
    private int attSpe;
    private int defSpe;
    private int vit;

    public IndividualValue() {
        this.pv = (int) (Math.random() * 31 +1);
        this.att = (int) (Math.random() * 31 +1);
        this.def = (int) (Math.random() * 31 +1);
        this.attSpe = (int) (Math.random() * 31 +1);
        this.defSpe = (int) (Math.random() * 31 +1);
        this.vit = (int) (Math.random() * 31 +1);
    }

    public IndividualValue(int pv, int att, int def, int attSpe, int defSpe, int vit) {
        this.pv = pv;
        this.att = att;
        this.def = def;
        this.attSpe = attSpe;
        this.defSpe = defSpe;
        this.vit = vit;
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
    
    public void setPv (int pv) {
        this.pv = pv;
    }

    public int getPv() {
        return pv;
    }

    public int getAtt() {
        return att;
    }

    public int getDef() {
        return def;
    }

    public int getAttSpe() {
        return attSpe;
    }

    public int getDefSpe() {
        return defSpe;
    }

    public int getVit() {
        return vit;
    }
    
}
