package array.ex;

import java.util.Scanner;

public class ArrayEX2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요:");
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            nums[i] = num;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(nums[i]);
            if (i < 4) {
                System.out.print(", ");
            }
        }
    }
}
