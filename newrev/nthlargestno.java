package newrev;

public class nthlargestno {
    public static void main(String[] args) {
        int[] numbers = {9, 4, 7, 1, 3, 6, 8, 2, 5};
        int n = 3;

        int nthLarge = findnthNo(numbers, n);
        System.out.println("The " + n + "th largest number is: " + nthLarge);
    }

    public static int findnthNo(int[] numbers, int n) {
        if (n <= 0 || n > numbers.length) {
            throw new IllegalArgumentException("n keval range me hona chahiye");
        }

        // selection sort
        for (int i = 0; i < n; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(numbers, i, maxIndex);
        }

        return numbers[n - 1];
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
