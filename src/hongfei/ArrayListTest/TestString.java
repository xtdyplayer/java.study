package hongfei.ArrayListTest;


import java.util.*;
public class TestString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("grape");
        list.add("pineapple");
        System.out.println(list.size());//5,but index =0 to 4
        System.out.print("[");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            if(i<list.size()-1){//so need list.size()-1
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
