package StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("张三", 20, "1001", "北京"));
        System.out.println("---------学生管理系统----------\n1:添加学生信息\n2:删除学生信息\n3:修改学生信息\n4:查询学生信息\n5:退出系统\n-----------------------------");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("请输入：");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1: {
                    System.out.println("添加学生信息:");
                    addStudent(students);
                    break;
                }
                case 2: {
                    System.out.println("删除学生信息:");
                    deleteStudent(students);
                    break;
                }
                case 3: {
                    System.out.println("修改学生信息:");
                    updateStudent(students);
                    break;
                }
                case 4: {
                    System.out.println("查询学生信息:");
                    queryStudent(students);
                    break;
                }
                case 5: {
                    System.out.println("退出系统:");
                    return;
                }
                default:
                    System.out.println("输入错误，请重新输入！");
            }
        }
    }
    public static void addStudent(ArrayList<Student> students){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生id：");
        String id = scanner.next();
        for(int i=0; i<students.size(); i++){
            if(students.get(i).getId().equals(id)){
                System.out.println("该学生已存在！");
                return;
            }
        }
        System.out.print("请输入学生姓名：");
        String name = scanner.next();
        System.out.print("请输入学生年龄：");
        int age = scanner.nextInt();
        System.out.print("请输入学生地址：");
        String address = scanner.next();
        Student student = new Student(name, age, id, address);
        students.add(student);
        System.out.println("添加成功！");
    }
    public static void deleteStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生ID：");
        String Id = scanner.next();
        int index = getIndex(students, Id);
        if (index == -1) {
            System.out.println("该学生不存在！");
            return;
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(Id)) {
                students.remove(i);
                System.out.println("删除成功！");
            }
        }
    }
    public static void updateStudent(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生ID：");
        String Id = scanner.next();
        int index = getIndex(students, Id);
        if (index == -1) {
            System.out.println("该学生不存在！");
            return;
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(Id)) {
                System.out.println("请输入要修改的学生信息：\n1:姓名\n2:年龄\n3:地址");
                int choose = scanner.nextInt();
                switch (choose) {
                    case 1: {
                        System.out.print("请输入修改后的学生姓名：");
                        String name = scanner.next();
                        students.get(i).setName(name);
                        break;
                    }
                    case 2: {
                        System.out.print("请输入修改后的年龄：");
                        int age = scanner.nextInt();
                        students.get(i).setAge(age);
                        break;
                    }
                    case 3: {
                        System.out.print("请输入修改后的地址：");
                        String address = scanner.next();
                        students.get(i).setAddress(address);
                        break;
                    }
                    default: {
                        System.out.println("输入错误，请重新输入！");
                        break;
                    }
                }
                System.out.println("修改成功！");
            }
        }

    }
    public static void queryStudent(ArrayList<Student> students) {
        if(students.size() == 0){
            System.out.println("暂无学生信息！");
            return;
        }
        for (Student student : students) {
            System.out.println(student.getId() + " " + student.getName() + " " + student.getAge() + " " + student.getAddress());
        }
    }
    public static int getIndex(ArrayList<Student> students,String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
