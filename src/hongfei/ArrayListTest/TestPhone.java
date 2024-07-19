package hongfei.ArrayListTest;
import java.util.*;

public class TestPhone {
    public static void main(String[] args) {
        ArrayList<Phone> phone=new ArrayList<>();

        Phone p1=new Phone( "Apple", 7000);
        Phone p2=new Phone( "Samsung", 6000);
        Phone p3=new Phone( "Xiaomi", 5000);

        phone.add(p1);
        phone.add(p2);
        phone.add(p3);

        // 打印price<6000所有手机信息
        ArrayList<Phone> phone1=getPhonePrice(phone, 6000);
        for (int i = 0; i < phone1.size(); i++) {
            System.out.println(phone1.get(i).getBrand());
        }
    }

    // 获取价格小于或等于给定价格的所有手机的方法
    public static ArrayList<Phone> getPhonePrice(ArrayList<Phone> phone, int price) {
        ArrayList<Phone> result=new ArrayList<>();
        for (int i = 0; i < phone.size(); i++) {
            if (phone.get(i).getPrice() <= price) {
                result.add(phone.get(i));
            }
        }
        return result;
    }
}
