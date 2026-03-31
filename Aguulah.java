import java.util.*;

class Aguulah {
    String ner;
    List<Baraa> baraanuud = new ArrayList<>();

    public Aguulah(String ner) {
        this.ner = ner;
    }

    public void baraaNemeh(Baraa b) {
        baraanuud.add(b);
        System.out.println("Бараа нэмэгдлээ: " + b.ner + " - " + b.too + " ширхэг");
    }

    public void baraaHasah(Baraa b) {
        baraanuud.remove(b);
        System.out.println("Бараа хасагдлаа: " + b.ner);
    }

    public void uldegdelHarah() {
        System.out.println("\n=== АГУУЛАХЫН ҮЛДЭГДЭЛ ===");
        for (Baraa b : baraanuud) {
            System.out.println(b.ner + ": " + b.too + " ширхэг");
        }
    }
}