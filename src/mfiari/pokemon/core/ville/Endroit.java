/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.ville;

import java.io.Serializable;
import mfiari.lib.game.interfaces.ville.IEndroit;
import mfiari.lib.game.objet.ObjetEndroit;
import mfiari.lib.game.personnage.Personnage;
import mfiari.lib.game.position.Orientation;
import mfiari.lib.game.position.Position;
import mfiari.pokemon.core.perso.dresseur.Dresseur;
import mfiari.pokemon.core.perso.pokemon.Pokemon;

/**
 *
 * @author mike
 */
abstract public class Endroit extends mfiari.lib.game.ville.Endroit<Personnage> implements Serializable, IEndroit {
    
    //private static final long serialVersionUID = 354054054055L;
    
    public Endroit () {
        
    }

    public Endroit (String nom, int positionX, int positionY,int longueur, int largeur) {
        super(nom, positionX, positionY, longueur, largeur);
    }

    public Endroit (String nom, int positionX, int positionY, int longueur, int largeur, Terrain terrain) {
        super(nom, positionX, positionY, longueur, largeur, terrain);
    }

    @Override
    public void ajouterObjetEndroit (ObjetEndroit o) {
        super.ajouterObjetEndroit(o, Environnement.aucun);
    }
    
    public abstract Dresseur aDresseur (int i, int j);
    
    public abstract Dresseur aDresseur (int i, int j, Orientation orientation);

    
    public abstract void ajouterPokemon (Pokemon pk, Environnement environnement, int pourcentage);
    
    public void enleverPokemon (Pokemon pk) {
    }

    public abstract void entrer (Dresseur equipe);

    @Override
    public mfiari.lib.game.interfaces.Environnement aEnvironnement (Position p) {
        mfiari.lib.game.interfaces.Environnement env = super.aEnvironnement(p);
        return env == null ? Environnement.aucun : env;
    }

}