import java.util.*;

abstract class Padaan {
    Date ognoo;
    List<PadaanMuri> muruud = new ArrayList<>();

    public Padaan(Date ognoo) {
        this.ognoo = ognoo;
    }

    public void nemeh(PadaanMuri mur) {
        muruud.add(mur);
    }

    public void hevleh() {
        System.out.println("Огноо: " + ognoo);
        System.out.println("Бараанууд:");
        for (PadaanMuri mur : muruud) {
            System.out.println("  " + mur.baraa.ner + ": " + mur.too + " ширхэг");
        }
    }
}