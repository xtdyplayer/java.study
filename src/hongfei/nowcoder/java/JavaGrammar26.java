package hongfei.nowcoder.java;

import java.util.Scanner;

public class JavaGrammar26 {

    public static void main(String[] args) {
        Comparator comparator = new ComparatorImpl();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(comparator.max(x, y));
        }
    }

}

interface Comparator {
    /**
     * 返回两个整数中的最大值
     */
    int max(int x, int y);
}

//write your code here......
class ComparatorImpl implements Comparator{
    public int max(int x, int y){
        if(x>=y){
            return x;
        }
        else{
            return y;
        }
    }
}