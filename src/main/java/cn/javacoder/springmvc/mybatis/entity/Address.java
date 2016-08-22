package cn.javacoder.springmvc.mybatis.entity;

/**
 * Created by aijun.fu@mtime.com
 * Date:2016/8/14
 * Time:16:29
 */
public class Address {

    private String type;
    private String location;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
