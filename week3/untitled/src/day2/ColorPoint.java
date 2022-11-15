package day2;


class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}


public class ColorPoint extends Point {
    private String color;

    public ColorPoint() {
        super(0, 0);
        color = "BLACK";
    }

    public ColorPoint(int x, int y) {
        super(x, y);
        color = "BLACK";
    }

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;

    }

    public void setXY(int x, int y) {
        super.move(x, y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return color + "색의 (" + super.getX() + ", " + super.getY() + ")의 점";
    }

//    public static void main(String[] args) {
//        ColorPoint zeroPoint = new ColorPoint();// (0,0) 위치의 BLACK 색 점
//        System.out.println(zeroPoint.toString() + "입니다.");
//
//        ColorPoint cp = new ColorPoint(10, 10);// (10,10) 위치의 BLACK 색 점
//        cp.setXY(5, 5);
//        cp.setColor("RED");
//        System.out.println(cp.toString() + "입니다.");
//
//    }
}

class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void moveUp() {
        z++;
    }

    public void moveDown() {
        z--;
    }

    public void move(int x, int y, int z) {
        super.move(x, y);
        this.z = z;
    }

    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + Integer.toString(z) + ")의 점";
    }


//    public static void main(String[] args) {
//        Point3D p = new Point3D(1, 2, 3);// 1,2,3은 각각 x, y, z축의 값.
//        System.out.println(p.toString() + "입니다.");
//
//        p.moveUp();// z 축으로 위쪽 이동
//        System.out.println(p.toString() + "입니다.");
//
//        p.moveDown();// z 축으로 아래쪽 이동
//        p.move(10, 10);// x, y 축으로 이동
//        System.out.println(p.toString() + "입니다.");
//
//        p.move(100, 200, 300);// x, y, z축으로 이동
//        System.out.println(p.toString() + "입니다.");
//    }
}

class PositivePoint extends Point {
    public PositivePoint() {
        super(0, 0);
    }

    public PositivePoint(int x, int y) {
        super(0, 0);
        if (x >= 0 && y >= 0) super.move(x, y);

    }

    public void move(int x, int y) {
        if (x >= 0 && y >= 0) super.move(x, y);
    }

    public String toString() {
        return "(" + super.getX() + "," + super.getY() + ")의 점";
    }

//    public static void main(String[] args) {
//        PositivePoint p = new PositivePoint();
//
//        p.move(10, 10);
//        System.out.println(p.toString() + "입니다.");
//
//        p.move(-5, 5);// 객체 p는 음수 공간으로 이동되지 않음
//        System.out.println(p.toString() + "입니다.");
//
//        PositivePoint p2 = new PositivePoint(-10, -10);
//        System.out.println(p2.toString() + "입니다.");
//    }
}
