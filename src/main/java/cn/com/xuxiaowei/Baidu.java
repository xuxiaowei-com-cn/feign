package cn.com.xuxiaowei;

import feign.Param;
import feign.RequestLine;

/**
 * @author xuxiaowei
 */
public interface Baidu {

    /**
     * http://api.map.baidu.com/location/ip?ak=ia6HfFL660Bvh43exmH9LrI6
     *
     * @return
     */
    @RequestLine("GET /location/ip?ak={ak}")
    Response ip(@Param(value = "ak") String ak);

}
