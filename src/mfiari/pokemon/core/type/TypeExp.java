/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.type;

import java.io.Serializable;
import java.util.EnumMap;
import java.util.Map;
import mfiari.pokemon.core.capacite.Capacite;

/**
 *
 * @author mike
 */
public class TypeExp implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private final Map<Type, Integer> typeAtt_niv;
    private final Map<Type, Integer> typeAtt_exp;
    private final Map<Type, Integer> typeDef_niv;
    private final Map<Type, Integer> typeDef_exp;
    private final int tableauExpParNiveau[];
    
    public TypeExp () {
        this.typeAtt_niv = new EnumMap<>(Type.class);
        for (Type value : Type.values()) {
            this.typeAtt_niv.put(value, 1);
        }
        this.typeAtt_exp = new EnumMap<>(Type.class);
        for (Type value : Type.values()) {
            this.typeAtt_exp.put(value, 0);
        }
        this.typeDef_niv = new EnumMap<>(Type.class);
        for (Type value : Type.values()) {
            this.typeDef_niv.put(value, 1);
        }
        this.typeDef_exp = new EnumMap<>(Type.class);
        for (Type value : Type.values()) {
            this.typeDef_exp.put(value, 0);
        }
        this.tableauExpParNiveau = new int[5];
        this.tableauExpParNiveau[0] = 100;
        this.tableauExpParNiveau[1] = 300;
        this.tableauExpParNiveau[2] = 500;
        this.tableauExpParNiveau[3] = 1000;
        this.tableauExpParNiveau[4] = 3000;
    }
    
    public TypeExp (TypeExp typeExp) {
        this.typeAtt_niv = new EnumMap<>(Type.class);
        for (Type value : Type.values()) {
            this.typeAtt_niv.put(value, typeExp.typeAtt_niv.get(value));
        }
        this.typeAtt_exp = new EnumMap<>(Type.class);
        for (Type value : Type.values()) {
            this.typeAtt_exp.put(value, typeExp.typeAtt_exp.get(value));
        }
        this.typeDef_niv = new EnumMap<>(Type.class);
        for (Type value : Type.values()) {
            this.typeDef_niv.put(value, typeExp.typeDef_niv.get(value));
        }
        this.typeDef_exp = new EnumMap<>(Type.class);
        for (Type value : Type.values()) {
            this.typeDef_exp.put(value, typeExp.typeDef_exp.get(value));
        }
        this.tableauExpParNiveau = new int[5];
        this.tableauExpParNiveau[0] = 50;
        this.tableauExpParNiveau[1] = 100;
        this.tableauExpParNiveau[2] = 150;
        this.tableauExpParNiveau[3] = 200;
        this.tableauExpParNiveau[4] = 300;
    }
    
    public int getExpAttParType (Type type) {
        return this.typeAtt_exp.get(type);
    }
    
    public int getNiveauAttParType (Type type) {
        return this.typeAtt_niv.get(type);
    }
    
    public int getExpDefParType (Type type) {
        return this.typeDef_exp.get(type);
    }
    
    public int getNiveauDefParType (Type type) {
        return this.typeDef_niv.get(type);
    }
    
    public void utiliseCap (Capacite cap) {
        int exp = this.typeAtt_exp.get(cap.getType());
        exp +=1;
        this.typeAtt_exp.put(cap.getType(), exp);
        this.verifieTypeAttMonteDeNiveau(cap.getType());
    }
    
    public void recoitCap (Capacite cap) {
        int exp = this.typeDef_exp.get(cap.getType());
        exp +=1;
        this.typeDef_exp.put(cap.getType(), exp);
        this.verifieTypeDefMonteDeNiveau(cap.getType());
    }
    
    private void verifieTypeAttMonteDeNiveau (Type type) {
        if (this.typeAtt_niv.get(type) < this.tableauExpParNiveau.length) {
            if (this.tableauExpParNiveau[this.typeAtt_niv.get(type) -1] == this.typeAtt_exp.get(type)) {
                Integer niv = this.typeAtt_niv.get(type);
                niv += 1;
                this.typeAtt_niv.put(type, niv);
                this.typeAtt_exp.put(type, 0);
            }
        }
    }
    
    private void verifieTypeDefMonteDeNiveau (Type type) {
        if (this.typeDef_niv.get(type) < this.tableauExpParNiveau.length) {
            if (this.tableauExpParNiveau[this.typeDef_niv.get(type) -1] == this.typeDef_exp.get(type)) {
                Integer niv = this.typeDef_niv.get(type);
                niv += 1;
                this.typeDef_niv.put(type, niv);
                this.typeDef_exp.put(type, 0);
            }
        }
    }
    
    public void setNiveauAttByType (int niv, Type type) {
        this.typeAtt_niv.put(type, niv);
    }
    
    public void setNiveauDefByType (int niv, Type type) {
        this.typeDef_niv.put(type, niv);
    }
    
    public void setExpAttByType (int exp, Type type) {
        this.typeAtt_exp.put(type, exp);
    }
    
    public void setExpDefByType (int exp, Type type) {
        this.typeDef_exp.put(type, exp);
    }
    
    public void setAllNiveau (int niv) {
        for (Type value : Type.values()) {
            this.typeAtt_niv.put(value, niv);
            this.typeDef_niv.put(value, niv);
        }
    }
    
    public Type getType (int i) {
        return Type.values()[i];
    }
    
    public int size () {
        return this.typeAtt_exp.size();
    }
    
}