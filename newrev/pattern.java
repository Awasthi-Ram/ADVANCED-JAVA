package newrev;

public class pattern {
    public static void main(String[] args) {
        int n = 5;

        if (n < 1 || n > 12) {
            System.out.println(" n value not allow as per question");
            return;
        }

        int num = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            num++;
            System.out.println();
        }
    }
}
