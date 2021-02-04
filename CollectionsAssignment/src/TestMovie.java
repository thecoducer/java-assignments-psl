import java.util.*;
import java.util.List;

public class TestMovie {
    public static void main(String[] args) {
        List<Movies> moviesList = createMovieList();

        // sorts by language
        Collections.sort(moviesList);

        // sort by director
        sortByMoviesDirector sd = new sortByMoviesDirector();
        moviesList.sort(sd);

        // sort by duration
        sortByMoviesDuration sdu = new sortByMoviesDuration();
        moviesList.sort(sdu);

        sortByLanguageAndReleaseDate(moviesList);

        System.out.println(moviesList);
    }

    private static List<Movies> createMovieList() {
        Movies m1 = new Movies("Batman Returns", "English", "2009-03-19", "XYZ", "MOP", 200);
        Movies m2 = new Movies("Mee Raqsam", "Hindi", "2020-09-12", "Shabana Azmi", "IOL", 120);
        Movies m3 = new Movies("DDLJ", "Hindi", "2001-02-30", "ROL", "REX", 160);
        Movies m4 = new Movies("Chotushkone", "Bengali", "2016-04-01", "HERN", "CORUH", 186);

        return new ArrayList<>(Arrays.asList(m1, m2, m3, m4));
    }

    public static void sortByLanguageAndReleaseDate(List<Movies> moviesList) {
        sortByLanguageAndReleaseDate slr = new sortByLanguageAndReleaseDate();
        moviesList.sort(slr);
    }
}
