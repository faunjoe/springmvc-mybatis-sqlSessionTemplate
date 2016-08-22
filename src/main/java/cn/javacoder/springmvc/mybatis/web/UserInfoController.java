package cn.javacoder.springmvc.mybatis.web;

import cn.javacoder.springmvc.mybatis.entity.User;
import cn.javacoder.springmvc.mybatis.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by aijun.fu@mtime.com
 * Date:2016/8/17
 * Time:15:52
 */

@Controller
@RequestMapping("userinfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("getUser4")
    public String getUser(Model model){
        User user = userInfoService.selectUserById(4);
        model.addAttribute("user",user);
        return "userdetail";
    }

    @RequestMapping("insert")
    public void insert(HttpServletResponse response ) throws IOException {
        User user = new User();
        user.setUserName("mtime");
        user.setPassword("mtime123456");
        String result = "";
        try{
            userInfoService.insertUser(user);
            result = " OK!";
        }catch(Exception e){
            result = "Roll Back";
        }
        response.getWriter().write(result);
    }
}
