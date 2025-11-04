package 바킹독.기초코드작성요령l;

public class 문제2 {

    /**
     * 길이 N의 int 배열 arr에서 합이 100인 서로다른 위치의 두 원소가 존재하면 1을, 존재하지 않으면 0을 반환
     */
    public static void main(String[] args) {

        func2(new int[]{1, 52, 48}, 3);
        func2(new int[]{50, 42}, 2);
        func2(new int[]{4, 13, 63, 87}, 4);

        System.out.println("func2(new int[]{1, 52, 48}, 3) = " + func2(new int[]{1, 52, 48}, 3));
        System.out.println("func2(new int[]{50, 42}, 2) = " + func2(new int[]{50, 42}, 2));
        System.out.println("func2(new int[]{4, 13, 63, 87}, 4) = " + func2(new int[]{4, 13, 63, 87}, 4));

    }

    public static int func2(int[] arr, int N) {

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] + arr[j] == 100) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
