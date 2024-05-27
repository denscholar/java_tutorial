
public class DoWhile {

    public static void main(String[] args) {
        // System.out.println("hello world");
        // int i = 3;

        // do {
        //     System.out.println("hello " + i);
        //     i++;
        // } while (i <= 10);
        // for (int i = 1; i <= 10; i++) {
        //     for (int j = 1; j <= 10; j++) {
        //         System.out.print((i * j) + " ");
        //     }
        //     System.out.println();
        // }
        // write a program which prints the even numbers between i and 100 in an increasing order. E.g 2 4 6 8 10 ... 100
        // for (int i = 2; i <= 100; i++) {
        //     if (i % 2 == 0) {
        //         System.out.print(i + " ");
        //     }
        // }

        // resolve the decreasing order
        for (int i = 100; i >= 2; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
