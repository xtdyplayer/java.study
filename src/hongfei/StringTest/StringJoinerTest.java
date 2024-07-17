package hongfei.StringTest;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        String[] names= {"Alice", "Bob", "Charlie"};
//        var sj=new StringJoiner(",");
        var sj=new StringJoiner(",","hello,","!");//用，连接，用hello，开始，用！结束
        for(var name:names){
            sj.add(name);
        }
        System.out.println(sj.toString());

        String[] names2 = {"Alice", "Bob", "Charlie"};
        var s=String.join(",",names2);
        System.out.println(s);
    }
}
