package cn.com.xuxiaowei;

public class Point {
    private String X;
    private String Y;

    public String getX() {
        return X;
    }

    public String getY() {
        return Y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "X='" + X + '\'' +
                ", Y='" + Y + '\'' +
                '}';
    }
}
