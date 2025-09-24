package 베이직;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // printlm() : 출력 후 엔터 처리
        // print() : 출력(엔터 없음)
        // printf() : 포맷지정(엔터 없음)
        System.out.print("두자리 정수: ");
        String num = sc.nextLine(); // 35 => "35"
        System.out.println("num =" + num);
        System.out.println("num =" + (num + 1)); // "35"+ 1:연결
        // "35" => 35
        int input = Integer.parseInt(num);
        System.out.println("input =" + input);
        System.out.println("input =" + (input + 1));

    }
}
