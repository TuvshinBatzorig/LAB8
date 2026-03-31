import java.util.*;

public class WarehouseJava {
    public static void main(String[] args) {
        System.out.println("=== АГУУЛАХЫН СИСТЕМ ЭХЛЭЖ БАЙНА ===");

        // Агуулах үүсгэх
        Aguulah a = new Aguulah("Төв агуулах");
        System.out.println("Агуулах үүсгэгдлээ: " + a.ner);

        // Нярав үүсгэх
        Nyraw n = new Nyraw("Бат", a);
        System.out.println("Нярав үүсгэгдлээ: " + n.ner);

        // Бараа үүсгэх
        Baraa b1 = new Baraa("Гурил", 100);
        Baraa b2 = new Baraa("Сүү", 50);
        Baraa b3 = new Baraa("Өндөг", 200);

        // Агуулахад бараа нэмэх
        a.baraaNemeh(b1);
        a.baraaNemeh(b2);
        a.baraaNemeh(b3);

        // Нярав бараа хүлээн авах
        n.baraaHuleenAvah(b1, 50); // Гурил 50 нэмэх
        n.baraaHuleenAvah(b2, 25); // Сүү 25 нэмэх

        // Нярав бараа гаргах
        n.baraaGargah(b1, 30); // Гурил 30 гаргах
        n.baraaGargah(b3, 50); // Өндөг 50 гаргах

        // Үлдэгдэл харах
        n.uldegdelHarah();

        // Тайлан гаргах
        n.tailanGargah(new Date(), new Date());

        // Тооллого хийх
        n.toollogoHiih(b1, 120); // Гурил бодит тооллого

        // Падаан үүсгэх
        OrlogynPadaan orlogynPadaan = new OrlogynPadaan(new Date(), "Нийлүүлэгч А");
        orlogynPadaan.nemeh(new PadaanMuri(b1, 50));
        orlogynPadaan.nemeh(new PadaanMuri(b2, 25));

        ZarlagynPadaan zarlagynPadaan = new ZarlagynPadaan(new Date(), "Худалдан авагч Б");
        zarlagynPadaan.nemeh(new PadaanMuri(b1, 30));
        zarlagynPadaan.nemeh(new PadaanMuri(b3, 50));

        System.out.println("\n=== ОРЛОГЫН ПАДААН ===");
        orlogynPadaan.hevleh();

        System.out.println("\n=== ЗАРЛАГЫН ПАДААН ===");
        zarlagynPadaan.hevleh();

        // Тайлан класс ашиглах
        Tailan tailan = new Tailan();
        tailan.uldegdelTailan(a.baraanuud);

        System.out.println("\nАгуулахын систем амжилттай ажиллаж байна!");
    }
}