package hongfei.ArrayTest;

public class Test3 { //测试数组拷贝
    public static void main(String[] args) {
        String[] arr1={"apple","banana","orange","grape"};
        String[] arr2=new String[10];
        System.arraycopy(arr1,0,arr2,0,arr1.length);//将arr1拷贝到arr2中
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
