package dataTypes;

public class FirstSectionSorular {
    public static void main(String[] args) {

        String stringSayi = "150";
        int integerDegiskeni = Integer.parseInt(stringSayi);
        int integerDegiskeni1 = Integer.valueOf(stringSayi);
        System.out.println("String değişkeni integer değişkenine çevrildi \nParseIntMetodyla : "  + integerDegiskeni);
        System.out.println("String değişkeni integer değişkenine çevrildi \nvalueOfMetodyla : "  + integerDegiskeni);


        System.out.println(128/17);
        System.out.println(128/17.f);
        System.out.println(128/17.d);
        float sonuc =  32f/2F;
        System.out.println(sonuc);

        String x ="Bro";
        String y = "Hello";
        String temp;
        x = y;
        temp = x;
        y = "Merhaba";
        y = x;
        System.out.println(temp);
        System.out.println(x);
        System.out.println(y);



     double fahrenheit = 100d;
     double celcius;
     celcius = (5d/9)*(fahrenheit-32);
        System.out.println(celcius);














    }
}
