/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mfiari.pokemon.core.objet;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import mfiari.lib.video.Video;
import mfiari.lib.game.objet.ObjetEndroit;

/**
 *
 * @author mike
 */
public class ObjetEndroitVideo extends ObjetEndroit {
    
    private final Video video;
    protected PropertyChangeSupport pcsControlleurVue = new PropertyChangeSupport(this);
    
    public ObjetEndroitVideo (Type_objet nom, int positionX, int positionY, Video video) {
        super(nom, positionX, positionY);
        this.video = video;
    }
    
    public Video getVideo () {
        return this.video;
    }
    
    public void play () {
        this.pcsControlleurVue.firePropertyChange("playVideo", null, null);
        this.supprimerTousEcouteur();
    }

    public void ajouterEcouteur(PropertyChangeListener ecouteur) {
        this.pcsControlleurVue.addPropertyChangeListener(ecouteur);
    }
    
    public void supprimerTousEcouteur() {
        PropertyChangeListener[] ecouteurs = this.pcsControlleurVue.getPropertyChangeListeners();
        for (int i = 0 ; i < ecouteurs.length ; i++) {
            this.pcsControlleurVue.removePropertyChangeListener(ecouteurs[i]);
        }
    }
    
}
