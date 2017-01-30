
package guess;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
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
       System.out.println("^-^ ---> you did it!");

    }
    
}
