package newrev;


import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        System.out.print("Series: ");
        int term = 33;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(term + " ");
            sum += term;
            term += i + 1;
        }
        System.out.println();

        System.out.println("Sumof the series is " + sum);

        
        double average = (double) sum / n;
        System.out.println("Average of the series is " + average);
    }
}
