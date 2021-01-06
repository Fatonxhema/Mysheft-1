public abstract class Libri {
    private int isbn;
    private String titulli;
    private int dataPublikimit;
    protected Autori[] autoret;
    protected int index = 0;

    public Libri(int isbn,String titulli, int dataPublikimit, int nrAutorve) {
        if (nrAutorve < 1){
            System.out.println("Libri duhet te kete sepaku 1 autor");
        }
        this.isbn =isbn;
        this.titulli = titulli;
        this.dataPublikimit = dataPublikimit;
        autoret =new Autori[nrAutorve];
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public int getDataPublikimit() {
        return dataPublikimit;
    }

    public void setDataPublikimit(int dataPublikimit) {
        this.dataPublikimit = dataPublikimit;
    }

    public Autori[] getAutoret() {
        return autoret;
    }

    public void setAutoret(Autori[] autoret) {
        this.autoret = autoret;
    }

    public abstract void shtoAutori(Autori a);

    @Override
    public String toString() {
        String libriToString = isbn + " : " + titulli + " - [";
        for(int i = 0; i < index; i++){
            libriToString += autoret[i].toString();
            if(i < index - 1)
                libriToString += ", ";
            else
                libriToString += "]";
        }
        return libriToString;
    }


    @Override
    public boolean equals(Object o){
    if (o instanceof Libri){
        return isbn == ((Libri)o).getIsbn();
    }
    return false;
    }

}
