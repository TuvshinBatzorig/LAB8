import java.util.*;

class Nyraw {
    String ner;
    Aguulah aguulah;

    public Nyraw(String ner, Aguulah aguulah) {
        this.ner = ner;
        this.aguulah = aguulah;
    }

    public void baraaHuleenAvah(Baraa b, int too) {
        b.too += too;
        System.out.println(ner + " нь " + b.ner + " -аас " + too + " ширхэг хүлээн авлаа");
    }

    public void baraaGargah(Baraa b, int too) {
        if (b.too >= too) {
            b.too -= too;
            System.out.println(ner + " нь " + b.ner + " -аас " + too + " ширхэг гаргалаа");
        } else {
            System.out.println("Алдаа: " + b.ner + " -д хангалттай бараа байхгүй!");
        }
    }

    public void uldegdelHarah() {
        System.out.println("\n=== " + ner + " НЯРАВЫН ҮЛДЭГДЭЛ ХЯНАЛТ ===");
        aguulah.uldegdelHarah();
    }

    public void tailanGargah(Date ehleh, Date duusah) {
        System.out.println("\n=== " + ner + " НЯРАВЫН ТАЙЛАН ===");
        System.out.println("Огноо: " + ehleh + " - " + duusah);
        aguulah.uldegdelHarah();
    }

    public void toollogoHiih(Baraa b, int бодитToo) {
        System.out.println("\n=== ТООЛОГО ХИЙХ ===");
        System.out.println("Бараа: " + b.ner);
        System.out.println("Системд: " + b.too + " ширхэг");
        System.out.println("Бодит: " + бодитToo + " ширхэг");
        if (b.too != бодитToo) {
            System.out.println("Зөрүү: " + Math.abs(b.too - бодитToo) + " ширхэг");
        } else {
            System.out.println("Тэнцүү байна");
        }
    }
}