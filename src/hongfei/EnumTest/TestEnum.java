package hongfei.EnumTest;


public class TestEnum {
    public static void main(String[] args) {
        Weekday today1 = Weekday.FRI;
        System.out.println("today1:"+today1);
        Weekday today2 = Weekday.SAT;
        System.out.println("today2.ordinal()="+today2.ordinal()+",today2.dayValue()="+today2.dayValue);

        //获取枚举类所有值,利用数组实现
        Weekday[] weekday = Weekday.values();
        for (int i = 0; i < weekday.length; i++) {
            System.out.println(weekday[i].name()+" "+weekday[i].toString()+" "+weekday[i].ordinal());
            //toString()和name()方法返回的值一样，但是toString()方法可以被覆写
    }
}
}

/*enum Weekday {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}*/

enum Weekday {
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");

    public final int dayValue;
    private final String chinese;

    private Weekday(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

//toString()方法的覆写
      @Override
    public String toString() {
        return this.chinese+"-"+this.dayValue;
    }
}
