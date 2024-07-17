package hongfei.ArrayTest;

//测试数组的创建、初始化、访问、遍历等操作
public class Test01 {
    public static void main(String[] args){
//        int[] arr1=null;
        int[]arr1=new int[5];
        System.out.println(arr1.length);
        System.out.println(arr1[0]+","+arr1[1]+","+arr1[2]+","+arr1[3]+","+arr1[4]);


        for(int i=0;i<arr1.length;i++){
            arr1[i]=i*2+1;
            System.out.println("arr1["+i+"]="+arr1[i]);
        }

    }
}
