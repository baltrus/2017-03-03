package uzduotis2_4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Baltramiejus Jakstys on 3/6/2017.
 */
public class Uzduotis2_4 {
    public Uzduotis2_4() {

        int x = -1;
        System.out.println("Įveskite pasirinktą skaičių. Skaicius 0 uždarys programą ir pateiks visų jūsų įvestų skaičių sumą");
        int suma = 0;
        while (x != 0) {
            try {
                Scanner sc = new Scanner(System.in);
                x = sc.nextInt();
                suma += x; //tas pats kas "suma = suma + x;
            }catch (InputMismatchException e){
                System.out.println("Netinkamas skaičius");
            }
        }
        System.out.println("Programa baigta, visų jūsų suvestų skaičių sumą yra: " + suma);
        //break;
    }
}
