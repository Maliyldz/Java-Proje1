public class Sekreter extends Personel{

    private int telefonSeriNo;

    public Sekreter(int id, String ad, String soyad, int maas, int telefonSeriNo) {
        super(id, ad, soyad, maas);
        this.telefonSeriNo = telefonSeriNo;
    }

    public int getTelefonSeriNo() {
        return telefonSeriNo;
    }

    public void setTelefonSeriNo(int telefonSeriNo) {
        this.telefonSeriNo = telefonSeriNo;
    }
}
