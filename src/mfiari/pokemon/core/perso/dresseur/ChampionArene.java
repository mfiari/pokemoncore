/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.perso.dresseur;

import java.util.ArrayList;
import mfiari.lib.game.position.Orientation;
import mfiari.lib.game.texte.Parole;
import mfiari.pokemon.core.objet.Badge;
import mfiari.pokemon.core.objet.Objet_CT;
import mfiari.pokemon.core.perso.Titre;
import mfiari.pokemon.core.perso.pokemon.Pokemon;
import mfiari.pokemon.core.type.Type;
import mfiari.pokemon.core.ville.Endroit;

/**
 *
 * @author mike
 */
public class ChampionArene extends Dresseur {
    
    private Badge badge;
    private Objet_CT ct;
    private ArrayList<Parole> parolesApresCombat;
    
    public ChampionArene () {
        super();
        this.badge = null;
        this.ct = null;
    }
    
    public ChampionArene (String nom, int numeroID, int positionX, int positionY, Endroit ville, Badge b, Orientation orientation, Objet_CT ct) {
        super(nom, numeroID, positionX, positionY, ville, Titre.champion, orientation);
        this.badge = b;
        this.ct = ct;
        this.parolesApresCombat = new ArrayList<>();
        this.mobile = false;
    }
    
    public ChampionArene (ChampionArene champion) {
        super(champion);
        this.badge = champion.badge;
        this.parolesApresCombat = new ArrayList<>();
    }
    
    public ChampionArene (ChampionArene champion, boolean changeNumId) {
        super(champion, changeNumId);
        this.badge = champion.badge;
        this.parolesApresCombat = new ArrayList<>();
    }

    @Override
    public void ajouterPokemon(Pokemon pk) {
        pk.setAmour(400);
        pk.getAttributsExp().setAllNiveau(2);
        for (Type type : Type.values()) {
            if (type == pk.getType1()) {
                pk.getTypeExp().setNiveauAttByType(4, type);
                pk.getTypeExp().setNiveauDefByType(4, type);
            } else if (type == pk.getType2()) {
                pk.getTypeExp().setNiveauAttByType(3, type);
                pk.getTypeExp().setNiveauDefByType(3, type);
            } else if (pk.estTresFaible(type)) {
                pk.getTypeExp().setNiveauAttByType(1, type);
                pk.getTypeExp().setNiveauDefByType(4, type);
            } else if (pk.estFaible(type)) {
                pk.getTypeExp().setNiveauAttByType(2, type);
                pk.getTypeExp().setNiveauDefByType(3, type);
            } else {
                pk.getTypeExp().setNiveauAttByType(2, type);
                pk.getTypeExp().setNiveauDefByType(2, type);
            }
        }
        for (int i = 0 ; i < pk.getCap().nbCapacite() ; i++) {
            if (pk.getCap().getCapacite(i) != null) {
                if (pk.getCap().getCapacite(i).getType() == pk.getType1()) {
                    pk.getCap().getCapacite(i).setNiv(4);
                } else if (pk.getCap().getCapacite(i).getType() == pk.getType2()) {
                    pk.getCap().getCapacite(i).setNiv(3);
                } else {
                    pk.getCap().getCapacite(i).setNiv(2);
                }
            }
        }
        this.getEquipe().ajouterPokemon(pk);
    }

    public Badge getBadge() {
        return this.badge;
    }

    public void setBadge(Badge badge) {
        this.badge = badge;
    }
    
    public Objet_CT getCT () {
        return this.ct;
    }

    public void ajouterParoleApresCombat(String p) {
        this.parolesApresCombat.add(new Parole(p));
    }

    public void ajouterParoleApresCombat(Parole p) {
        this.parolesApresCombat.add(p);
    }

    public void supprimerParoleApresCombat() {
        for (int j = 0; j < this.parolesApresCombat.size(); j++) {
            this.parolesApresCombat.remove(j);
        }
    }

    public String ParlerApresCombat() {
        String parole = "";
        if (!this.parolesApresCombat.isEmpty() && this.indiceParole < this.parolesApresCombat.size()) {
            parole = this.getNom() + ": " + this.parolesApresCombat.get(this.indiceParole).toString();
            this.indiceParole++;
        } else {
            this.indiceParole = 0;
        }
        return parole;
    }
    
}