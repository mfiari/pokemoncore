/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.perso.pokemon;

import java.util.Map;
import mfiari.lib.game.liste.ListeDEndroit;
import mfiari.lib.game.objet.Objet;
import mfiari.lib.game.personnage.Sexe;
import mfiari.pokemon.core.capacite.Attributs;
import mfiari.pokemon.core.capacite.AttributsExp;
import mfiari.pokemon.core.capacite.Capacite;
import mfiari.pokemon.core.capacite.CapaciteSoin;
import mfiari.pokemon.core.capacite.CapaciteSpe;
import mfiari.pokemon.core.capacite.Etat;
import mfiari.pokemon.core.list.ListeDeCapacite;
import mfiari.pokemon.core.perso.Nature;
import mfiari.pokemon.core.stat.EffortValue;
import mfiari.pokemon.core.stat.IndividualValue;
import mfiari.pokemon.core.type.Forme;
import mfiari.pokemon.core.type.Type;
import mfiari.pokemon.core.type.TypeExp;
import mfiari.pokemon.core.ville.Endroit;
import mfiari.pokemon.core.ville.Environnement;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mike
 */
public class PokemonTest {
    
    public PokemonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTauxCapture method, of class Pokemon.
     */
    @Test
    public void testGetTauxCapture() {
        System.out.println("getTauxCapture");
        Pokemon instance = null;
        int expResult = 0;
        int result = instance.getTauxCapture();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTauxCapture method, of class Pokemon.
     */
    @Test
    public void testSetTauxCapture() {
        System.out.println("setTauxCapture");
        int tauxCapture = 0;
        Pokemon instance = null;
        instance.setTauxCapture(tauxCapture);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNiveau method, of class Pokemon.
     */
    @Test
    public void testGetNiveau() {
        System.out.println("getNiveau");
        Pokemon instance = null;
        int expResult = 0;
        int result = instance.getNiveau();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNiveau method, of class Pokemon.
     */
    @Test
    public void testSetNiveau() {
        System.out.println("setNiveau");
        int niveau = 0;
        Pokemon instance = null;
        instance.setNiveau(niveau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasSexe method, of class Pokemon.
     */
    @Test
    public void testHasSexe() {
        System.out.println("hasSexe");
        Pokemon instance = null;
        boolean expResult = false;
        boolean result = instance.hasSexe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPourcentageMale method, of class Pokemon.
     */
    @Test
    public void testGetPourcentageMale() {
        System.out.println("getPourcentageMale");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getPourcentageMale();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPourcentageMale method, of class Pokemon.
     */
    @Test
    public void testSetPourcentageMale() {
        System.out.println("setPourcentageMale");
        int pourcentageMale = 0;
        Pokemon instance = null;
        instance.setPourcentageMale(pourcentageMale);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeNiveau method, of class Pokemon.
     */
    @Test
    public void testChangeNiveau() {
        System.out.println("changeNiveau");
        int niveau = 0;
        Pokemon instance = null;
        instance.changeNiveau(niveau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nivSuiv method, of class Pokemon.
     */
    @Test
    public void testNivSuiv() {
        System.out.println("nivSuiv");
        Pokemon instance = null;
        instance.nivSuiv();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apprendCapacite method, of class Pokemon.
     */
    @Test
    public void testApprendCapacite() {
        System.out.println("apprendCapacite");
        int niveau = 0;
        Pokemon instance = null;
        boolean expResult = false;
        boolean result = instance.apprendCapacite(niveau);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Pokemon.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Pokemon instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Pokemon.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Pokemon instance = null;
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurnom method, of class Pokemon.
     */
    @Test
    public void testGetSurnom() {
        System.out.println("getSurnom");
        Pokemon instance = null;
        String expResult = "";
        String result = instance.getSurnom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurnom method, of class Pokemon.
     */
    @Test
    public void testSetSurnom() {
        System.out.println("setSurnom");
        String surnom = "";
        Pokemon instance = null;
        instance.setSurnom(surnom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType1 method, of class Pokemon.
     */
    @Test
    public void testGetType1() {
        System.out.println("getType1");
        Pokemon instance = null;
        Type expResult = null;
        Type result = instance.getType1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType1 method, of class Pokemon.
     */
    @Test
    public void testSetType1() {
        System.out.println("setType1");
        Type type1 = null;
        Pokemon instance = null;
        instance.setType1(type1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType2 method, of class Pokemon.
     */
    @Test
    public void testGetType2() {
        System.out.println("getType2");
        Pokemon instance = null;
        Type expResult = null;
        Type result = instance.getType2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType2 method, of class Pokemon.
     */
    @Test
    public void testSetType2() {
        System.out.println("setType2");
        Type type2 = null;
        Pokemon instance = null;
        instance.setType2(type2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Pokemon.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Pokemon instance = null;
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Pokemon.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Pokemon instance = null;
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroID method, of class Pokemon.
     */
    @Test
    public void testGetNumeroID() {
        System.out.println("getNumeroID");
        Pokemon instance = null;
        int expResult = 0;
        int result = instance.getNumeroID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumeroID method, of class Pokemon.
     */
    @Test
    public void testSetNumeroID() {
        System.out.println("setNumeroID");
        int numeroID = 0;
        Pokemon instance = null;
        instance.setNumeroID(numeroID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTypePokemon method, of class Pokemon.
     */
    @Test
    public void testGetTypePokemon() {
        System.out.println("getTypePokemon");
        Pokemon instance = null;
        String expResult = "";
        String result = instance.getTypePokemon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaille method, of class Pokemon.
     */
    @Test
    public void testGetTaille() {
        System.out.println("getTaille");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getTaille();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoids method, of class Pokemon.
     */
    @Test
    public void testGetPoids() {
        System.out.println("getPoids");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getPoids();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Pokemon.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Pokemon instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNature method, of class Pokemon.
     */
    @Test
    public void testGetNature() {
        System.out.println("getNature");
        Pokemon instance = null;
        Nature expResult = null;
        Nature result = instance.getNature();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNature method, of class Pokemon.
     */
    @Test
    public void testSetNature() {
        System.out.println("setNature");
        Nature nature = null;
        Pokemon instance = null;
        instance.setNature(nature);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbPasAvantEclosion method, of class Pokemon.
     */
    @Test
    public void testGetNbPasAvantEclosion() {
        System.out.println("getNbPasAvantEclosion");
        Pokemon instance = null;
        int expResult = 0;
        int result = instance.getNbPasAvantEclosion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShiney method, of class Pokemon.
     */
    @Test
    public void testIsShiney() {
        System.out.println("isShiney");
        Pokemon instance = null;
        boolean expResult = false;
        boolean result = instance.isShiney();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMini method, of class Pokemon.
     */
    @Test
    public void testIsMini() {
        System.out.println("isMini");
        Pokemon instance = null;
        boolean expResult = false;
        boolean result = instance.isMini();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGeant method, of class Pokemon.
     */
    @Test
    public void testIsGeant() {
        System.out.println("isGeant");
        Pokemon instance = null;
        boolean expResult = false;
        boolean result = instance.isGeant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getForme method, of class Pokemon.
     */
    @Test
    public void testGetForme() {
        System.out.println("getForme");
        Pokemon instance = null;
        Forme expResult = null;
        Forme result = instance.getForme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setForme method, of class Pokemon.
     */
    @Test
    public void testSetForme() {
        System.out.println("setForme");
        Forme forme = null;
        Pokemon instance = null;
        instance.setForme(forme);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPv method, of class Pokemon.
     */
    @Test
    public void testGetPv() {
        System.out.println("getPv");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getPv();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mettreKO method, of class Pokemon.
     */
    @Test
    public void testMettreKO() {
        System.out.println("mettreKO");
        Pokemon instance = null;
        instance.mettreKO();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPvMax method, of class Pokemon.
     */
    @Test
    public void testGetPvMax() {
        System.out.println("getPvMax");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getPvMax();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmour method, of class Pokemon.
     */
    @Test
    public void testGetAmour() {
        System.out.println("getAmour");
        Pokemon instance = null;
        int expResult = 0;
        int result = instance.getAmour();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmour method, of class Pokemon.
     */
    @Test
    public void testSetAmour() {
        System.out.println("setAmour");
        int amour = 0;
        Pokemon instance = null;
        instance.setAmour(amour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAtt method, of class Pokemon.
     */
    @Test
    public void testGetAtt() {
        System.out.println("getAtt");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getAtt();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAtt method, of class Pokemon.
     */
    @Test
    public void testSetAtt() {
        System.out.println("setAtt");
        double att = 0.0;
        Pokemon instance = null;
        instance.setAtt(att);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAttInitial method, of class Pokemon.
     */
    @Test
    public void testGetAttInitial() {
        System.out.println("getAttInitial");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getAttInitial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAttSpe method, of class Pokemon.
     */
    @Test
    public void testGetAttSpe() {
        System.out.println("getAttSpe");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getAttSpe();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAttSpe method, of class Pokemon.
     */
    @Test
    public void testSetAttSpe() {
        System.out.println("setAttSpe");
        double attSpe = 0.0;
        Pokemon instance = null;
        instance.setAttSpe(attSpe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAttSpeInitial method, of class Pokemon.
     */
    @Test
    public void testGetAttSpeInitial() {
        System.out.println("getAttSpeInitial");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getAttSpeInitial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDef method, of class Pokemon.
     */
    @Test
    public void testGetDef() {
        System.out.println("getDef");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getDef();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDef method, of class Pokemon.
     */
    @Test
    public void testSetDef() {
        System.out.println("setDef");
        double def = 0.0;
        Pokemon instance = null;
        instance.setDef(def);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefInitial method, of class Pokemon.
     */
    @Test
    public void testGetDefInitial() {
        System.out.println("getDefInitial");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getDefInitial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefSpe method, of class Pokemon.
     */
    @Test
    public void testGetDefSpe() {
        System.out.println("getDefSpe");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getDefSpe();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDefSpe method, of class Pokemon.
     */
    @Test
    public void testSetDefSpe() {
        System.out.println("setDefSpe");
        double defSpe = 0.0;
        Pokemon instance = null;
        instance.setDefSpe(defSpe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDefSpeInitial method, of class Pokemon.
     */
    @Test
    public void testGetDefSpeInitial() {
        System.out.println("getDefSpeInitial");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getDefSpeInitial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEsq method, of class Pokemon.
     */
    @Test
    public void testGetEsq() {
        System.out.println("getEsq");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getEsq();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEsq method, of class Pokemon.
     */
    @Test
    public void testSetEsq() {
        System.out.println("setEsq");
        double esq = 0.0;
        Pokemon instance = null;
        instance.setEsq(esq);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEsqInitial method, of class Pokemon.
     */
    @Test
    public void testGetEsqInitial() {
        System.out.println("getEsqInitial");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getEsqInitial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrec method, of class Pokemon.
     */
    @Test
    public void testGetPrec() {
        System.out.println("getPrec");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getPrec();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrec method, of class Pokemon.
     */
    @Test
    public void testSetPrec() {
        System.out.println("setPrec");
        double prec = 0.0;
        Pokemon instance = null;
        instance.setPrec(prec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecInitial method, of class Pokemon.
     */
    @Test
    public void testGetPrecInitial() {
        System.out.println("getPrecInitial");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getPrecInitial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVit method, of class Pokemon.
     */
    @Test
    public void testGetVit() {
        System.out.println("getVit");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getVit();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVit method, of class Pokemon.
     */
    @Test
    public void testSetVit() {
        System.out.println("setVit");
        double vit = 0.0;
        Pokemon instance = null;
        instance.setVit(vit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVitInitial method, of class Pokemon.
     */
    @Test
    public void testGetVitInitial() {
        System.out.println("getVitInitial");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getVitInitial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndividualValue method, of class Pokemon.
     */
    @Test
    public void testGetIndividualValue() {
        System.out.println("getIndividualValue");
        Pokemon instance = null;
        IndividualValue expResult = null;
        IndividualValue result = instance.getIndividualValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEffortValue method, of class Pokemon.
     */
    @Test
    public void testGetEffortValue() {
        System.out.println("getEffortValue");
        Pokemon instance = null;
        EffortValue expResult = null;
        EffortValue result = instance.getEffortValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCap method, of class Pokemon.
     */
    @Test
    public void testGetCap() {
        System.out.println("getCap");
        Pokemon instance = null;
        ListeDeCapacite expResult = null;
        ListeDeCapacite result = instance.getCap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapLaPlusPuissante method, of class Pokemon.
     */
    @Test
    public void testGetCapLaPlusPuissante() {
        System.out.println("getCapLaPlusPuissante");
        Pokemon instance = null;
        Capacite expResult = null;
        Capacite result = instance.getCapLaPlusPuissante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapLaPlusPuissante method, of class Pokemon.
     */
    @Test
    public void testSetCapLaPlusPuissante() {
        System.out.println("setCapLaPlusPuissante");
        Capacite capLaPlusPuissante = null;
        Pokemon instance = null;
        instance.setCapLaPlusPuissante(capLaPlusPuissante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapEvolution method, of class Pokemon.
     */
    @Test
    public void testGetCapEvolution() {
        System.out.println("getCapEvolution");
        Pokemon instance = null;
        Capacite expResult = null;
        Capacite result = instance.getCapEvolution();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapEvolution method, of class Pokemon.
     */
    @Test
    public void testSetCapEvolution() {
        System.out.println("setCapEvolution");
        Capacite capaciteEvolution = null;
        Pokemon instance = null;
        instance.setCapEvolution(capaciteEvolution);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initCapSpe method, of class Pokemon.
     */
    @Test
    public void testInitCapSpe() {
        System.out.println("initCapSpe");
        CapaciteSpe[] capSpes = null;
        Pokemon instance = null;
        instance.initCapSpe(capSpes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapSpe method, of class Pokemon.
     */
    @Test
    public void testGetCapSpe() {
        System.out.println("getCapSpe");
        Pokemon instance = null;
        CapaciteSpe expResult = null;
        CapaciteSpe result = instance.getCapSpe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapSpe method, of class Pokemon.
     */
    @Test
    public void testSetCapSpe() {
        System.out.println("setCapSpe");
        CapaciteSpe capSpe = null;
        Pokemon instance = null;
        instance.setCapSpe(capSpe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCap_apte method, of class Pokemon.
     */
    @Test
    public void testGetCap_apte() {
        System.out.println("getCap_apte");
        Pokemon instance = null;
        Map<Capacite, Boolean> expResult = null;
        Map<Capacite, Boolean> result = instance.getCap_apte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCap_apte method, of class Pokemon.
     */
    @Test
    public void testSetCap_apte() {
        System.out.println("setCap_apte");
        Map<Capacite, Boolean> cap_apte = null;
        Pokemon instance = null;
        instance.setCap_apte(cap_apte);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoNomDresseur method, of class Pokemon.
     */
    @Test
    public void testGetDoNomDresseur() {
        System.out.println("getDoNomDresseur");
        Pokemon instance = null;
        String expResult = "";
        String result = instance.getDoNomDresseur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDoNomDresseur method, of class Pokemon.
     */
    @Test
    public void testSetDoNomDresseur() {
        System.out.println("setDoNomDresseur");
        String doNomDresseur = "";
        Pokemon instance = null;
        instance.setDoNomDresseur(doNomDresseur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpNivSuiv method, of class Pokemon.
     */
    @Test
    public void testGetExpNivSuiv() {
        System.out.println("getExpNivSuiv");
        Pokemon instance = null;
        int expResult = 0;
        int result = instance.getExpNivSuiv();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpNivPrec method, of class Pokemon.
     */
    @Test
    public void testGetExpNivPrec() {
        System.out.println("getExpNivPrec");
        Pokemon instance = null;
        int expResult = 0;
        int result = instance.getExpNivPrec();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbRuban method, of class Pokemon.
     */
    @Test
    public void testGetNbRuban() {
        System.out.println("getNbRuban");
        Pokemon instance = null;
        int expResult = 0;
        int result = instance.getNbRuban();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNbRuban method, of class Pokemon.
     */
    @Test
    public void testSetNbRuban() {
        System.out.println("setNbRuban");
        int nbRuban = 0;
        Pokemon instance = null;
        instance.setNbRuban(nbRuban);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndroits method, of class Pokemon.
     */
    @Test
    public void testSetEndroits_ListeDEndroit() {
        System.out.println("setEndroits");
        ListeDEndroit l = null;
        Pokemon instance = null;
        instance.setEndroits(l);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterEndroits method, of class Pokemon.
     */
    @Test
    public void testAjouterEndroits_Endroit() {
        System.out.println("ajouterEndroits");
        Endroit e = null;
        Pokemon instance = null;
        instance.ajouterEndroits(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndroits method, of class Pokemon.
     */
    @Test
    public void testSetEndroits_3args() {
        System.out.println("setEndroits");
        ListeDEndroit l = null;
        Environnement environnement = null;
        int pourcentage = 0;
        Pokemon instance = null;
        instance.setEndroits(l, environnement, pourcentage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterEndroits method, of class Pokemon.
     */
    @Test
    public void testAjouterEndroits_3args() {
        System.out.println("ajouterEndroits");
        Endroit e = null;
        Environnement environnement = null;
        int pourcentage = 0;
        Pokemon instance = null;
        instance.ajouterEndroits(e, environnement, pourcentage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndroits method, of class Pokemon.
     */
    @Test
    public void testGetEndroits() {
        System.out.println("getEndroits");
        Pokemon instance = null;
        ListeDEndroit expResult = null;
        ListeDEndroit result = instance.getEndroits();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjetEquipe method, of class Pokemon.
     */
    @Test
    public void testGetObjetEquipe() {
        System.out.println("getObjetEquipe");
        Pokemon instance = null;
        Objet expResult = null;
        Objet result = instance.getObjetEquipe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjetEquipe method, of class Pokemon.
     */
    @Test
    public void testSetObjetEquipe() {
        System.out.println("setObjetEquipe");
        Objet objetEquipe = null;
        Pokemon instance = null;
        instance.setObjetEquipe(objetEquipe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExp method, of class Pokemon.
     */
    @Test
    public void testGetExp() {
        System.out.println("getExp");
        Pokemon instance = null;
        int expResult = 0;
        int result = instance.getExp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExp method, of class Pokemon.
     */
    @Test
    public void testSetExp() {
        System.out.println("setExp");
        int exp = 0;
        Pokemon instance = null;
        instance.setExp(exp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpBase method, of class Pokemon.
     */
    @Test
    public void testGetExpBase() {
        System.out.println("getExpBase");
        Pokemon instance = null;
        int expResult = 0;
        int result = instance.getExpBase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExpBase method, of class Pokemon.
     */
    @Test
    public void testSetExpBase() {
        System.out.println("setExpBase");
        int exp = 0;
        Pokemon instance = null;
        instance.setExpBase(exp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpDonner method, of class Pokemon.
     */
    @Test
    public void testGetExpDonner() {
        System.out.println("getExpDonner");
        Pokemon instance = null;
        double expResult = 0.0;
        double result = instance.getExpDonner();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSexe method, of class Pokemon.
     */
    @Test
    public void testGetSexe() {
        System.out.println("getSexe");
        Pokemon instance = null;
        Sexe expResult = null;
        Sexe result = instance.getSexe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSexe method, of class Pokemon.
     */
    @Test
    public void testSetSexe() {
        System.out.println("setSexe");
        Sexe sexe = null;
        Pokemon instance = null;
        instance.setSexe(sexe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEtat method, of class Pokemon.
     */
    @Test
    public void testGetEtat() {
        System.out.println("getEtat");
        Pokemon instance = null;
        Etat expResult = null;
        Etat result = instance.getEtat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEtat method, of class Pokemon.
     */
    @Test
    public void testSetEtat() {
        System.out.println("setEtat");
        Etat etat = null;
        Pokemon instance = null;
        instance.setEtat(etat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacite method, of class Pokemon.
     */
    @Test
    public void testGetCapacite() {
        System.out.println("getCapacite");
        Pokemon instance = null;
        Map<Integer, Capacite> expResult = null;
        Map<Integer, Capacite> result = instance.getCapacite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacite method, of class Pokemon.
     */
    @Test
    public void testSetCapacite() {
        System.out.println("setCapacite");
        Map<Integer, Capacite> capacite = null;
        Pokemon instance = null;
        instance.setCapacite(capacite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTypeExp method, of class Pokemon.
     */
    @Test
    public void testGetTypeExp() {
        System.out.println("getTypeExp");
        Pokemon instance = null;
        TypeExp expResult = null;
        TypeExp result = instance.getTypeExp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAttributsExp method, of class Pokemon.
     */
    @Test
    public void testGetAttributsExp() {
        System.out.println("getAttributsExp");
        Pokemon instance = null;
        AttributsExp expResult = null;
        AttributsExp result = instance.getAttributsExp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recoitDegat method, of class Pokemon.
     */
    @Test
    public void testRecoitDegat() {
        System.out.println("recoitDegat");
        double degat = 0.0;
        Pokemon instance = null;
        instance.recoitDegat(degat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recoitCap method, of class Pokemon.
     */
    @Test
    public void testRecoitCap() {
        System.out.println("recoitCap");
        Capacite cap = null;
        Pokemon instance = null;
        instance.recoitCap(cap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of utiliseCap method, of class Pokemon.
     */
    @Test
    public void testUtiliseCap() {
        System.out.println("utiliseCap");
        Capacite cap = null;
        Pokemon instance = null;
        instance.utiliseCap(cap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterAttBase method, of class Pokemon.
     */
    @Test
    public void testAjouterAttBase() {
        System.out.println("ajouterAttBase");
        Capacite c = null;
        Pokemon instance = null;
        instance.ajouterAttBase(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterCapacite method, of class Pokemon.
     */
    @Test
    public void testAjouterCapacite() {
        System.out.println("ajouterCapacite");
        int niv = 0;
        Capacite c = null;
        Pokemon instance = null;
        instance.ajouterCapacite(niv, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterCTCS method, of class Pokemon.
     */
    @Test
    public void testAjouterCTCS() {
        System.out.println("ajouterCTCS");
        Capacite c = null;
        Pokemon instance = null;
        instance.ajouterCTCS(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of soin method, of class Pokemon.
     */
    @Test
    public void testSoin_0args() {
        System.out.println("soin");
        Pokemon instance = null;
        instance.soin();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of soinFinCombat method, of class Pokemon.
     */
    @Test
    public void testSoinFinCombat() {
        System.out.println("soinFinCombat");
        Pokemon instance = null;
        instance.soinFinCombat();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of soin method, of class Pokemon.
     */
    @Test
    public void testSoin_CapaciteSoin() {
        System.out.println("soin");
        CapaciteSoin c = null;
        Pokemon instance = null;
        instance.soin(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of augmenteStat method, of class Pokemon.
     */
    @Test
    public void testAugmenteStat() {
        System.out.println("augmenteStat");
        Attributs a = null;
        int pourcentage = 0;
        Pokemon instance = null;
        boolean expResult = false;
        boolean result = instance.augmenteStat(a, pourcentage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of diminueStat method, of class Pokemon.
     */
    @Test
    public void testDiminueStat() {
        System.out.println("diminueStat");
        Attributs a = null;
        int pourcentage = 0;
        Pokemon instance = null;
        boolean expResult = false;
        boolean result = instance.diminueStat(a, pourcentage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estAugmenterParTerrain method, of class Pokemon.
     */
    @Test
    public void testEstAugmenterParTerrain() {
        System.out.println("estAugmenterParTerrain");
        Pokemon instance = null;
        instance.estAugmenterParTerrain();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estDiminuerParTerrain method, of class Pokemon.
     */
    @Test
    public void testEstDiminuerParTerrain() {
        System.out.println("estDiminuerParTerrain");
        Pokemon instance = null;
        instance.estDiminuerParTerrain();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of utilObjet method, of class Pokemon.
     */
    @Test
    public void testUtilObjet() {
        System.out.println("utilObjet");
        Objet obj = null;
        Pokemon instance = null;
        instance.utilObjet(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estTresFaible method, of class Pokemon.
     */
    @Test
    public void testEstTresFaible() {
        System.out.println("estTresFaible");
        Type type = null;
        Pokemon instance = null;
        boolean expResult = false;
        boolean result = instance.estTresFaible(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estFaible method, of class Pokemon.
     */
    @Test
    public void testEstFaible() {
        System.out.println("estFaible");
        Type type = null;
        Pokemon instance = null;
        boolean expResult = false;
        boolean result = instance.estFaible(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estTresFort method, of class Pokemon.
     */
    @Test
    public void testEstTresFort() {
        System.out.println("estTresFort");
        Type type = null;
        Pokemon instance = null;
        boolean expResult = false;
        boolean result = instance.estTresFort(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estFort method, of class Pokemon.
     */
    @Test
    public void testEstFort() {
        System.out.println("estFort");
        Type type = null;
        Pokemon instance = null;
        boolean expResult = false;
        boolean result = instance.estFort(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estInefficace method, of class Pokemon.
     */
    @Test
    public void testEstInefficace() {
        System.out.println("estInefficace");
        Type type = null;
        Pokemon instance = null;
        boolean expResult = false;
        boolean result = instance.estInefficace(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estKo method, of class Pokemon.
     */
    @Test
    public void testEstKo() {
        System.out.println("estKo");
        Pokemon instance = null;
        boolean expResult = false;
        boolean result = instance.estKo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstance method, of class Pokemon.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Pokemon pk = null;
        Pokemon expResult = null;
        Pokemon result = Pokemon.getInstance(pk);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evolue method, of class Pokemon.
     */
    @Test
    public void testEvolue() {
        System.out.println("evolue");
        Pokemon instance = null;
        boolean expResult = false;
        boolean result = instance.evolue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPokemonEvolution method, of class Pokemon.
     */
    @Test
    public void testGetPokemonEvolution() {
        System.out.println("getPokemonEvolution");
        Pokemon instance = null;
        Pokemon expResult = null;
        Pokemon result = instance.getPokemonEvolution();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ajouterEndroits method, of class Pokemon.
     */
    @Test
    public void testAjouterEndroits_5args() {
        System.out.println("ajouterEndroits");
        Endroit e = null;
        int nivMin = 0;
        int nivMax = 0;
        Environnement environnement = null;
        int pourcentage = 0;
        Pokemon instance = null;
        instance.ajouterEndroits(e, nivMin, nivMax, environnement, pourcentage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Pokemon.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Pokemon instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Pokemon.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Pokemon instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PokemonImpl extends Pokemon {

        public PokemonImpl() {
            super(null);
        }

        public boolean evolue() {
            return false;
        }

        public Pokemon getPokemonEvolution() {
            return null;
        }

        public void ajouterEndroits(Endroit e, int nivMin, int nivMax, Environnement environnement, int pourcentage) {
        }
    }
    
}
