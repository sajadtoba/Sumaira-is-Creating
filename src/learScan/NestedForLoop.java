package learScan;

import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {


        Scanner number=new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int numOfRow=number.nextInt();
        for (int i = 1; i<=numOfRow; i++){
            for (int j=1; j<=i; j++) {
                System.out.print(j+"    ");
            }
        System.out.println();
        }
    } }
