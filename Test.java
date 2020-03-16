package Test;

public class Test {
    /**
     * 第一题1+2+3+···+100的和
     */
    public static void add() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1+2+3+···+100的和为：" + sum);
    }

    /**
     * 九九乘法表
     */
    public static void multables() {
        int sum = 0;
        System.out.println("九九乘法表：");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                sum = i * j;
                System.out.print(j + " * " + i + " = " + sum + "  ");
            }
            System.out.print("\n");
        }
    }

    /**
     * 1-100所有整数中的单数
     */
    public static void singular() {
        System.out.println("1-100所有整数中的单数:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * 101-200的所有素数以及和
     */
    public static void primenum() {
        System.out.println("\n101-200所有的素数:");
        int sum = 0;
        for (int i = 101; i <= 200; i++) {
            int f = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\n101-200所有的素数和为:" + sum);
    }

    public static void main(String[] args) {
        add();
        multables();
        singular();
        primenum();

    }
}
