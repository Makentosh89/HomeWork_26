import java.util.Arrays;

public abstract class Locality {
    private String []rayon;
    private String director;
    private String []village;

    public String[] getRayon() {
        return rayon;
    }

    public void setRayon(String[] rayon) {
        this.rayon = rayon;
    }

    public String[] getVillage() {
        return village;
    }

    public void setVillage(String[] village) {
        this.village = village;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "director = " + director +
                "\nrayon = " + Arrays.toString(rayon) +
                "\nvillage = " +Arrays.toString(village);
    }
    public abstract String findByDirector();

}


