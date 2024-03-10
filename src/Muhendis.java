public class Muhendis extends Personel {
    private String uzmanlik;

    public Muhendis(int id, String ad, String soyad, int maas, String uzmanlik){
        super(id, ad, soyad, maas);
        this.uzmanlik = uzmanlik;
    }

    public String getUzmanlik(){
        return uzmanlik;
    }

    public void setUzmanlik(String uzmanlik){
        this.uzmanlik = uzmanlik;
    }
}
