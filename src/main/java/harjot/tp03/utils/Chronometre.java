package harjot.tp03.utils;


public class Chronometre {

    private long debut = 0;
    private long arret = 0;
    boolean enMarche = false;

    public void start() {
        this.debut = System.currentTimeMillis();
        this.enMarche = true;
    }

    public void stop() {
        this.arret = System.currentTimeMillis();
        this.enMarche = false;
    }

    public long getDuration() {
        long duree;

        if (enMarche) {
            duree = ((System.currentTimeMillis() - debut));
        } else {
            duree = (arret - debut);
        }
        return duree;
    }

    public void reset() {
        this.debut = 0;
        this.enMarche = false;
    }

}
