package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner count = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int n = count.nextInt();

        System.out.println(n + "개의 정수를 입력하세요:");

        Scanner input = new Scanner(System.in);
        int[] arr = new int[n];
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);

    }
}
