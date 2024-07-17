package hongfei.DateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1  {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat d=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d1=d.parse("2018-05-01 12:30:00");
        System.out.println(d1);
        System.out.println(d1.getTime());

        String time=d.format(d1);
        System.out.println(time);

        Date d2=new Date(1000L*60*60*24);
        String str=d.format(d2);
        System.out.println(str);
    }
}
