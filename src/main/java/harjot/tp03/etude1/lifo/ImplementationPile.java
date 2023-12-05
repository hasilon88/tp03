package harjot.tp03.etude1.lifo;

import java.util.Arrays;
import java.util.Queue;

public class ImplementationPile implements Pile {

    private Object[] elements = new Object[0];

    private int taille = 0;


    public int taille() {
        return this.taille;
    }


    public boolean estVide() {
        return this.taille ==0;
    }

    // le sommet represente le dernier élément
    public Object sommet() throws Exception {
        if(this.estVide()){
            System.out.println("la pile est vide");
            return null;
        } else{
            return this.elements[this.taille -1];
        }
    }


    public void vider() {
        this.elements = new Object[0];
    }


    public void enpiler(Object element) throws Exception {
        Object[] temp = new Object[this.taille()+1];

        for (int i = 0; i < elements.length; i++) {
            temp[i] = elements[i];
        }
        temp[temp.length - 1] = element;
        this.elements = temp;
        this.taille++;
    }


    public Object depiler() throws Exception {
        if(this.estVide()){
            System.out.println("la pile est vide");
            return null;
        } else {
            Object objetPremierASortir = this.sommet();
            this.elements = Arrays.copyOfRange
                    (this.elements,0, this.taille()-1);
            return objetPremierASortir;
        }
    }

    public String toString(){
        return Arrays.toString(this.elements);
    }

}

