package 베이직;

public class 베리어블1 {
    public static void main(String[] args) {
        // 변수 선언 후 값 할당
        int num = 10;
        // + : 연결
        int sum = num + 20;
        System.out.println("num 변수 값 :" + num);
        System.out.println("num + 20 = " + sum);
        System.out.printf("num 변수 값  : %d", num);

        int age = 25, maxSpeed = 10;
        System.out.println("age=" + age + ",maxSpeed=" + maxSpeed);
        System.out.printf("age = %d ,maxSpeed=%", age, maxSpeed);
        num = 35;
        // 상수 선언과 할당
        final int MAX_SPEED = 20;
        System.out.println(MAX_SPEED);
        // MAX_SPEED = 30;}
    }
}