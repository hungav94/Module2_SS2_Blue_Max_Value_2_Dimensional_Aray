import java.util.Scanner;

public class MaxValue2DimensionalArray {

    public static int maxValue(int arr[][]) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int[][] inputArrayRowxCol(int[][] arr, int row, int col) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Input interger value " + i + " " + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
//        int arr[][] = {
//                {11, 2, 3, 4},
//                {5, 6, 7, 8},
//                {2, 3, 4, 5},
//                {6, 7, 8, 9}
//        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Row: ");
        int row = scanner.nextInt();
        System.out.print("Input Col: ");
        int col = scanner.nextInt();

        int[][] arr = new int[row][col];
        arr = inputArrayRowxCol(arr, row, col);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        int result = maxValue(arr);
        System.out.println("\nGia tri lon nhat cua mang 2 chieu la: " + result);

    }
}
