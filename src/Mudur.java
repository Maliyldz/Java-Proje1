public class Mudur extends Personel{

    private int mudurlukDerecesi;

    public Mudur(int id, String ad, String soyad, int maas, int mudurlukDerecesi){
        super(id, ad, soyad, maas);
        this.mudurlukDerecesi = mudurlukDerecesi;
    }

    public int getMudurlukDerecesi(){
        return mudurlukDerecesi;
    }

    public void setMudurlukDerecesi(int mudurlukDerecesi){
        this.mudurlukDerecesi = mudurlukDerecesi;
    }
}
