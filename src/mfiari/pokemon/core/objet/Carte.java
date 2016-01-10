/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.objet;

import java.io.Serializable;
import mfiari.lib.game.controlleur.ControlleurVue;
import mfiari.lib.game.liste.ListeDEndroit;
import mfiari.lib.game.liste.ListeDeuxDimension;
import mfiari.lib.game.position.Position;
import mfiari.pokemon.core.ville.Endroit;
import mfiari.pokemon.core.ville.Pays;
import mfiari.pokemon.core.ville.Ville;

/**
 *
 * @author mike
 */
public class Carte extends ControlleurVue implements Serializable {
    
    private final ListeDEndroit kanto;
    private final ListeDEndroit johto;
    private final ListeDEndroit hoenn;
    private final ListeDEndroit sinnoh;
    private final ListeDEndroit ile_orange;
    private final ListeDeuxDimension<Endroit, Boolean> endroits_visite;
    private Pays pays;
    private Ville ville;
    private Position p;
    
    
    public Carte () {
        super(false);
        this.kanto = new ListeDEndroit();
        this.johto = new ListeDEndroit();
        this.hoenn = new ListeDEndroit();
        this.sinnoh = new ListeDEndroit();
        this.ile_orange = new ListeDEndroit();
        this.endroits_visite = new ListeDeuxDimension<>();
        this.initCarte();
    }
    
    private void initCarte () {
        /* carte kanto */
        /*this.kanto.ajouterEndroit(Endroits.bourgPalette);
        this.endroits_visite.add(Endroits.bourgPalette, Boolean.FALSE);
        
        /* carte johto */
        /*this.johto.ajouterEndroit(Endroits.bourg_geon);
        this.endroits_visite.add(Endroits.bourg_geon, Boolean.FALSE);
        
        /* carte hoenn */
        /*this.hoenn.ajouterEndroit(Endroits.bourg_en_vol);
        this.endroits_visite.add(Endroits.bourg_en_vol, Boolean.FALSE);
        
        /* carte sinnoh */
        /*this.sinnoh.ajouterEndroit(Endroits.bonaugure);
        this.endroits_visite.add(Endroits.bonaugure, Boolean.FALSE);
        */
        this.p = new Position(1, 1);
    }
    
    public void afficheCarte () {
        this.pcsControlleurVue.firePropertyChange("afficherCarte", null, null);
    }
    
    public Pays getPays () {
        /*return Endroits.Kanto;*/
        return null;
    }
    
    public Position getPosition () {
        return this.p;
    }
    
}