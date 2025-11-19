package 바킹독.재귀;

public class func {

    public static void main(String[] args) {

        func1(3);
    }

    private static void func1(int n) {

        if (n == 0) return;
        System.out.println(n);
        func1(n - 1);
    }
}
