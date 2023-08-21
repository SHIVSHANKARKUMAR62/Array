package Data_Structure.ArrayPWAssignment.oneDArray;

import java.util.Scanner;

public class Max_element_in_the_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
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
        
        for (int i=0;i<n;i++){
            for (int j=1;j<n;j++){
                if (arr[i] > arr[j]) {
                    max = arr[i];
                    break;
                }
            }
        }
        System.out.print("\nMax element in the array is: "+max);
    }
}
