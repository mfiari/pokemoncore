/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfiari.pokemon.core.xml;

import java.util.ArrayList;
import mfiari.pokemon.core.models.Pokemon;
import mfiari.pokemon.core.type.Type;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author mike
 */
public class ParserPokemonXML  extends DefaultHandler {

    private Pokemon pokemon;
    private ArrayList<Pokemon> pokemons;
    private Attributes mCurrentAttList = null;

    public ArrayList<Pokemon> getPokemons () {
        return this.pokemons;
    }

    @Override
    public void startDocument() throws SAXException {
        this.pokemons = new ArrayList<>();
    }

    @Override
    public void endDocument() throws SAXException {

    }

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
        this.mCurrentAttList = atts;
        if (qName.equalsIgnoreCase("pokemon")) {
            this.pokemon = new Pokemon();
            this.pokemon.setNumero(Integer.valueOf(this.mCurrentAttList.getValue("numero")));
            this.pokemon.setNom(this.mCurrentAttList.getValue("nom"));
            this.pokemon.setType1(Type.valueOf(this.mCurrentAttList.getValue("type1")));
            String type2 = this.mCurrentAttList.getValue("type2");
            if (!type2.isEmpty()) {
                this.pokemon.setType2(Type.valueOf(type2));
            }
            this.pokemon.setTaille(Double.valueOf(this.mCurrentAttList.getValue("taille")));
            this.pokemon.setPoids(Double.valueOf(this.mCurrentAttList.getValue("poids")));
            this.pokemon.setDescription(this.mCurrentAttList.getValue("description"));
            this.pokemon.setPourcentageMale(Double.valueOf(this.mCurrentAttList.getValue("genre")));
            this.pokemon.setPvBase(Integer.valueOf(this.mCurrentAttList.getValue("pv")));
            this.pokemon.setAttBase(Integer.valueOf(this.mCurrentAttList.getValue("att")));
            this.pokemon.setDefBase(Integer.valueOf(this.mCurrentAttList.getValue("def")));
            this.pokemon.setAttSpeBase(Integer.valueOf(this.mCurrentAttList.getValue("attspe")));
            this.pokemon.setDefSpeBase(Integer.valueOf(this.mCurrentAttList.getValue("defspe")));
            this.pokemon.setVitBase(Integer.valueOf(this.mCurrentAttList.getValue("vit")));
            this.pokemon.setPrecBase(Integer.valueOf(this.mCurrentAttList.getValue("prec")));
            this.pokemon.setEsqBase(Integer.valueOf(this.mCurrentAttList.getValue("esq")));
            this.pokemon.setTauxCapture(Integer.valueOf(this.mCurrentAttList.getValue("capture")));
            this.pokemon.setNbPasAvantEclosion(Integer.valueOf(this.mCurrentAttList.getValue("eclosion")));
            
        } else if (qName.equalsIgnoreCase("capacite")) {
        } else if (qName.equalsIgnoreCase("description")) {
        }
    }

    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("pokemon")) {
            this.pokemons.add(this.pokemon);
        }
    }
}