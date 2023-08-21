package Data_Structure.ArrayPWAssignment.oneDArray;

import java.util.Scanner;

public class sum_of_even_index_in_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array element: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements are: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        int sum = 0;
        for (int i=0;i<n;i++){
            if (i%2==0){
                sum += arr[i];
            }
        }
        System.out.print("\nSum of all the elements present on even indices is "+sum);
    }
}
