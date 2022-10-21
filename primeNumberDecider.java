
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafea8846
 */
public class primeNumberDecider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long primeNum = input.nextInt();
        int factors = 0;
        while (factors < 2) {
            for (long i = 1L; i < primeNum+1; i++) {
                if (primeNum %i == 0) {
                    factors++;
                }
            }
        }
        if (factors == 2) {
            System.out.println(primeNum + " is a prime number");
        } else {
            System.out.println(primeNum + " is not a prime number");
        }

    }

}
