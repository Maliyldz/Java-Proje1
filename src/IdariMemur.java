import java.util.TreeSet;

public class IdariMemur extends Personel{
    private String idariKonu;

    public IdariMemur(int id, String ad, String soyad, int maas, String idariKonu) {
        super(id, ad, soyad, maas);
        this.idariKonu = idariKonu;
    }

    public String getIdariKonum(){
        return idariKonu;
    }

    public void setIdariKonum(String idariKonum){
        this.idariKonu = idariKonum;
    }
}
