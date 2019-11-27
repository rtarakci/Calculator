package Tarakci.Ridvan.Calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
        boolean x1Number = false, x2Number = false;

        Scanner sc = new Scanner(System.in);
        double x1 = 0 , x2 = 0;
        do try {
            System.out.print("Input 1:");
            x1 = Double.parseDouble(sc.next());
            x1Number = true;
        } catch (Exception e) {
            System.out.println("Not a number, try again");
        } while(!x1Number);
        do {

try {

    System.out.println();
    System.out.print("Input 2: ");
    x2 = Double.parseDouble(sc.next());
    x2Number = true;
}catch (Exception e){
    System.out.println("Not a number, try again");
}
        }while(!x2Number);
        System.out.println("Ergebnis: " + ((x1+x2)/(x1*x2)));

    }

}
