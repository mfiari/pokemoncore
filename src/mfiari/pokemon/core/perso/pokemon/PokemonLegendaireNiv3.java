/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.perso.pokemon;

import mfiari.lib.game.personnage.Stat;
import mfiari.pokemon.core.capacite.Capacite;
import mfiari.pokemon.core.capacite.CapaciteSpe;
import mfiari.pokemon.core.type.Type;
import mfiari.pokemon.core.ville.Endroit;
import mfiari.pokemon.core.ville.Environnement;

/**
 *
 * @author mike
 */
public class PokemonLegendaireNiv3 extends PokemonLegendaire {
    
   protected CapaciteSpe capaciteSpe3;
    
    public PokemonLegendaireNiv3(String nom, int numero, Type type1, Type type2, double taille, double poids, int tauxCapture, 
            double pourcentageMale, int nbPasAvantEclosion, String typePokemon, int pv, int att, int def, int attSpe, int defSpe, int vit, int esq, 
            int prec, int expBase, Stat.CourbeExperience courbeExperience, Capacite cap, String description) {
        super(nom, numero, type1, type2, taille, poids, tauxCapture, pourcentageMale, nbPasAvantEclosion, typePokemon, pv, att, def, attSpe, 
                defSpe, vit, esq, prec, expBase, courbeExperience, cap, description);
    }
    
    public PokemonLegendaireNiv3 (PokemonLegendaireNiv3 pk) {
        super(pk);
        this.capaciteSpe3 = pk.capaciteSpe3;
    }
    
    @Override
    public void ajouterEndroits (Endroit e, int nivMin, int nivMax, Environnement environnement, int pourcentage) {
        for (int i = nivMin ; i<=nivMax ; i++) {
            PokemonLegendaire pk = new PokemonLegendaireNiv3(this);
            pk.changeNiveau(i);
            e.ajouterPokemon(pk, environnement, (pourcentage/(nivMax - nivMin +1)));
        }
        this.getEndroits().ajouterEndroit(e);
    }
}