package harjot.tp03.etude1.listeSimplementChainee;


public class Noeud {

    public Noeud suivant; // pointeur vers le suivant
    public Object objet;

    public Noeud(){

    }

    //Constructeur
    public Noeud(Object _objet){
        suivant = null;
        this.objet = _objet;
    }

    public Noeud(Noeud _suivant, Object _objet){
        this.suivant = _suivant;
        this.objet = _objet;
    }

    public Noeud getSuivant(){
        return this.suivant;
    }

    public void setSuivant(Noeud _suivant){
        this.suivant = _suivant;
    }

    public Object getObjet() {
        return objet;
    }

    public void setObjet(Object objet) {
        this.objet = objet;
    }

}
