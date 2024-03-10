public class Sube {

    Personel[] personelList;

    public Sube(Personel[] personelList){
        super();
        this.personelList = personelList;
    }

    public void subeyePersonelEkle(Personel personel){

        Personel[] personelListTemp = new Personel[personelList.length + 1];

        for (int i = 0; i< personelList.length; i++){
            personelListTemp[i] = personelList[i];
        }

        personelListTemp[personelList.length] = personel;
        personelList = personelListTemp;
    }

    public void subedekiPersonelleriListele(){

        /*
        for (int i = 0; i < personelList.length; i++){
            System.out.println(personelList[i]);
        }
         */

        for (Personel p : personelList){
            System.out.println(p);
        }
    }

    public void personelAra(int id){
        for (Personel p : personelList){
            if (p.getId() == id){
                System.out.println("Aradığınız personel: " + p);
                return;
            }
        }
        System.err.println(id + " numaralı personel bu şubede bulunamadı");
    }

}
