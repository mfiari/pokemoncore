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
                + "numero INT PRIMARY KEY,"
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
        this.exexuteUpdate("INSERT INTO pokemons VALUES (1, 'Bulbizarre', 0, 0, 0.7, 6.9, 'La graine sur le dos de Bulbizarre est une réserve de nutriments.', 87.5, 45, 49, 49, 65, 65, 45, 100, 100, 45, 5120)");
    }
    
    public void save () {
        if (this.exists()) {
            this.update();
        } else {
            this.insert();
        }
    }
    
    private boolean exists () {
        PreparedStatement prepare = this.prepareStatement("SELECT numero FROM pokemons where numero = ?");
        this.setParameterInt(prepare, this.numero, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        return this.aResult(result);
    }
    
    private boolean insert () {
        PreparedStatement prepare = this.prepareStatement("insert into pokemons values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        this.setParameterInt(prepare, this.numero, 1);
        this.setParameterString(prepare, this.nom, 2);
        this.setParameterInt(prepare, 0, 3);
        this.setParameterInt(prepare, 0, 4);
        this.setParameterDouble(prepare, this.taille, 5);
        this.setParameterDouble(prepare, this.poids, 6);
        this.setParameterString(prepare, this.description, 7);
        this.setParameterDouble(prepare, this.pourcentageMale, 8);
        this.setParameterInt(prepare, this.pvBase, 9);
        this.setParameterInt(prepare, this.attBase, 10);
        this.setParameterInt(prepare, this.defBase, 11);
        this.setParameterInt(prepare, this.attSpeBase, 12);
        this.setParameterInt(prepare, this.defSpeBase, 13);
        this.setParameterInt(prepare, this.vitBase, 14);
        this.setParameterInt(prepare, this.esqBase, 15);
        this.setParameterInt(prepare, this.precBase, 16);
        this.setParameterInt(prepare, this.tauxCapture, 17);
        this.setParameterInt(prepare, this.nbPasAvantEclosion, 18);
        this.executeUpdatePreparedStatement(prepare);
        return true;
    }
    
    private boolean update () {
        PreparedStatement prepare = this.prepareStatement("UPDATE pokemons set nom = ?, type1 = ?, type2 = ?, taille = ?, poids = ?, description = ?, pourcentage_male = ?, "
                + "pv = ?, att = ?, def = ?, att_spe = ?, def_spe = ?, vit = ?, esq = ?, prec = ?, taux_capture = ?, nb_pas_eclosion = ? where numero = ?");
        this.setParameterString(prepare, this.nom, 1);
        this.setParameterInt(prepare, 0, 2);
        this.setParameterInt(prepare, 0, 3);
        this.setParameterDouble(prepare, this.taille, 4);
        this.setParameterDouble(prepare, this.poids, 5);
        this.setParameterString(prepare, this.description, 6);
        this.setParameterDouble(prepare, this.pourcentageMale, 7);
        this.setParameterInt(prepare, this.pvBase, 8);
        this.setParameterInt(prepare, this.attBase, 9);
        this.setParameterInt(prepare, this.defBase, 10);
        this.setParameterInt(prepare, this.attSpeBase, 11);
        this.setParameterInt(prepare, this.defSpeBase, 12);
        this.setParameterInt(prepare, this.vitBase, 13);
        this.setParameterInt(prepare, this.esqBase, 14);
        this.setParameterInt(prepare, this.precBase, 15);
        this.setParameterInt(prepare, this.tauxCapture, 16);
        this.setParameterInt(prepare, this.nbPasAvantEclosion, 17);
        this.setParameterInt(prepare, this.numero, 18);
        this.executeUpdatePreparedStatement(prepare);
        return true;
    }
    
    private boolean isPokemonClassique (int numero) {
        return true;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Type getType1() {
        return type1;
    }

    public void setType1(Type type1) {
        this.type1 = type1;
    }

    public Type getType2() {
        return type2;
    }

    public void setType2(Type type2) {
        this.type2 = type2;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPourcentageMale() {
        return pourcentageMale;
    }

    public void setPourcentageMale(double pourcentageMale) {
        this.pourcentageMale = pourcentageMale;
    }

    public int getPvBase() {
        return pvBase;
    }

    public void setPvBase(int pvBase) {
        this.pvBase = pvBase;
    }

    public int getAttBase() {
        return attBase;
    }

    public void setAttBase(int attBase) {
        this.attBase = attBase;
    }

    public int getDefBase() {
        return defBase;
    }

    public void setDefBase(int defBase) {
        this.defBase = defBase;
    }

    public int getAttSpeBase() {
        return attSpeBase;
    }

    public void setAttSpeBase(int attSpeBase) {
        this.attSpeBase = attSpeBase;
    }

    public int getDefSpeBase() {
        return defSpeBase;
    }

    public void setDefSpeBase(int defSpeBase) {
        this.defSpeBase = defSpeBase;
    }

    public int getVitBase() {
        return vitBase;
    }

    public void setVitBase(int vitBase) {
        this.vitBase = vitBase;
    }

    public int getEsqBase() {
        return esqBase;
    }

    public void setEsqBase(int esqBase) {
        this.esqBase = esqBase;
    }

    public int getPrecBase() {
        return precBase;
    }

    public void setPrecBase(int precBase) {
        this.precBase = precBase;
    }

    public int getTauxCapture() {
        return tauxCapture;
    }

    public void setTauxCapture(int tauxCapture) {
        this.tauxCapture = tauxCapture;
    }

    public int getNbPasAvantEclosion() {
        return nbPasAvantEclosion;
    }

    public void setNbPasAvantEclosion(int nbPasAvantEclosion) {
        this.nbPasAvantEclosion = nbPasAvantEclosion;
    }

    public Stat.CourbeExperience getCourbeExperience() {
        return courbeExperience;
    }

    public void setCourbeExperience(Stat.CourbeExperience courbeExperience) {
        this.courbeExperience = courbeExperience;
    }
    
    
    
}
