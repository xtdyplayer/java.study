package hongfei.RecordTest;

public class Main {
    public static void main(String[] args) {
//        Point p = new Point(-123, 456);
        Point p = new Point(123, 456);
        var p1= Point.of();
        System.out.println(p.x());
        System.out.println(p.y());
        System.out.println(p);
        System.out.println(p1);
    }
}
record Point(int x, int y){


        public static Point of() {
            return new Point(0, 0);
        }

        public static Point of(int x, int y) {
            return new Point(x, y);
        }

    public Point{
        if(x < 0 || y < 0){
            throw new IllegalArgumentException("x and y must be non-negative");
        }
    }
}
//record类Point的定义，包含两个int类型的字段x和y，并提供默认构造器。
/*record Point(int x, int y) {}等同于下面代码：
final class Point extends Record {
    private final int x;
    private final int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int x() {
        return this.x;
    }
    public int y() {
        return this.y;
    }
    public String toString() {
        return String.format("Point[x=%s, y=%s]", x, y);
    }
    public boolean equals(Object o) {
        ...
    }
    public int hashCode() {
        ...
    }
}*/
