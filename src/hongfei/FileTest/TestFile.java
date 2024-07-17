package hongfei.FileTest;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/Administrator/Desktop");
//        File file = new File("C:/Users/Administrator/Desktop/StringTest.txt");       //创建文件对象
//        file.createNewFile();//创建文件
//        System.out.println(file);//获取文件路径
//        System.out.println(file.isFile());//判断是否是文件
//        System.out.println(file.exists());//判断文件或目录是否存在
//        System.out.println(file.isDirectory());//判断是否是目录
//        file.delete();//删除文件或目录


//        File[] files = file.listFiles();//获取该目录下所有文件和目录
//        for (File f : files) {
//            System.out.println(f);
//        }
        printFile(file,0);
    }
    static void printFile(File file,int level) {//递归打印目录结构
        for(int i=0;i<level;i++){
            System.out.print("-");
        }
        System.out.println(file.getName());
        if(file.isDirectory()){ //如果是目录，则递归打印目录结构
            File[] files = file.listFiles();

            for(File f:files){ //遍历目录
                printFile(f,level+1);
            }
        }
    }
}
