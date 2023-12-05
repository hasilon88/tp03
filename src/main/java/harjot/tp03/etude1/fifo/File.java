package harjot.tp03.etude1.fifo;


public interface File {

    public int taille();
    public boolean estVide();
    public Object premier() throws Exception;
    public void vider();
    public void enfiler(Object element) throws Exception;
    public Object defiler() throws Exception;
}
