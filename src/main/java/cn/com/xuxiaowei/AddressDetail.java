package cn.com.xuxiaowei;

public class AddressDetail {
    private String province;
    private String city;
    private String street;
    private String district;
    private String streetNumber;
    private int cityCode;

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getDistrict() {
        return district;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public int getCityCode() {
        return cityCode;
    }

    @Override
    public String toString() {
        return "AddressDetail{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", district='" + district + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", cityCode=" + cityCode +
                '}';
    }
}
