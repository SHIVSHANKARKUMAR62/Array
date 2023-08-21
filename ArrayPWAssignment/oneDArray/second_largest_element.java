package Data_Structure.ArrayPWAssignment.oneDArray;

import java.util.Scanner;

public class second_largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0,max2=0;
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

        for (int s : arr){
            max = Math.max(max,s);
        }

        for (int s : arr){
            if (s!=max){
                max2 = Math.max(max2,s);
            }
        }

        System.out.print("\nSecond Max element in the array is: "+max2);
    }
}
