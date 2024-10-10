import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] reverseArr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        while (n != 0){
            reverseArr[i] = arr[n-1];
            n --;
            i ++;
        }
        for (int j : reverseArr) System.out.print(j + " ");
        System.out.println();
    }
}
