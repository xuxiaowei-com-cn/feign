package cn.com.xuxiaowei;

public class Content {
    private AddressDetail addressDetail;
    private String address;
    private Point point;

    public AddressDetail getAddressDetail() {
        return addressDetail;
    }

    public String getAddress() {
        return address;
    }

    public Point getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Content{" +
                "addressDetail=" + addressDetail +
                ", address='" + address + '\'' +
                ", point=" + point +
                '}';
    }
}
