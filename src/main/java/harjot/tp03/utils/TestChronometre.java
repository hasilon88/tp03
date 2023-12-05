package harjot.tp03.utils;

public class TestChronometre {

    public static void main(String[] args) throws  Exception{


        Chronometre chronometre = new Chronometre();

        chronometre.start();

        for (int i = 0; i < 200; i++) {
            Thread.sleep(2000);
            System.out.println("...> " + i);
        }
        chronometre.stop();

        System.out.println(chronometre.getDuration()+" seconds");

        chronometre.reset();

    }

}
