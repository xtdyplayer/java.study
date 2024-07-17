package hongfei.MathTest;

import java.util.Random;

public class TestMath {
    public static void main(String[] args) {
        //测试Math类中的方法
        System.out.println("sin(0.5)="+Math.sin(0.5));//sin(0.5)=-0.5
        System.out.println("cos(60°)="+Math.cos(Math.PI/3));//cos(60°)=0.5
        System.out.println("tan(45°)="+Math.tan(Math.PI/4));//tan(45°)=1
        System.out.println("asin(0.5)=" + Math.asin(0.5));//asin(0.5)=1.5707963267948966
        System.out.println("acos(0.5)=" + Math.acos(0.5));//acos(0.5)=1.0471975511965976
        System.out.println("atan(1)=" + Math.atan(1));//atan(1)=0.7853981633974483

        System.out.println("2的3次方为"+Math.pow(2,3));//2的3次方
        System.out.println("3.2向上取整为"+Math.ceil(3.2));//向上取整
        System.out.println("3.2向下取整为"+Math.floor(3.2));//向下取整
        System.out.println("-10的绝对值为"+Math.abs(-10));//绝对值

        //Math类中的常量
        System.out.println(Math.PI);//圆周率=3.141592653589793
        System.out.println(Math.E);//自然常数=2.718281828459045

        //测试Random
        System.out.println("生成随机数:"+Math.random());//随机数,范围为[0,1)
        Random rand = new Random();
        //随机整数，范围为[0,10)
        System.out.println("生成随机整数:"+rand.nextInt(10));
        //随机浮点数，范围为[0,10)
        System.out.println("生成随机浮点数:"+rand.nextDouble(10));
    }
}
