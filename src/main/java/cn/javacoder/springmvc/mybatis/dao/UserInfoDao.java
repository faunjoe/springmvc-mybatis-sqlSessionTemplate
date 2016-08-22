package cn.javacoder.springmvc.mybatis.dao;

import cn.javacoder.springmvc.mybatis.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by aijun.fu@mtime.com
 * Date:2016/8/17
 * Time:15:48
 */

@Repository
public class UserInfoDao extends AbstractDao {

    public User selectUserById(int userId) {
        return sqlTpl.selectOne("cn.javacoder.springmvc.mybatis.entity.UserMapper.selectUserById",userId);
    }

    @Transactional
    public void insertUser(User user) {
        int i = sqlTpl.insert("cn.javacoder.springmvc.mybatis.entity.UserMapper.insertUser",user);
        throw new RuntimeException();
    }
}
