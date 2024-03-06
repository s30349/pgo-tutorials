import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba= scanner.nextInt();
        if (liczba>0){
            System.out.println("The number is positive");
        } else if (liczba<0) {
            System.out.println("The number is negative");
        }
        else if (liczba==0) {
            System.out.println("The value equals 0");
        }

    }
}