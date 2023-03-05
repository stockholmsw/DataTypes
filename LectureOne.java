package dataTypes;

public class LectureOne {
    public static void main(String[] args) {
        char harf = 'b';
        System.out.println("Sectiğimiz harf : " + harf);
        int integerDeger = 'B';
        System.out.println(integerDeger);// ASCII sistemine göre değeri;

        boolean dogruMu = false; // default değeri ;
        int sayi1 = 0; // default değeri ;
        float sayi = 0; // default değeri ;
        double sayi2 = 0;// default değeri;
        char harf1 = 0;
        int intdeger = '0';
        /*
        System.out.println(intdeger);
        System.out.println(harf1);
        System.out.println(sayi2);
        System.out.println(sayi);
        System.out.println(sayi1);
        System.out.println(dogruMu);

         */

       // WRAPPER SINIFLAR;
        System.out.println("Integer En büyük değeri : " + Integer.MAX_VALUE);
        System.out.println("Integer En küçük değeri : " + Integer.MIN_VALUE);
        System.out.println("Double  En büyük değeri : " + Double.MAX_VALUE);
        System.out.println("Double  En büyük değeri : " + Double.MIN_VALUE);
        System.out.println("Float   En büyük değeri : " + Float.MAX_VALUE);
        System.out.println("Float  En küçük değeri : " + Float.MIN_VALUE);


    }
}
