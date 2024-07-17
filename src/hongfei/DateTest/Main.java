package hongfei.DateTest;

public class Main {
    public static void main(String[] args) {
        String str="";
        long time1=System.currentTimeMillis();
        long num1=Runtime.getRuntime().freeMemory();
        for(int i=1;i<5000;i++){
            str=str+i;
        }
        long time2=System.currentTimeMillis();
        long num2=Runtime.getRuntime().freeMemory();
        System.out.println(time2);



    }
}
