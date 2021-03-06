package fr.univ.projet;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import fr.univ.projet.handler.Handler;
import fr.univ.projet.modele.Films;

public class HandlerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			Handler handler = new Handler();
			parser.parse("/home/laetitia/Documents/S8/GL/projet/films.xml", handler);
			Films films = handler.getFilms();
			System.out.println(films);
		} catch (DOMException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
	        // TODO Auto-generated catch block
			e.printStackTrace();
		}

}
