package 바킹독.기초코드작성요령l;

public class 문제4 {

    /**
     * N이하의 수 중에서 가장 큰 2의 거듭제곱수를 반환
     */

    public static void main(String[] args) {

        func4(5);
        func4(97615282);
        func4(1024);

        System.out.println("func4(5) = " + func4(5));
        System.out.println("func4(97615282) = " + func4(97615282));
        System.out.println("func4(1024) = " + func4(1024));

    }

    private static int func4(int N) {

        int num = 1;

        // 내 풀이
        /*
        for (int i = 1; num * 2 <= N; i++) {
            num *= 2;
        }
        */

        // 정석
        while (2 * num <= N) {
            num *= 2;
        }



        return num;
    }
}
