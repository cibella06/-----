package 오퍼레이터;

public class 오퍼레이터Ex5 {
    public static void main(String[] args) {
        // 삼항연산자
        // 조건? 참일때 : 거짓일때
        // a > 10 ?"크다" : "작다"
        int x = 10, y = -5, z = 0;

        int rsult1 = x >= 0 ? x : -x;
        int rsult2 = y >= 0 ? y : -y;
        int rsult3 = z >= 0 ? z : -z;

        // 0 : 기호 없음, > 0 : +, < 0 : -
        char sign1, sign2, sign3;
        sign1 = x > 0 ? '+' : (x == 0 ? ' ' : '-');
        sign2 = y > 0 ? '+' : (y == 0 ? ' ' : '-');
        sign3 = z > 0 ? '+' : (z == 0 ? ' ' : '-');

        // x = +10
        System.out.printf("x = %c%d\n", sign1, rsult1);
        System.out.printf("y = %c%d\n", sign2, rsult2);
        System.out.printf("z = %c%d\n", sign3, rsult3);

    }
}
