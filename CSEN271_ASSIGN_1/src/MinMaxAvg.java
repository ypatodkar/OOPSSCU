import java.util.Scanner;

public class MinMaxAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        int avg = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            avg += arr[i];
        }
        avg /= n;
        System.out.println("The minimum element is " + min);
        System.out.println("The maximum element is " + max);
        System.out.println("The average element is " + avg);
    }
}
