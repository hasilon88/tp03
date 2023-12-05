package harjot.tp03.etude1.lifo;


public class TestPile {
    public static void main(String[] args) {
        try {
            ImplementationPile pile = new ImplementationPile();
            pile.enpiler("AAAA");
            pile.enpiler("BBBB");
            pile.enpiler("CCCC");
            pile.enpiler("DDDD");
            System.out.println(pile.toString());
            System.out.println(pile.taille());
            System.out.println(pile.estVide());
            System.out.println(pile.sommet());
            //pile.vider();
            System.out.println(pile.toString());
            System.out.println(pile.depiler());
            System.out.println(pile.toString());



        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
