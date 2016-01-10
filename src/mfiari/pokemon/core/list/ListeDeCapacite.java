/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.list;

import java.io.Serializable;
import java.util.ArrayList;
import mfiari.pokemon.core.capacite.Capacite;

/**
 *
 * @author mike
 */
public class ListeDeCapacite implements Serializable {
    
    private ArrayList<Capacite> listeDeCapacite;
    private Capacite[] capacites;

    public ListeDeCapacite() {
        this.listeDeCapacite = new ArrayList<>();
        this.capacites = new Capacite[6];
        for (int i =0 ; i< 6 ; i++) {
            this.capacites[i] = null;
        }
    }
    
    public ListeDeCapacite(ListeDeCapacite cap) {
        this();
        for (int i = 0; i< cap.size() ; i++) {
            this.listeDeCapacite.add(cap.getListeDeCapacite(i));
        }
        for (int i = 0 ; i< cap.nbCapacite() ; i++) {
            this.capacites[i] = cap.getCapacite(i);
        }
    }

    public void ajoutCapacite(Capacite nom) {
        this.listeDeCapacite.add(nom);
        int i =0;
        while(i < 6 && this.capacites[i] != null) {
            i++;
        }
        if (i < 6) {
            this.capacites[i] = nom;
        }
    }
    
    public void ajoutListeCapacite(Capacite nom) {
        this.listeDeCapacite.add(nom);
    }

    public void remplaceCapacite(Capacite nom, int i) {
        if (i >=0 && i < this.capacites.length) {
            this.capacites[i] = nom;
        }
    }

    public void enleverCapacite(int num) {
        if (num >=0 && num < this.capacites.length) {
            this.capacites[num] = null;
        }
    }

    public void enleverTousCapacite() {
        for (int i = 0 ; i < this.capacites.length ; i++) {
            this.capacites[i] = null;
        }
        for (int i = 0 ; i < this.listeDeCapacite.size() ; i++) {
            this.listeDeCapacite.remove(i);
        }
    }

    public int size() {
        return this.listeDeCapacite.size();
    }
    
    public int nbCapacite() {
        int nbCap=0;
        for (Capacite capacite : this.capacites) {
            if (capacite != null) {
                nbCap++;
            }
        }
        return nbCap;
    }

    public Capacite getCapacite(int i) {
        if (i >=0 && i < this.capacites.length) {
            return this.capacites[i];
        }
        return null;
    }
    
    public Capacite getListeDeCapacite(int i) {
        if (i >=0 && i < this.listeDeCapacite.size()) {
            return this.listeDeCapacite.get(i);
        }
        return null;
    }
    
    public Capacite getCapacite(String nom) {
        for (Capacite capacite : this.capacites) {
            if (capacite != null && capacite.getNom().equals(nom)) {
                return capacite;
            }
        }
        return null;
    }

    public Capacite getListeDeCapacite(String nom) {
        for (Capacite listeDeCapacite1 : this.listeDeCapacite) {
            if (listeDeCapacite1.getNom().equals(nom)) {
                return listeDeCapacite1;
            }
        }
        return null;
    }
    
    public boolean contains (Capacite nom) {
        for (Capacite capacite : this.capacites) {
            if (capacite != null && capacite.equals(nom)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean estRempli () {
        return this.nbCapacite() == this.capacites.length;
    }
    
}