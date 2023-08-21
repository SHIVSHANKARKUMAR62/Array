package Data_Structure.ArrayPWAssignment.twoDarray;

import java.util.Scanner;

public class values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos=0,neg=0,even=0,odd=0,zero=0;
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

        for (int []num1 : arr){
            for (int num2 : num1){
                if (num2>0){
                    pos++;
                } if (num2<0) {
                    neg++;
                }if (num2 % 2 == 0 && num2 > 0) {
                    even++;
                }  if (num2==0) {
                    zero++;
                } if (num2 % 2 != 0 && num2 > 0)  {
                    odd++;
                }
            }
        }

        System.out.println("Number of positive number is: "+pos);
        System.out.println("Number of negative number is: "+neg);
        System.out.println("Number of zero is: "+zero);
        System.out.println("Number of even number is: "+even);
        System.out.print("Number of odd number is: "+odd);

    }
}
