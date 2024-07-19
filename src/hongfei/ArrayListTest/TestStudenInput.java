package hongfei.ArrayListTest;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudenInput {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<3; i++) {

            System.out.print("Enter name: ");
            String name=sc.next();
            System.out.print("Enter age: ");
            int age=sc.nextInt();
            students.add(new Student(name,age));//add student to the list
        }

        for (int i = 0; i<3; i++) {
            System.out.println(students.get(i).getName() + " " + students.get(i).getAge());
        }
    }
}
