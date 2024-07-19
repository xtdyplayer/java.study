package hongfei.ArrayListTest;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        System.out.println(list);//[]

        //增删改查
        list.add("apple");
        list.add("banana");
        list.add(0,"orange");
        System.out.println(list);

        boolean result = list.remove("apple");
        System.out.println(result);
        System.out.println(list);

//        list.remove(0);
//        System.out.println(list);

        list.set(0,"pear");//修改元素
        System.out.println(list);

        System.out.println(list.get(0));//获取元素
        System.out.println(list.size());
    }
}
