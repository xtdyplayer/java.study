package hongfei;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal d1 = new BigDecimal("123.4500");
        BigDecimal d2 = d1.stripTrailingZeros();//去掉小数点后多余的0
        System.out.println(d1.scale()); // 4
        System.out.println(d2.scale()); // 2,因为去掉了00

        BigDecimal d3 = new BigDecimal("1234500");
        BigDecimal d4 = d3.stripTrailingZeros();//去掉小数点后多余的0
        System.out.println(d3.scale()); // 0
        System.out.println(d4.scale()); // -2,表示为整数，末尾有两个零

        BigDecimal d5 = new BigDecimal("123.456");
        BigDecimal d6 = new BigDecimal("23.456789");
        BigDecimal d7 = d5.divide(d6, 10, RoundingMode.HALF_UP); // 保留10位小数并四舍五入
        System.out.println(d7.toString()); // 5.345678900

        BigDecimal d8 = new BigDecimal("123.456");
        BigDecimal d9 = new BigDecimal("123.45600");
        System.out.println(d8.equals(d9)); // false,因为scale不同
        System.out.println(d8.equals(d9.stripTrailingZeros())); // true,因为d2去除尾部0后scale变为3
        System.out.println(d8.compareTo(d9)); // 0
    }
}
