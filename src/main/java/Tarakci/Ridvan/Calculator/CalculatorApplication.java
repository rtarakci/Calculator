package Tarakci.Ridvan.Calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);

        Scanner sc = new Scanner(System.in);
        System.out.print("Eingabe 1:");
        double x1 = sc.nextDouble();
        System.out.print("Eingabe 2: ");
        double x2 = sc.nextDouble();

        System.out.println("Ergebnis: " + ((x1+x2)/(x1*x2)));

    }

}
