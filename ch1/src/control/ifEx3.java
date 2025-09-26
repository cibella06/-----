
import java.util.Scanner;

public class ifEx3 {
    public static void main(String[] args) {
        // 중첩 if
        // if 블럭 내에 또 다른 if문 포함(횟수 제한 없음)
        // if (true) {
        // if (condition) {
        // if (condition) {

        // } else if (){

        // }
        // } else {

        // }
        // }else{}

        // 점수 입력받기
        // 90점보다 크거다 같으면 A학점
        // 90점 중에서 98점 이상은 A+학점
        // 95 ~ 97점 : A0 학점
        // 90 ~ 94점 : A- 학점

        Scanner sc = new Scanner(System.in);
        int jumsu = Integer.parseInt(sc.nextLine());

        char grade = ' ', opt = '0';

        if (jumsu >= 90) {
            grade = 'A';
            if (jumsu >= 98) {
                opt = '+';
            } else if (jumsu < 95) {
                opt = '-';
            }
        } else if (jumsu >= 80) {
            grade = 'B';

        } else if (jumsu >= 88) {
            opt = '+';
            if (jumsu >= 85) {
                opt = '-';
            } else if (jumsu >= 70) {
                grade = 'C';
            } else if (jumsu >= 78) {
                opt = '+';
            } else if (jumsu < 75) {
                opt = '-';
            }

        }
        {

        }
        // 당신의 학점은 A+입니다
        System.out.printf("당신의 학점은%C%C 입니다.", grade, opt);
    }
}
