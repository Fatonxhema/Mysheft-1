public class Autori {
    private int id;
    private String emri;
    private String mbiemri;


    public Autori(int id, String emri, String mbiemri) {
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
    }

    public int getId() {
        return id;
    }


    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    @Override
    public String toString() {
        return "Autori" +
                "id: " + id +
                ", emri='" + emri + '\'' +
                ", mbiemri='" + mbiemri + '\'' +
                '}';
    }
}
