package 바킹독.기초코드작성요령l;

public class 문제3 {

    /**
     * N이 제곱수이면 1을 반환하고 제곱수가 아니면 0을 반환
     */
    public static void main(String[] args) {

        func3(9);
        func3(693953651);
        func3(756580036);

        System.out.println("func3(9) = " + func3(9));
        System.out.println("func3(693953651) = " + func3(693953651));
        System.out.println("func3(756580036) = " + func3(756580036));

    }

    private static int func3(int N) {

        for (int i = 1; i * i <= N; i++) {
            if (i * i == N) {
                return 1;
            }
        }

        return 0;
    }
}
