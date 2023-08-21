package Data_Structure.ArrayPWAssignment.oneDArray;

import java.util.Scanner;

public class the_first_peak_element_in_the_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array element: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements are: ");
        for (int s : arr){ // using for each loop
            System.out.print(s+" ");
        }

        for (int i=1;i<n-1;i++){
            if (arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                value = arr[i];
                break;
            }
        }
        System.out.print("\nThe first peak element in the array is: "+value);
    }
}
