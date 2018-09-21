package learn.java.exercise.conditionStatement;

public class InfiniteIteration {


    public static void main(String[] args) {

        // while(true)
        System.out.println("while");
        int i = 1;
        while (true) {
            System.out.println(i);
            i ++;
            if (i == 10) {
                break;
            }
        }

        // for(;;)
        System.out.println("for");
        int j = 1;
        for (; ; ) {
            System.out.println(j);
            j ++;
            if (j == 10) {
                break;
            }
        }

        // label
        System.out.println("iteration with label");
        labelA:
        for (int a = 0; a < 100; a ++) {
            System.out.println(a);
            if (a == 5) {
                continue labelA;
            }
        }


    }



}
