package dataTypes;

public class Casting {
    public static void main(String[] args) {
        int number = 15;
        double commaNumber = 22d;
        commaNumber = number;
        float noktaliSayi = 131.6f;
        number = (int) noktaliSayi;
        System.out.println(number);

        byte byteSayi = 23;
       byteSayi = (byte) noktaliSayi;
        System.out.println(byteSayi);

        int birinciDeger = 16;
        float ikinciDeger = 11.1f;
        double ucuncuDeger = 36;
        birinciDeger = (int) ikinciDeger;
        System.out.println(birinciDeger);
        //
    }
}
