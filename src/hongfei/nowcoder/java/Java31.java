package hongfei.nowcoder.java;

import java.util.*;

public class Java31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        //write your code here......
        StringBuilder m=new StringBuilder();
        int n=num;
        while((num/2)>0){
            m.insert(0,num%2);
            num=num/2;
        }
        m.insert(0,num);
        System.out.println(m.toString());

    }
}
