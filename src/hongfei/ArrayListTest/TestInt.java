package hongfei.ArrayListTest;

import java.util.ArrayList;

public class TestInt {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
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
