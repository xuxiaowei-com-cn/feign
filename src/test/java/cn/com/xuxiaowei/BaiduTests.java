package cn.com.xuxiaowei;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.junit.Test;

public class BaiduTests {

    /**
     * http://api.map.baidu.com/location/ip?ak=ia6HfFL660Bvh43exmH9LrI6
     */
    @Test
    public void ip() {
        Baidu baidu = Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .target(Baidu.class, "http://api.map.baidu.com");

        Response ip = baidu.ip("ia6HfFL660Bvh43exmH9LrI6");

        System.out.println(ip);
    }

}
