import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;
        int total = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Üs alınacak sayıyı giriniz : ");
        firstNumber = input.nextInt();

        System.out.print("Üssü alınacak sayıyının kaçıncı üssü alınacağını giriniz : ");
        secondNumber = input.nextInt();

        for (int i = 1; i <= secondNumber; i++) {
            total = total * firstNumber;
        }

        System.out.println("Sonuç : " + total);
    }
}
