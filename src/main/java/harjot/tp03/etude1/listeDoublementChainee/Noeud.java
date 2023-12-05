package harjot.tp03.etude1.listeDoublementChainee;

public class Noeud {

    public Noeud suivant;
    public Noeud precedent;

    public Object data;

    public Noeud(){

    }

    public Noeud(Object _data){
        this.data = _data;
    }

    public Noeud getSuivant() {
        return suivant;
    }

    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }

    public Noeud getPrecedent() {
        return precedent;
    }

    public void setPrecedent(Noeud precedent) {
        this.precedent = precedent;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void afficherObjetDuNoeud(){
        System.out.println( data + " ");
    }


}
