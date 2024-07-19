package hongfei.ArrayListTest;
import java.util.*;

public class TestUser {
    public static void main(String[] args) {
        ArrayList<User> users =new ArrayList<>();
        User user1=new User("001","Tom","12325");
        User user2=new User("002","Jerry","12345");
        User user3=new User("003","Mike","12365");

        users.add(user1);
        users.add(user2);
        users.add(user3);

        int u=getIndex(users,"002");
        System.out.println(u);//返回Id为“002”的用户的索引
        System.out.println(users.get(u).getUserName()+" "+users.get(u).getPassword());

    }
    public static int getIndex(ArrayList<User> users,String id){
        for(int i=0; i<users.size(); i++){
            if(users.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
