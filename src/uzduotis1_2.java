import java.util.Scanner;

/**
 * Created by Baltramiejus on 2017-03-03.
 */
public class uzduotis1_2 {
    public static void main(String[] arg){
        System.out.println("Prašau įvesti sugalvotą žodį, mes jums pateiksime kiek raidžių jį sudaro:");
        Scanner skaneris = new Scanner(System.in);
        String zodis = skaneris.next();
        int a = zodis.length();
        System.out.println("Jūsų žodį sudaro: " + a + " raidžių.");
    }
}
