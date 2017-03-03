import java.util.Scanner;

/**
 * Created by Baltramiejus on 2017-03-03.
 */
public class uzduotis1_5 {
    public static int sk1;
    public static int sk2;
//    public static float sk1;
//    public static float sk2;

    public static void main(String[] arg) {
        ivestis();
        isvestis();
    }

    public static void ivestis() {
        System.out.println("Prašau įvesti du skaičius: atspausdinsiu jų sumą ir skirtumą:");
        Scanner skaicius1 = new Scanner(System.in);
        sk1 = skaicius1.nextInt();
//        sk1 = skaicius1.nextFloat();
        Scanner skaicius2 = new Scanner(System.in);
        sk2 = skaicius2.nextInt();
//        sk2 = skaicius2.nextFloat();
    }

    public static int suma1(int sk1, int sk2) {
        int suma1 = sk1 + sk2;
        return suma1;
    }

    public static float suma(float sk1, float sk2) {
        float suma = sk1 + sk2;
        return suma;
    }

    public static int skirtumas1(int sk1, int sk2) {
        int skirtumas1 = sk1 - sk2;
        return skirtumas1;
    }

    public static float skirtumas(float sk1, float sk2) {
        float skirtumas = sk1 - sk2;
        return skirtumas;
    }

    public static void isvestis() {
        System.out.println("Jūsų įvestų skaičių suma yra " + suma1(sk1, sk2));
        System.out.println("Jūsų įvestų skaičių suma yra " + suma(sk1, sk2));
        System.out.println("Jūsų įvestų skaičių skirtumas yra " + skirtumas1(sk1, sk2));
        System.out.println("Jūsų įvestų skaičių skirtumas yra " + skirtumas(sk1, sk2));

    }

}
