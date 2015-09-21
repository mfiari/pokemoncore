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
public class CourbeParabolique implements mfiari.lib.game.personnage.Stat.CourbeExperience, Serializable {

    @Override
    public int calcule(int niv) {
        return (int)(1.2 * Math.pow(niv, 3) - 15 * Math.pow(niv, 2) + 100 * niv - 140);
    }
}