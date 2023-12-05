package harjot.tp03.etude1.listeDoublementChainee;


import java.util.Collection;

public class ListeDoublementChainee{

    private Noeud premier;
    private Noeud dernier;

    private int compteur;

    public ListeDoublementChainee() {
        this.premier = null;
        this.dernier = null;
        compteur = 0;
    }

    public boolean isEmpty() {
        return this.premier == null;
    }

    public void insererEnDebutListe(Object objetAinserer) {
        Noeud nouveauNoeud = new Noeud(objetAinserer);

        if (this.isEmpty()) {
            dernier = nouveauNoeud;
        } else {
            premier.precedent = nouveauNoeud;
            nouveauNoeud.suivant = premier;
        }
        premier = nouveauNoeud;
        compteur++;
    }

    public void insererEnFinDeListe(Object objetAinserer) {
        Noeud nouveauNoeud = new Noeud(objetAinserer);

        if (this.isEmpty()) {
            premier = nouveauNoeud;
        } else {
            dernier.suivant = nouveauNoeud;
            nouveauNoeud.precedent = dernier;
        }
        dernier = nouveauNoeud;
        compteur++;
    }

    public boolean supprimerEnDebutListe(){
        boolean flag = false;
        Noeud temp = premier;

        //if(premier.suivant== null)
        if (compteur ==1){
            premier=null;
            flag = true;
            compteur --;
        }else {
            premier.suivant.precedent = null;
            premier = premier.suivant;
            flag = true;
            compteur --;
        }
        return flag;
    }

    public boolean  suupprimerEnFinDeListe(){
        boolean flag = false;

        if(isEmpty()){
            flag = true;
        } else if (compteur ==1){
            premier = null;
            dernier = null;
            compteur --;
            flag = true;
        } else{
            dernier.precedent.suivant= null;  // enlever les 2 liens (fleches)
            dernier = dernier.precedent;
            compteur --;
            flag = true;
        }
        return flag;
    }

    public void afficherListeDebutFin(){
        System.out.println("====Affichage de la liste Debut <==> Fin");
        Noeud courant = premier;

        while(courant != null){
            courant.afficherObjetDuNoeud();
            courant = courant.suivant;
        }
        System.out.println("");
    }


    public void afficherListeFinDebut(){
        System.out.println("====Affichage de la liste Fin <==> Debut");
        Noeud courant = dernier;

        while(courant != null){
            courant.afficherObjetDuNoeud();
            courant = courant.precedent;
        }
        System.out.println("");
    }


    public static void main(String[] args) {

        ListeDoublementChainee liste = new ListeDoublementChainee();

        liste.insererEnDebutListe(1111);
        liste.insererEnDebutListe(2222);
        liste.insererEnDebutListe(3333);
        liste.insererEnDebutListe(4444);

        liste.insererEnFinDeListe("AAAA");
        liste.insererEnFinDeListe("BBBB");
        liste.insererEnFinDeListe("CCCC");
        liste.insererEnFinDeListe("DDDD");

        liste.afficherListeDebutFin();
        liste.afficherListeFinDebut();
    }
/**
 public boolean insererApresValeur(int valeurPosition, Object objetAinserer) {

 return false;
 }*/

}
