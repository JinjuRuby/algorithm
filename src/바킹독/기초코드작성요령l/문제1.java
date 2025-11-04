package 바킹독.기초코드작성요령l;

public class 문제1 {

    /**
     * N 이하의 자연수 중에서 3의 배수이거나 5의 배수인 수를 모두 합한 값
     */
    public static void main(String[] args) {

        func1(16);
        func1(34567);
        func1(27639);

        System.out.println("func1(16) = " + func1(16));
        System.out.println("func1(34567) = " + func1(34567));
        System.out.println("func1(27639) = " + func1(27639));
    }

    public static int func1(int N) {

        int total = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }
        return total;
    }
}
