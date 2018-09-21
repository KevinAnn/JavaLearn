package learn.java.exercise.conditionStatement;

import java.util.Random;

public class switchDemo {

    public static void main(String[] args) {

        // 随机生成字母并判断是否是元音字母
        Random random = new Random();
        for (int i = 0; i < 10; i ++) {
            int a = random.nextInt(26) + 'a';
            System.out.print((char) a + ":");
            switch (a) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("元音字母");
                    break;
                default:
                    System.out.println("辅音字母");
            }






        }



    }



}
