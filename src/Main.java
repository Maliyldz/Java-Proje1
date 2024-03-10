public class Main {

    //Polymorphism kullanımı örneği
    public static void maasiGoster (Personel personel){
        System.out.println(personel.getMaas());
    }
    public static void main(String[] args) {

        Mudur mudur = new Mudur(1, "Mehmet","HAN",30000, 2);
        Muhendis muhendis1 = new Muhendis(2, "Muhammet", "YILMAZ", 15000, "Endüstri");
        Muhendis muhendis2 = new Muhendis(3, "Ahmet", "EKER", 18000, "Elktronik");
        Sekreter sekreter = new Sekreter(4, "Ayşe", "BOZ", 13000, 123456);
        IdariMemur idariMemur = new IdariMemur(5, "Murat", "KURU", 17000, "Lojistik");

      /*
        Personel[] personels = new Personel[5];
        personels[0] = mudur;
        personels[1] = muhendis1;
        personels[2] = muhendis2;
        personels[3] = sekreter;
        personels[4] = idariMemur;
        */


        Personel[] personels = {mudur, muhendis1, muhendis2, sekreter, idariMemur};

        Sube teknikSube = new Sube(personels);

        teknikSube.subedekiPersonelleriListele();

        Muhendis muhendis3 = new Muhendis(6, "Fatih", "SOLAK", 25000, "Bilgisayar");
        teknikSube.subeyePersonelEkle(muhendis3);
        System.out.println();
        teknikSube.subedekiPersonelleriListele();
        System.out.println();
        teknikSube.personelAra(5);

        maasiGoster(muhendis2);

    }
}