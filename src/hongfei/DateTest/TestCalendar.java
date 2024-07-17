package hongfei.DateTest;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestCalendar {
	public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        int year=gc.get(GregorianCalendar.YEAR);
        int month=gc.get(GregorianCalendar.MONTH);
        int day=gc.get(GregorianCalendar.DAY_OF_MONTH);
        int hour=gc.get(GregorianCalendar.HOUR_OF_DAY);
        int minute=gc.get(GregorianCalendar.MINUTE);
        System.out.print(year+"-");
        System.out.print(month+1+"-");
        System.out.print(day+"-");
        System.out.print(hour+"-");
        System.out.print(minute);

        GregorianCalendar gc2 = new GregorianCalendar(year, month, day);
        gc2.set(Calendar.HOUR_OF_DAY, 1);
        gc2.set(Calendar.MINUTE, 0);
    }
}
