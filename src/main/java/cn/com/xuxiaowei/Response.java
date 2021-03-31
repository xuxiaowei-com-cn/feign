package cn.com.xuxiaowei;

public class Response {
    private String address;
    private Content content;
    private int status;

    public String getAddress() {
        return address;
    }

    public Content getContent() {
        return content;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Response{" +
                "address='" + address + '\'' +
                ", content=" + content +
                ", status=" + status +
                '}';
    }
}
