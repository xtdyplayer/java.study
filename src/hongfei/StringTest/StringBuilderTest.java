package hongfei.StringTest;


public class StringBuilderTest {
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            s1.append(i);
            s1.append(",");
        }
        s1.append(10);
        System.out.println(s1.toString());

        //StringBuilder的链式调用
        var s2 = new StringBuilder(1024);
        s2.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(s2.toString());

        s2.delete(s2.length()-1,s2.length());
        System.out.println(s2.toString());

    }
}
