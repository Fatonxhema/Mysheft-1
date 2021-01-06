public class LibriShkollor extends Libri implements Botimi{

    private String drejtimi;

    public LibriShkollor(int isbn, String titulli, int dataPublikimit, int nrAutorve,String drejtimi) {
        super(isbn, titulli, dataPublikimit, nrAutorve);
        this.drejtimi = drejtimi;
    }

    public String getDrejtimi() {
        return drejtimi;
    }

    public void setDrejtimi(String drejtimi) {
        this.drejtimi = drejtimi;
    }

    @Override
    public void shtoAutori(Autori a) {
        if(a == null){
            System.out.println("Autori nuk eshet incializuar");
            return;
        }
        if(index == autoret.length){
            System.out.println("Nuk ka vend ne varg!");
            return;
        }
        for(int i = 0; i < index; i++){
            if(autoret[i].equals(a)){
                System.out.println("Libri e ka kete autor!");
                return;
            }
        }
        autoret[index++] = a;

    }



    @Override
    public String toString() {
        return "LibriShkollor" + super.toString()+
                "drejtimi" + drejtimi;
    }

    @Override
    public boolean kaDetyra() {
        return true;
    }

    @Override
    public void viti() {
        System.out.println();
    }
}
