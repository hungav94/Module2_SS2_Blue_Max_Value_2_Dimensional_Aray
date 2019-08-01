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

    public static int[][] inputArray4x4(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
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
        int[][] arr = new int[4][4];
        arr = inputArray4x4(arr);

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
