package pamokos;

import uzduotis1_1.Uzduotis1_1;
import uzduotis1_2.Uzduotis1_2;
import uzduotis1_3.Uzduotis1_3;
import uzduotis1_4.Uzduotis1_4;
import uzduotis1_5.Uzduotis1_5;
import uzduotis2_1.Uzduotis2_1;
import uzduotis2_2.Uzduotis2_2;
import uzduotis2_3.Uzduotis2_3;
import uzduotis2_4.Uzduotis2_4;
import uzduotis2_5.Uzduotis2_5;
import uzduotis2_6.Uzduotis2_6;
import uzduotis2_7.Uzduotis2_7;
//Shift+ F6

import java.util.Scanner;

/**
 * Created by Baltramiejus Jakstys on 3/6/2017.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Iveskite skaiciu nuo 1 iki 11");
        Scanner nuskaitymas = new Scanner(System.in);
        int sk = nuskaitymas.nextInt();
        switch (sk) {
            case (1):
                Uzduotis1_1 uzduotis1_1 = new Uzduotis1_1();
                break;
            case (2):
                Uzduotis1_2 uzduotis1_2 = new Uzduotis1_2();
                break;
            case (3):
                Uzduotis1_3 uzduotis1_3 = new Uzduotis1_3();
                break;
            case (4):
                Uzduotis1_4 uzduotis1_4 = new Uzduotis1_4();
                break;
            case (5):
                Uzduotis1_5 uzduotis1_5 = new Uzduotis1_5();
                break;
            case (6):
                Uzduotis2_1 uzduotis2_1 = new Uzduotis2_1();
                break;
            case (7):
                Uzduotis2_2 uzduotis2_2 = new Uzduotis2_2();
                break;
            case (8):
                Uzduotis2_3 uzduotis2_3 = new Uzduotis2_3();
                break;
            case (9):
                Uzduotis2_4 uzduotis2_4 = new Uzduotis2_4();
                break;
            case (10):
                Uzduotis2_5 uzduotis2_5 = new Uzduotis2_5();
                System.out.println("Įvesk masyvo ilgį. Tai turi būti sveikasis skaičius.");
                Scanner sc = new Scanner(System.in);
                uzduotis2_5.nuskaitymas(sc.nextInt());
                uzduotis2_5.skaiciavimas();
                break;
            case (11):
                Uzduotis2_6 uzduotis2_6 = new Uzduotis2_6();
                break;
            case (12):
                Uzduotis2_7 uzduotis2_7 = new Uzduotis2_7();
                break;
        }
    }
}

