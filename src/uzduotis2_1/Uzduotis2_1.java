package uzduotis2_1;

import java.util.Scanner;

/**
 * Created by Baltramiejus Jakstys on 3/6/2017.
 */
public class Uzduotis2_1 {
    public Uzduotis2_1(){
        System.out.println("Įveskite pasirinktą skaičių, o aš tau atsakysiu, ar šis skaičius lyginis:");
        Scanner nuskaitymas = new Scanner(System.in);
        int sk = nuskaitymas.nextInt();
        if (sk%2==0){
            System.out.println("Jūsų įvestas skaičius yra lyginis");
        }
        else{
            System.out.println("Jūsų įvestas skaičius yra nelyginis");
        }
    }
}
