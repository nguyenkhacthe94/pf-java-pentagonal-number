import java.util.Scanner;

public class PentagonalNumber {
    public static int getPentagonalNumber(int n) {
        int number = n*(n*3-1)/2;
        return number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Petagonal number as n = " +n+" is: " + getPentagonalNumber(n));
    }
}
