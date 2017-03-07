package uzduotis1_3;

import java.util.Scanner;

/**
 * Created by Baltramiejus on 2017-03-03.
 */
public class Uzduotis1_3 {
    public Uzduotis1_3(){
        System.out.println("Prašau įvesti du skaičius: atspausdinsiu jų sumą ir skirtumą:");
        Scanner skaicius1 = new Scanner(System.in);
        int sk1 = skaicius1.nextInt();
        Scanner skaicius2 = new Scanner(System.in);
        int sk2 = skaicius2.nextInt();
        int suma = sk1 + sk2;
        int skirtumas = sk1 - sk2;
        System.out.println("Jūsų įvestų skaičių suma yra " + suma);
        System.out.println("Jūsų įvestų skaičių skirtumas yra " + skirtumas);
    }
}
