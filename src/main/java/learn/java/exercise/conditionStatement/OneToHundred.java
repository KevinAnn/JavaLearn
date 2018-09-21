package learn.java.exercise.conditionStatement;

/**
 * print 1 to 100 with several kinds of condition statements
 */
public class OneToHundred {

    public static void main(String[] args) {

        // for
        System.out.println("==========1to100(for)==========");
        for (int i = 1; i <= 100; i ++) {
            System.out.println(i);
        }

        // for each
        System.out.println("==========1to100(for each)==========");
        int[] a = new int[100];
        for (int i = 0;i < a.length;i ++) {
            a[i] = i + 1;
        }
        for (int i : a) {
            System.out.println(i);
        }

        // while
        System.out.println("==========1to100(while)==========");
        int b = 1;
        while (b <= 100) {
            System.out.println(b);
            b ++;
        }

        // do while
        System.out.println("==========1to100(do while)==========");
        int c = 1;
        do {
            System.out.println(c);
            c ++;
        } while (c <= 100);

        // if
        System.out.println("==========1to100(if)==========");
        accumulation(1);

        // for each use range
        System.out.println("==========1 to n(for each range)==========");
        for (int i : range(10)) {
            System.out.println(i);
        }

        System.out.println("==========n to m(for each range)==========");
        for (int i : range(10, 20)) {
            System.out.println(i);
        }





    }


    /**
     * print 1 to 100 by recursion
     * @param i
     */
    public static void accumulation(int i) {
        System.out.println(i);
        i ++;
        if (i <= 100) {
            accumulation(i);
        }
    }

    /**
     * generate array contain 0 to n
     * @param n
     * @return
     */
    public static int[] range(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++) {
            arr[i] = i;
        }
        return  arr;
    }

    /**
     * generate array contain n to m
     * @param n
     * @param m
     * @return
     */
    public static int[] range(int n, int m) {
        int[] arr = new int[m - n];
        for (int i = 0; i < m - n; i ++) {
            arr[i] = n + i;
        }
        return arr;
    }



}
