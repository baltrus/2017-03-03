package uzduotis2_3;

import java.util.Scanner;

/**
 * Created by Baltramiejus Jakstys on 3/6/2017.
 */
public class Uzduotis2_3 {
    public Uzduotis2_3() {
        int x = -1;
        System.out.println("Įveskite pasirinktą skaičių. Skaicius 0 uždarys programą ir pateiks visų jūsų įvestų skaičių sumą");
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        x = sc.nextInt();
        while (x != 0) {
            suma += x; //tas pats kas "suma = suma + x;
            x = sc.nextInt();
        }
        System.out.println("Programa baigta, visų jūsų suvestų skaičių sumą yra: " + suma);
        //break;
    }
}

