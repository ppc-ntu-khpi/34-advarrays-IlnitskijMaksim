import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


 /**
 * The class Main
 */ 
public class Main {

/** 
 *
 * Main
 *
 * @param args  the args. 
 */
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Введення розмірів матриць
        System.out.print("Write size of matrix A (N x M): ");
        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.print("Write size of matrix B (M x Q): ");
        int M1 = sc.nextInt();
        int Q = sc.nextInt();

        // Оголошення матриць A, B та результату
        int[][] A = new int[N][M];
        int[][] B = new int[M1][Q];
        int[][] result = new int[N][Q];

        // Заповнення елементів матриці A рандомними числами
        Arrays.setAll(A, i -> Arrays.stream(new int[M]).map(j -> rand.nextInt(10)).toArray());

        // Заповнення елементів матриці B рандомними числами
        Arrays.setAll(B, i -> Arrays.stream(new int[Q]).map(j -> rand.nextInt(10)).toArray());

        // Обчислення добутку матриць
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < Q; j++) {
                for (int k = 0; k < M; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Виведення результатів
        System.out.println("Randomized matrix A:");
        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(A[i]));
        }

        System.out.println("Randomized matrix B:");
        for (int i = 0; i < M1; i++) {
            System.out.println(Arrays.toString(B[i]));
        }

        System.out.println("Matrix multiplication:");
        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
