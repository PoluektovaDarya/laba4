import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
            sum += arr[i];
        }

        double average = (double) sum / n;
        double result = min + average;

        System.out.println("Result: " + result);
    }
}
