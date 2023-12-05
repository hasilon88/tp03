package harjot.tp03.etude1.lifo;


// implemtation de L.I.F.O
public interface Pile {

    public int taille();
    public boolean estVide();
    public Object sommet() throws Exception; // denier
    public void vider();
    public void enpiler(Object element) throws Exception;
    public Object depiler() throws Exception;

}

