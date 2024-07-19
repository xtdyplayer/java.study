package hongfei.ArrayListTest;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();

        Student s1=new Student("John",18);
        Student s2=new Student("Jane",18);
        Student s3=new Student("Tom",19);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        for(int i=0;i<students.size();i++){
            System.out.println(students.get(i).getName()+","+students.get(i).getAge());
        }
    }
}
