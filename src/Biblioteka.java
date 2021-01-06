import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Biblioteka {
    private String emri;
    private Libri[] librat;
    private int index;
    private Autori autoret;
    public Biblioteka(String emri, int nrLibrave) {
        this.emri = emri;
        librat =  new Libri[nrLibrave];

    }
    public boolean contains(String input){
        if(librat == null){
            System.out.println("Nuk ka libra ne varg");
            return false;
        }
        if(librat.length != 0){
            for(int i=0;i<index;i++){
                if(librat[i].equals(input)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean containsAutorin(String input){
        if(autoret == null){
            System.out.println("Nuk ka libra ne varg");
            return false;
        }
        if(librat.length != 0){
            for(int i=0;i<index;i++){
                if(librat[i].equals(input)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean egzistonLibri(Libri l){
        if (l == null){
            System.out.println("Libri nuk egziston");
            return false;
        }
        for(int i=0;i<index;i++){
            if(librat[i].equals(l)){
                return true;
            }
        }
        return false;
    }
    public void shtoLibrin(Libri l){
        if(l == null){
            System.out.println("Libri nuk eshte shtuar ne bibliotek");
            return;
        }
        
        if(index ==librat.length){
            System.out.println("Nuk ka vend ne bibliotek");
            return;
        }
        if(egzistonLibri(l)){
            System.out.println("Libri egziston ne bibliotek");
            return;
        }
        librat[index++] = l;

    }
}

