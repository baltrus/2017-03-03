package uzduotis1_4;

import java.util.Scanner;

/**
 * Created by Baltramiejus on 2017-03-03.
 */
public class Uzduotis1_4 {
    public static int sk1;
    public static int sk2;

    public Uzduotis1_4(){
        ivestis();
        isvestis();
    }

    public static void ivestis() {
        System.out.println("Prašau įvesti du skaičius: atspausdinsiu jų sumą ir skirtumą:");
        Scanner skaicius1 = new Scanner(System.in);
        sk1 = skaicius1.nextInt();
        Scanner skaicius2 = new Scanner(System.in);
        sk2 = skaicius2.nextInt();
    }

    public static int suma() {
        int suma = sk1 + sk2;
        return suma;
    }

    public static int skirtumas() {
        int skirtumas = sk1 - sk2;
        return skirtumas;
    }

    public static void isvestis() {
        System.out.println("Jūsų įvestų skaičių suma yra " + suma());
        System.out.println("Jūsų įvestų skaičių skirtumas yra " + skirtumas());

    }

}
