package cn.javacoder.springmvc.mybatis.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by aijun.fu@mtime.com
 * Date:2016/8/14
 * Time:1:43
 */
@XmlRootElement
public class User {
    private int id;
    private String userName;
    private String password;
    private List<Address> addressList;
    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
