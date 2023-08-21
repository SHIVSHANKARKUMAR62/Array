package Data_Structure.ArrayPWAssignment.oneDArray;

import java.util.Scanner;

public class traverse {
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
        for (int s : arr){ // using for each loop
            System.out.print(s+" ");
        }

        System.out.print("\nEven elements are: ");
        for (int s : arr){ // using for each loop
            if (s%2==0){
                System.out.print(s+" ");
            }
        }
    }
}
