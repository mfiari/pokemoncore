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
import mfiari.lib.game.position.Orientation;
import mfiari.pokemon.core.perso.Titre;
import mfiari.pokemon.core.perso.dresseur.DresseurClassique;

/**
 *
 * @author mike
 */
public class Dresseur extends Methode {

    private String nom;
    private Titre titre;
    private int numeroID;
    private int positionX;
    private int positionY;
    private Orientation orientation;
    private int argent;

    public Dresseur() {
        super((new ConnexionBD()).getConnexionHSQL("database/pokemon", "sa", ""));
    }
    
    public Dresseur (Connection connection) {
        super(connection);
    }
    
    public mfiari.pokemon.core.perso.dresseur.Dresseur getDresseur (String endroit) {
        mfiari.pokemon.core.perso.dresseur.Dresseur dresseur = null;
        if (this.load(endroit)) {
            if (Titre.champion.equals(this.titre)) {
                dresseur = new DresseurClassique (this.nom, this.numeroID, this.positionX, this.positionY, null, this.titre, this.orientation);
            } else {
                dresseur = new DresseurClassique (this.nom, this.numeroID, this.positionX, this.positionY, null, this.titre, this.orientation);
            }
            dresseur.setArgent(this.argent);
        }
        return dresseur;
    }
    
    public boolean load (String endroit) {
        boolean load = false;
        PreparedStatement prepare = this.prepareStatement("SELECT nom, titre, numero, position_x, position_y, orientation, argent FROM dresseurs where endroit = ? ");
        this.setParameterString(prepare, endroit, 1);
        ResultSet result = this.executePreparedStatement(prepare);
        if (this.aResult(result)) {
            this.nom = this.getStringResultByString(result, "nom");
            this.titre = Titre.valueOf(this.getStringResultByString(result, "titre"));
            this.numeroID = this.getIntResultByString(result, "numero");
            this.positionX = this.getIntResultByString(result, "position_x");
            this.positionY = this.getIntResultByString(result, "position_y");
            this.orientation = Orientation.valueOf(this.getStringResultByString(result, "orientation"));
            this.argent = this.getIntResultByString(result, "argent");
            load = true;
        }
        this.closeResultSet(result);
        return load;
    }

    public void createTable() {
        this.exexuteUpdate("DROP TABLE IF EXISTS dresseurs CASCADE");
        String requete = "CREATE TABLE dresseurs ("
                + "id INT PRIMARY KEY,"
                + "nom VARCHAR(50),"
                + "titre VARCHAR(20),"
                + "numero INT,"
                + "position_x INT,"
                + "position_y INT,"
                + "orientation VARCHAR(10),"
                + "argent INT,"
                + "endroit VARCHAR(50),"
                + ")";
        this.exexuteUpdate(requete);
        this.exexuteUpdate("INSERT INTO dresseurs VALUES (1, 'Dress', 'gamin', 0, 6, 6, 'face', 50, 'ROUTE301')");
    }
    
}