package hongfei.ArrayTest;

//测试增强for循环
public class Test2 {
    public static void main(String[] args) {
        //定义数组
        Man[] mans={
                new Man(1, "Tom"),
                new Man(2, "Jerry"),
                new Man(3, "Mike"),
                new Man(4, "Lucy"),
                new Man(5, "Jack")
        };
        for(int i=0;i<mans.length;i++){
            System.out.println(mans[i].getId()+" "+mans[i].getName());
        }

        //增强for循环
        for(Man man:mans){
            System.out.println(man.getId()+" "+man.getName());
            System.out.println(man);
        }
    }
}
class Man{
    private int id;
    private String name;
    public Man(int id, String name){
        this.id = id;
        this.name = name;
    }
    public Man(){
    }
    public String toString(){
        return "id:"+id+",name:"+name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
