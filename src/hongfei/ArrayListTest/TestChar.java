package hongfei.ArrayListTest;

import java.util.ArrayList;

public class TestChar {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<Character>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');

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
