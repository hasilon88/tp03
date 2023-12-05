package harjot.tp03.etude1.listeSimplementChainee;


public class ListeSimplementChainee {

    private Noeud teteDeListe;
    private int nombreElement;

    //liste vide ==> la tete de liste est initialisée à Null
    public ListeSimplementChainee(){
        teteDeListe = new Noeud(null);
        nombreElement = 0;
    }

    public void add(Object data){

        Noeud temp = new Noeud(data);
        Noeud courant = teteDeListe;

        //debut de liste
        while(courant.getSuivant() != null){
            courant = courant.getSuivant();
        }
        courant.setSuivant(temp);
        nombreElement++;
    }

    public void add(Object data, int index){

        Noeud temp = new Noeud(data);
        Noeud courant = teteDeListe;

        for(int i=1; i<index && courant.getSuivant() != null; i++){
            courant = courant.getSuivant();
        }
        temp.setSuivant(courant.getSuivant());
        courant.setSuivant(temp);
        nombreElement++;
    }


    public int getNombreElement(){
        return nombreElement;
    }

    public Object getElementAt(int index){
        // test si l'index est valide
        if(index <= 0){
            return null;
        }
        Noeud courant = teteDeListe.getSuivant();
        for (int i=1; i<index; i++){
            if(courant.getSuivant() == null)
                return null;
            courant = courant.getSuivant();
        }

        return courant.getObjet();
    }

    public boolean remove(int index){
        if(index <1 || index > getNombreElement())
            return false;

        Noeud courant = teteDeListe;
        for(int i=1; i<index;i++){
            if(courant.getSuivant() != null)

                courant = courant.getSuivant();
        }
        courant.setSuivant(courant.getSuivant().getSuivant());
        nombreElement--;
        return true;
    }

    public String toString(){
        Noeud courant = teteDeListe.getSuivant();
        String str= "";
        while(courant != null){
            str += "[" + courant.getObjet().toString() + "]";
            courant = courant.getSuivant();
        }
        return str;
    }

    public static void main(String[] args) {
        ListeSimplementChainee liste = new ListeSimplementChainee();
        liste.add("Objet:Un");
        liste.add("Objet:Deux");
        liste.add("Objet:Trois");
        System.out.println(liste.toString());
        System.out.println(liste.getElementAt(2).toString());
        liste.remove(2);
        System.out.println(liste.toString());
    }
}
