
package guess;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 * This is made using github
 *
 * @author Administrator Gabe
 */
public class Guess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int answer = 83;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        while (true) {
            System.out.println("Enter a number: ");
            if (sc.nextInt() == answer) {
                break;
            } else {
                System.out.println("Try again");
            }
        }
       System.out.println("_________________88  \n" +
"________________8888  \n" +
"________________8888  \n" +
"_______________888888  \n" +
"______________88888888 \n" +
"_____________8888888888 \n" +
"____________8888888888888 \n" +
"_________888888888888888888 \n" +
"_______8888888888888888888888 \n" +
"_____________8888888888 \n" +
"___________88888888888888 \n" +
"_________888888888888888888 \n" +
"_______8888888888888888888888 \n" +
"____8888888888888888888888888888 \n" +
"___________888888888888888 \n" +
"__________88888888888888888\n" +
"________888888888888888888888 \n" +
"_____8888888888888MERRY888888888\n" +
"__88888888888888CHRISTMAS8888888888 \n" +
"__________888888888888888888  \n" +
"_________88888888888888888888 \n" +
"_______888888888888888888888888\n" +
"_____8888888888888888888888888888\n" +
"__8888888888888888888888888888888888\n" +
"88888888888888__8888888__8888888888888 \n" +
"_________________88888 \n" +
"_________________88888 ");

    }
    
}
