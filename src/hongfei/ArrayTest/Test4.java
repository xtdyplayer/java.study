package hongfei.ArrayTest;

// 二维数组的访问
public class Test4 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //二维数组中前面的索引表示行，后面的索引表示列。
        System.out.println(arr[0][1]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
    }
}
