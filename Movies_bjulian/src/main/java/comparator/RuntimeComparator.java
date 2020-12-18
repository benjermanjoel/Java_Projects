package comparator;

import model.Movie;

import java.util.Comparator;

public class RuntimeComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie movie1, Movie movie2) {

        return movie1.getLengthInMinutes() - movie2.getLengthInMinutes();

    }
}
