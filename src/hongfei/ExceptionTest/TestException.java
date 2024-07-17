package hongfei.ExceptionTest;

public class TestException {
    public static void main(String[] args) {

//        System.out.println("step1");
//        int i=1/0;
//        System.out.println("step2");

        System.out.println("step1");
        try{
            int h=1/0;
            System.out.println("step2");
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("step4");
        }
        System.out.println("step3");

    }
}
