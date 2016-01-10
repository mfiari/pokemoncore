/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.perso.dresseur;

import mfiari.lib.game.personnage.Sexe;
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.core.perso.Titre;
import mfiari.pokemon.core.perso.pokemon.Pokemon;
import mfiari.pokemon.core.type.Type;
import mfiari.pokemon.core.ville.Endroit;

/**
 *
 * @author mike
 */
public class DresseurClassique extends Dresseur {
    
    private static final long serialVersionUID = 354054054064L;
    
    public DresseurClassique () {
        super();
    }
    
    public DresseurClassique (String nom, int numeroID, int positionX, int positionY, Endroit ville, Titre titre, Orientation orientation) {
        super(nom, numeroID, positionX, positionY, ville, titre, orientation);
    }
    
    public DresseurClassique (String nom, int numeroID, int positionX, int positionY, Endroit ville, Titre titre, Orientation orientation, Sexe sexe) {
        super(nom, numeroID, positionX, positionY, ville, titre, orientation, sexe);
    }
    
    public DresseurClassique (String nom, int numeroID, int positionX, int positionY, Endroit ville, Titre titre, int nbPokemon, Orientation orientation) {
        super(nom, numeroID, positionX, positionY, ville, titre, orientation, nbPokemon);
    }
    
    public DresseurClassique (DresseurClassique d) {
        super(d);
    }
    
    public DresseurClassique (DresseurClassique d, boolean changeNumId) {
        super(d, changeNumId);
    }

    @Override
    public void ajouterPokemon(Pokemon pk) {
        pk.setAmour(105);
        this.ajouteStatPokemon(pk);
        if (!this.getEquipe().ajouterPokemon(pk)) {
            this.getPC().ajouterPokemon(pk);
        }
    }
    
    private void ajouteStatPokemon (Pokemon pk) {
        switch (this.getTitre()) {
            case agent_jenny :
                /*if (pk.equals(Pokemons.caninosNiv1)) {
                    pk.getAttributsExp().setAllNiveau(2);
                    pk.getTypeExp().setAllNiveau(2);
                }*/
                break;
            case karateka :
                if (pk.getType1() == Type.combat) {
                    pk.getAttributsExp().setAllNiveau(2);
                    pk.getTypeExp().setAllNiveau(2);
                }
                break;
            case ornithologue :
                if (pk.getType1() == Type.vol) {
                    pk.getAttributsExp().setAllNiveau(2);
                    pk.getTypeExp().setAllNiveau(2);
                }
                break;
        }
    }
    
}