import java.util.*;

class Tailan {
    public void uldegdelTailan(List<Baraa> list) {
        System.out.println("\n=== ҮЛДЭГДЛИЙН ТАЙЛАН ===");
        int niit = 0;
        for (Baraa b : list) {
            System.out.println(b.ner + ": " + b.too + " ширхэг");
            niit += b.too;
        }
        System.out.println("Нийт бараа: " + niit + " ширхэг");
    }
}