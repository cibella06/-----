package 베이직;

public class 베리어블 {
    public static void main(String[] args) {
        // 논리형 : 참, 거짓을 표현
        boolean flag = false;
        System.out.println(flag ? "진짜임" : " 구라임 ");
        // 문자형
        char ch = 'a', ch2 = '가';
        // char ch3 = 'ab';
        // 문자열 : ""
        // String ch3= "a";
        System.out.println("ch = " + ch + ",ch2=" + ch2);
        System.out.println("ch=" + (ch + 1)); // 98
        System.out.println("ch2=" + (ch2 + 1)); // 44033
        System.out.print("ch2=" + (ch2 + 1)); // 44033 ｓ;
        System.out.printf("ch2=" + (ch2 + 1)); // 44033

    }
}
