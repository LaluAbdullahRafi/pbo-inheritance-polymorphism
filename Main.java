public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMO OBJEK BERSATU (POLYMORPHISM) ===");

        Bentuk b1 = new Bentuk("Merah");
        Bentuk b2 = new BujurSangkar(5.0, "Biru");
        Bentuk b3 = new Lingkaran(7.0, "Kuning");
        Bentuk b4 = new Silinder(10.0, 3.5, "Hijau");

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();
        b4.printInfo();

        System.out.println("\n=== DEMO ENCAPSULATION (GETTER/SETTER) ===");
        BujurSangkar bs = new BujurSangkar(4.0, "Hitam");
        System.out.println("Sisi awal: " + bs.getSisi());
        bs.setSisi(8.0);
        bs.setWarna("Putih");
        bs.printInfo();
    }
}