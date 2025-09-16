import java.util.Scanner;

public class array {
    public static void main(String[] args){
//        int[] number = {110, 20, 30, 40, 50};
//
//        for(int i=0;  i< number.length; i++){
//            System.out.println(number[i]);
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array: ");
//        int a = sc.nextInt();
//
//        int arr[] = new int[a];
//
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < a; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//
//        System.out.println("You entered:");
//        for (int i = 0; i < a; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        sc.close();
//        Scanner input = new Scanner(System.in);
//
//        int num = input.nextInt();
//        int[] arr = new int[num];
//        for (int i = 0; i < num; i++) {
//            arr[i] = input.nextInt();
//        }
//
//        int choice;
//        do {
//            System.out.println("1. Update");
//            System.out.println("2. Delete");
//            System.out.println("3. Print");
//            System.out.println("4. Exit");
//            choice = input.nextInt();
//
//            if (choice == 1) {
//                int index = input.nextInt();
//                int value = input.nextInt();
//                if (index >= 0 && index < num) {
//                    arr[index] = value;
//                }
//            }
//            else if (choice == 2) {
//                int index = input.nextInt();
//                if (index >= 0 && index < num) {
//                    for (int i = index; i < num - 1; i++) {
//                        arr[i] = arr[i + 1];
//                    }
//                    num--;
//                }
//            }
//            else if (choice == 3) {
//                for (int i = 0; i < num; i++) {
//                    System.out.print(arr[i] + " ");
//                }
//                System.out.println();
//            }
//
//        } while (choice != 4);
//
//        input.close();
//        int num = 1;
//        int num1=2;
//        System.out.println(num>num1);
        // enter two arrays and add their row and colons sum of rows and sum of columns java
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        // Input matrix A
        System.out.println("Enter elements of first matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input matrix B
        System.out.println("Enter elements of second matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Add matrices
        System.out.println("Sum of matrices (A + B):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = A[i][j] + B[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        // Sum of each row
        System.out.println("\nRow sums:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += sum[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum = " + rowSum);
        }

        // Sum of each column
        System.out.println("\nColumn sums:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += sum[i][j];
            }
            System.out.println("Column " + (j + 1) + " sum = " + colSum);
        }

        sc.close();


    }
}
