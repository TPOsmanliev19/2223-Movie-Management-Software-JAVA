package tests.repositoriestest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.Movie;
import dataaccesslayer.repositories.MovieRepository;

class getMovieOrSeriesByGenreAndMovieNameTest {

	@Test
	void getMovieOrSeriesByGenreAndMovieNameTests() {
		MovieRepository test= new MovieRepository();
		Movie tests=test.getMovieOrSeriesByGenreAndMovieName("Rocky","Action");
		assertNotNull(tests);
		
	}

	
}