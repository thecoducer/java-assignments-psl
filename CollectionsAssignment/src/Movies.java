import java.util.Comparator;

public class Movies implements Comparable<Movies> {
    private String name;
    private String language;
    private String releaseDate;
    private String director;
    private String producer;
    private int duration;

    public Movies(String name, String language, String releaseDate, String director, String producer, int duration) {
        this.name = name;
        this.language = language;
        this.releaseDate = releaseDate;
        this.director = director;
        this.producer = producer;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public int compareTo(Movies o) {
        return this.getLanguage().compareTo(o.getLanguage());
    }

    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", director='" + director + '\'' +
                ", producer='" + producer + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}

class sortByMoviesDirector implements Comparator<Movies> {
    @Override
    public int compare(Movies o1, Movies o2) {
        return o1.getDirector().compareTo(o2.getDirector());
    }
}

class sortByMoviesDuration implements Comparator<Movies> {
    @Override
    public int compare(Movies o1, Movies o2) {
        int d1 = o1.getDuration();
        int d2 = o2.getDuration();

        if(d1 > d2) {
            return 1;
        }else if(d1 < d2) {
            return -1;
        }else{
            return 0;
        }

    }
}

class sortByMoviesReleaseDate implements Comparator<Movies> {
    @Override
    public int compare(Movies o1, Movies o2) {
        return o1.getReleaseDate().compareTo(o2.getReleaseDate());
    }
}

class sortByMoviesLanguage implements Comparator<Movies> {
    @Override
    public int compare(Movies o1, Movies o2) {
        return o1.getLanguage().compareTo(o2.getLanguage());
    }
}

class sortByLanguageAndReleaseDate implements Comparator<Movies> {
    @Override
    public int compare(Movies o1, Movies o2) {
        int r = o1.getLanguage().compareTo(o2.getLanguage());
        if(r == 0) {
            return o1.getReleaseDate().compareTo(o2.getReleaseDate());
        }

        return r;
    }
}
