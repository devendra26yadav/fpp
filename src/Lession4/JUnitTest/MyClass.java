package Lession4.JUnitTest;

public class MyClass {
    public static int fact(int num) {
        if (num == 0 || num == 1) return 1;
        else
            return num * fact(num - 1);
    }

    public static int sum(int n) {
        if (n == 1)
            return 1;
        else
            return sum(n - 1) + n;
    }
}

