/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.perso;

/**
 *
 * @author mike
 */
public enum Titre {
    
    /* Kanto */
    gamin, kinesiste, policeman, ornithologue, scout, montagnard, pokefan, pokemaniac, karateka, fillette, dompteur, medium,
    exorciste, motard, croupier, intello, gentleman, pecheur, jeune_couple, jumelle, canon,
    /* Fin Kanto */
    /* Ile Orange */
    /* Fin Ile Orange */
    /* Johto */
    agent, campeur, pick_nick, ecolier, prof, scientifique, sage, ancien, crache_feu, jongleur, 
    /* Fin Johto */
    /* Hoenn */
    /* Fin Hoenn */
    /* Sinnoh */
    /* Fin Sinnoh */
    DresseurPokemon, champion, conseil4, maitre, rival, topdresseur, k_you, agent_jenny, teamRocket, sbire_rocket, caid_rocket, commandant_rocket;
    
    
    @Override
    public String toString () {
        switch (this) {
            case agent_jenny :
                return "agent_jenny";
            case gamin :
                return "gamin";
            case kinesiste :
                return "kinesiste";
            case policeman :
                return "policeman";
            case DresseurPokemon :
                return "dresseur pokemon";
            case champion :
                return "champion";
            case conseil4 :
                return "conseil 4";
            case maitre :
                return "maitre";
            case rival :
                return "rival";
            case topdresseur :
                return "topdresseur";
            case k_you :
                return "k-you";
            case teamRocket :
                return "team Rocket";
            case sbire_rocket :
                return "sbire rocket";
            case ornithologue :
                return "ornithologue";
            case scout :
                return "scout";
            case fillette :
                return "fillette";
            case pick_nick :
                return "pick nick";
            default :
                return super.toString();
        }
    }
    
    public String getName () {
        switch (this) {
            case gamin :
                return "gamin_combat";
            case kinesiste :
                return "kinesiste_combat";
            case policeman :
                return "policeman_combat";
            case DresseurPokemon :
                return "Dress3";
            case rival :
                return "rival";
            case topdresseur :
                return "topdresseur";
            case k_you :
                return "agent_k-you_combat";
            case teamRocket :
                return "team Rocket";
            case sbire_rocket :
                return "sbire rocket";
            case ornithologue :
                return "ornithologue";
            case scout :
                return "scout_face";
            default :
                return "";
        }
    }
    
}
