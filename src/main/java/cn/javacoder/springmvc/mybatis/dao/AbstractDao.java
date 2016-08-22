package cn.javacoder.springmvc.mybatis.dao;

import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;

/**
 * Created by aijun.fu@mtime.com
 * Date:2016/8/17
 * Time:15:47
 */
public abstract class AbstractDao {
    @Resource(name="sqlSessionTemplate")
    protected SqlSessionTemplate sqlTpl;
}
