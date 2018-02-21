/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import mfiari.lib.game.connexionBD.ConnexionBD;
import mfiari.lib.game.connexionBD.Methode;
import mfiari.lib.game.personnage.Stat;
import mfiari.pokemon.core.capacite.CapaciteSimple;
import mfiari.pokemon.core.perso.pokemon.PokemonClassique;
import mfiari.pokemon.core.stat.CourbeParabolique;
import mfiari.pokemon.core.type.Attribut;
import mfiari.pokemon.core.type.Type;

/**
 *
 * @author mike
 */
public class Pokemon extends Methode {

    private String nom;
    private int numero;
    private Type type1;
    private Type type2;
    private double taille;
    private double poids;
    private String description;
    private double pourcentageMale;
    private int pvBase;
    private int attBase;
    private int defBase;
    private int attSpeBase;
    private int defSpeBase;
    private int vitBase;
    private int esqBase;
    private int precBase;
    private int tauxCapture;
    private int nbPasAvantEclosion;
    private Stat.CourbeExperience courbeExperience;

    public Pokemon() {
        super((new ConnexionBD()).getConnexionHSQL("database/pokemon", "sa", ""));
    }
    
    public Pokemon (Connection connection) {
        super(connection);
    }
    
    public mfiari.pokemon.core.perso.pokemon.Pokemon getPokemon (int numero) {
        this.load(numero);
        mfiari.pokemon.core.perso.pokemon.Pokemon pk;
        if (this.isPokemonClassique(numero)) {
            pk = new PokemonClassique(this.nom, numero, this.type1, this.type2, this.taille, this.poids, this.tauxCapture, this.pourcentageMale, this.nbPasAvantEclosion, "graine", 
            this.pvBase, this.attBase, this.defBase, this.attSpeBase, this.defSpeBase, this.vitBase, this.esqBase, this.precBase, 64, new CourbeParabolique(), null, 16, null, null, this.description);
        } else {
            pk = new PokemonClassique(this.nom, numero, this.type1, this.type2, this.taille, this.poids, this.tauxCapture, this.pourcentageMale, this.nbPasAvantEclosion, "graine", 
            this.pvBase, this.attBase, this.defBase, this.attSpeBase, this.defSpeBase, this.vitBase, this.esqBase, this.precBase, 64, new CourbeParabolique(), null, 16, null, null, this.description);
        }
        pk.getCap().enleverTousCapacite();
        pk.soin();
        pk.ajouterAttBase(new CapaciteSimple("charge", Type.normal, 35, 95, 35, Attribut.physique));
        return pk;
    }
    
    public void load (int numero) {
        PreparedStatement prepare = this.prepareStatement("SELECT nom, type1, type2, taille, poids, description, pourcentage_male, pv, att, def, att_spe, def_spe, vit, esq, prec, taux_capture, nb_pas_eclosion "
                + "FROM pokemons where numero = ? ");
        this.setParameterInt(prepare, numero, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        if (this.aResult(result)) {
            this.numero = numero;
            this.nom = this.getStringResultByString(result, "nom");
            this.type1 = Type.plante;
            this.type2 = Type.poison;
            this.taille = this.getDoubleResultByString(result, "taille");
            this.poids = this.getDoubleResultByString(result, "taille");
            this.description = this.getStringResultByString(result, "description");
            this.pourcentageMale = this.getDoubleResultByString(result, "pourcentage_male");
            this.pvBase = this.getIntResultByString(result, "pv");
            this.attBase = this.getIntResultByString(result, "att");
            this.defBase = this.getIntResultByString(result, "def");
            this.attSpeBase = this.getIntResultByString(result, "att_spe");
            this.defSpeBase = this.getIntResultByString(result, "def_spe");
            this.vitBase = this.getIntResultByString(result, "vit");
            this.esqBase = this.getIntResultByString(result, "esq");
            this.precBase = this.getIntResultByString(result, "prec");
            this.tauxCapture = this.getIntResultByString(result, "taux_capture");
            this.nbPasAvantEclosion = this.getIntResultByString(result, "nb_pas_eclosion");
        }
        this.closeResultSet(result);
    }

    public void createTable() {
        this.exexuteUpdate("DROP TABLE IF EXISTS pokemons CASCADE");
        String requete = "CREATE TABLE pokemons ("
                + "id INT PRIMARY KEY,"
                + "numero INT,"
                + "nom VARCHAR(50),"
                + "type1 INT,"
                + "type2 INT,"
                + "taille DOUBLE,"
                + "poids DOUBLE,"
                + "description VARCHAR(200),"
                + "pourcentage_male DOUBLE,"
                + "pv INT,"
                + "att INT,"
                + "def INT,"
                + "att_spe INT,"
                + "def_spe INT,"
                + "vit INT,"
                + "esq INT,"
                + "prec INT,"
                + "taux_capture INT,"
                + "nb_pas_eclosion INT"
                + ")";
        this.exexuteUpdate(requete);
        this.exexuteUpdate("INSERT INTO pokemons VALUES (1, 1, 'Bulbizarre', 0, 0, 0.7, 6.9, 'La graine sur le dos de Bulbizarre est une réserve de nutriments.', 87.5, 45, 49, 49, 65, 65, 45, 100, 100, 45, 5120)");
    }
    
    private boolean isPokemonClassique (int numero) {
        return true;
    }
    
}
