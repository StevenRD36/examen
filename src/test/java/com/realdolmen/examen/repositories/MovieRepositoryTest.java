/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realdolmen.examen.repositories;

import com.realdolmen.examen.examenprogrammeren2jirkaruzicka.Movie;
import com.realdolmen.examen.exeptions.NoQueryPossibleException;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Darkviking
 */
   public class MovieRepositoryTest {
    
    //TODO 
    //Opdracht 2 Unit testen : Er is al een deel van de repository test opgesteld. Alle gegevens die je nodig hebt staan al ingevuld.
    //19 : annoteer alle methoden met de juiste annotaties, zodat ze aanzien worden als test methoden. Boven sommige methoden staan tips, bekijk ze goed. 
    //20 : tracht alle methoden die hieronder beschreven zijn in te vullen zodat ze slagen. Tips kan je vinden in de methoden zelf.
    private static String URL = "jdbc:mysql://localhost:3306/movie_db_test?autoReconnect=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    private MovieRepository repository;
    
    public void init() {
        repository = new MovieRepository(URL);
    }
    
    @Test
    public void findTestSucces() throws Exception {
        //Geef als parameter de String "SELECT * FROM movies" mee
        MovieRepository Movierepository = new MovieRepository();
        List<Movie> Movies = Movierepository.find("SELECT * FROM movies");
        assertFalse(Movies.isEmpty());
        //Doe de nodige check om een succesvolle test te krijgen indien nodig
    }
    
    @Test(expected = NoQueryPossibleException.class)
    public void findTestWrongQueryThrowsNoQueryPossibleException() throws NoQueryPossibleException{
        //Geef als parameter de String "SELECT tieeel FROM movies" mee
        MovieRepository Movierepository = new MovieRepository();
        List<Movie> Movies = Movierepository.find("SELECT tieeel FROM movies");
        //Doe de nodige check om een succesvolle test te krijgen indien nodig
    }}
