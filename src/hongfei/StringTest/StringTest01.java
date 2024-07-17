package hongfei.StringTest;

import java.util.Arrays;

public class StringTest01 {
    public static void main(String[] args) {
        //测试字符串格式化
        String s = "Hi %s, your score is %d!";
        System.out.printf((s) + "%n", "Alice", 80);//System.out.println(s.formatted("Alice", 80));
        System.out.printf("Hi %s, your score is %.2f!%n", "Bob", 59.5);

        //测试字符串拼接
        char[] cs="hello".toCharArray();
        String s1=new String(cs);
        System.out.println(s1);
        cs[0]='H';
        System.out.println(s1);
        System.out.println(cs);


        int[] scores = new int[] { 88, 77, 51, 66 };
        Score s2= new Score(scores);
        s2.printScores();
        scores[2] = 99;
        s2.printScores();
    }
}
class Score {
    private int[] scores;
    public Score(int[] scores) {
        this.scores = scores;
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
