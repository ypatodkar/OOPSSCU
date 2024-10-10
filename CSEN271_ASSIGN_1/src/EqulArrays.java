import java.util.Scanner;

public class EqulArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array 1");
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        System.out.println("Enter the elements of the array 1");
        for (int i = 0; i < n1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the array 2");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n2];
        System.out.println("Enter the elements of the array 2");
        for (int i = 0; i < n2; i++) {
            arr1[i] = sc.nextInt();
        }
        boolean equal = true;
        if (n1 != n2) {
            System.out.println("Arrays are not equal");
        }
        else {
            for (int i = 0; i < n1; i++) {
                if (arr[i] != arr1[i]) {
                    System.out.println("Arrays are not equal");
                    equal = false;
                    break;
                }
            }
        }
        if (equal) {
            System.out.println("Arrays are equal");
        }

    }
}
