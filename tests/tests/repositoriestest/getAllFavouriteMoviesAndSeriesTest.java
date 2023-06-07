package tests.repositoriestest;

import static junit.framework.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import models.Movie;
import dataaccesslayer.repositories.MovieRepository;

class getAllFavouriteMoviesAndSeriesTest {

	@Test
	void getAllMoviesAndSeriesByActorTests() {
		MovieRepository test= new MovieRepository();
		List<Movie>tests=test.getAllFavouriteMoviesAndSeries(14);
		assertNotNull(tests);	
	}
}
