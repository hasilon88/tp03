package harjot.tp03.etude1.fifo;

import java.util.Arrays;


public class ImplementationFile implements File{

    private Object[] elements = new Object[0];


    public int taille() {
        return this.elements.length;
    }


    public boolean estVide() {
        return this.elements.length ==0;
        // return this.taille()==0;
    }


    public Object premier() throws Exception {
        if(this.estVide()){
            System.out.println("la file est vide");
            return null;
        } else {
            return this.elements[0];
        }
    }


    public void vider() {
        this.elements = new Object[0];
    }


    public void enfiler(Object element) throws Exception {
        Object[] temp = new Object[this.taille()+1];

        for (int i = 0; i < elements.length; i++) {
            temp[i] = elements[i];
        }
        temp[temp.length - 1] = element;
        this.elements = temp;
    }


    public Object defiler() throws Exception {
        if(this.estVide()){
            System.out.println("la file est vide");
            return null;
        } else {
            Object objetPremierASortir = this.premier();
            this.elements = Arrays.copyOfRange
                    (this.elements, 1, this.taille());
            return objetPremierASortir;
        }
    }

    public String toString(){
        return Arrays.toString(this.elements);
    }


}

