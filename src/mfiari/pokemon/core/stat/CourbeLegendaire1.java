/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mfiari.pokemon.core.stat;

import java.io.Serializable;

/**
 *
 * @author mike
 */
public class CourbeLegendaire1 implements mfiari.lib.game.personnage.Stat.CourbeExperience, Serializable {

    @Override
    public int calcule(int niv) {
        CourbeRapide courbeRapide = new CourbeRapide();
        return courbeRapide.calcule(niv) *2;
    }
}
