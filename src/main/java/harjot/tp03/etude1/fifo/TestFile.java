package harjot.tp03.etude1.fifo;

public class TestFile {
    public static void main(String[] args) {
        try {
            ImplementationFile file = new ImplementationFile();
            file.enfiler("AAAA");
            file.enfiler("BBBB");
            file.enfiler("CCCC");
            file.enfiler("DDDD");
            System.out.println(file.toString());
            //System.out.println(file.estVide());
            System.out.println(file.taille());
            System.out.println(file.premier());
            //file.vider();
            System.out.println(file.toString());
            System.out.println(file.defiler());
            System.out.println(file.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
