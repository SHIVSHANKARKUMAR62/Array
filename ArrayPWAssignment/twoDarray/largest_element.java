package Data_Structure.ArrayPWAssignment.twoDarray;

import java.util.Scanner;

public class largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter Matrix element: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nMatrix elements are: ");
        for (int []num1 : arr){
            for (int num2 : num1){
                System.out.print(num2+" ");
            }
            System.out.println();
        }

        int result = 0;

        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                result = Math.max(result,arr[i][j]);
            }
        }
        System.out.println("The largest element of a given 2D array is: "+result);
    }
}
