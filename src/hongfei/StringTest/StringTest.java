package hongfei.StringTest;

//String类的测试类
public class StringTest {
    public static void main(String[] args) {
        //String类的常用方法
//        String str = "hello world";
//        System.out.println(str+"   "+str.length());
//        str=str.toUpperCase();
//        System.out.println(str);
        //toUpperCase()方法创建了一个全新的字符串对象，并将 s 的引用指向了这个新创建的字符串对象。
        // 因此，虽然 s 变量所引用的字符串内容看起来发生了变化，但实际上原始的 "Hello" 字符串对象仍然保持不变
        // 并且在没有其他引用指向它时，它可能会被垃圾回收器回收。

        //== 和 equals() 的区别
//        String s1 = new String("hello");
//        String s2 = new String("hello");
//        String s3 = "Hello";
//        String s4 = "Hello";
//        System.out.println(s1 == s2);//false
//        System.out.println(s3 == s4);//true
//        System.out.println(s1.equals(s2));//true
//        System.out.println(s1.equalsIgnoreCase(s3));//忽略大小写比较


//        System.out.println(s1.charAt(s1.length()-1));//输出最后一个字符
//        System.out.println(s1.contains("h"));//contains()方法判断字符串是否包含指定的子字符串
//        System.out.println(s1.indexOf("h"));//indexOf()方法查找字符串中第一次出现的指定子字符串的索引位置
//        System.out.println(s1.lastIndexOf("l"));//lastIndexOf()方法查找字符串中最后一次出现的指定子字符串的索引位置
//        System.out.println(s1.replace("h", "h2"));//替换字符串中的字符
//        System.out.println(s1.substring(2, 5));//输出从索引2到索引4的子字符串

    }
}
