package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int f;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your temperature in fahrenheit");
        f = scanner.nextInt();

        System.out.println("The temperature in celsius is " + 5 * ((f-32) / 9));
    }
}
