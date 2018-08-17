package dao.impl;


import dao.IdepMapper;
import entity.Users;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.SessionFactoryUtil;

import java.util.List;


public class IDeptMapperImpl {
    SqlSession sqlSession = null;
    IdepMapper mapper = null;

    @Before
    public void before() {
//        抢先执行
        System.out.println(" 抢先执行1");
        sqlSession = SessionFactoryUtil.getSession();
        System.out.println(" 抢先执行2");
        mapper = sqlSession.getMapper(IdepMapper.class);
        System.out.println(" 抢先执行3");
    }

    @After
    public void after() {
//        结束执行
        System.out.println("最后执行1");
        sqlSession.commit();
        System.out.println("最后执行2");
        sqlSession.close();
        System.out.println("最后执行3");
    }

    @Test
    public void add() {
        System.out.println("单侧执行1");
        Users users = new Users();
        users.setUserName("zhang");
        int nu = mapper.addUser(users);
        System.out.println("单侧执行2");
        if (nu > 0) {
            System.out.println("成功");
        }
    }

    @Test
    public void delete() {
        System.out.println("单侧执行1");
        Users users = new Users();
        users.setUserName("zhang");
        int nu = mapper.deleteUser(34);
        System.out.println("单侧执行2");
        if (nu > 0) {
            System.out.println("成功");
        }
    }

    @Test
    public void update() {
        System.out.println("单侧执行1");
        Users users = new Users();
        users.setUserName("凄涼");
        users.setUser_id(35);
        int nu = mapper.updateUser(users);
        System.out.println("单侧执行2");
        if (nu > 0) {
            System.out.println("修改成功");
        }
    }

    @Test
    public void seleByid() {
        System.out.println("单侧执行1");
        Users nu = mapper.findUserById(36);
        System.out.println(nu);
    }

    @Test
    public void seleAll() {
        System.out.println("单侧执行1");
        List<Users> nu = mapper.findUserAll(36);
        System.out.println(nu);
    }
/*    @Override
    public int addUser(Users users) {
        int num = 0;

        try {
            sqlSession = SessionFactoryUtil.getSession();
            num = sqlSession.insert("addUser", users);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
        return num;
    }*/


}
