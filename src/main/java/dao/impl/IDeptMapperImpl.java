package dao.impl;


import dao.IdepMapper;
import entity.Users;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.SessionFactoryUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
//        users.setUserName("凄涼");
        users.setUsernpwd("sddd");
        users.setUser_id(36);
        int nu = mapper.updateUser(users);
        System.out.println("单侧执行2");
        if (nu > 0) {
            System.out.println("修改成功");
        }
    }

    @Test
    public void seleByid() {
        System.out.println("查询单个");
        Users nu = mapper.findUserById(35);
        System.out.println(nu.getUserName());
    }

    @Test
    public void seleAll() {
        System.out.println(" 查询全部");
        List<Users> nu = mapper.findUserAll();
        for (Users users : nu) {
            System.out.println(users.getUserName());
        }

    }

    @Test
    public void seleAsp() {
        System.out.println("查询单个");
        Users nu = mapper.findUserBy(35, "凄涼");
        System.out.println(nu.getUserName());
    }

    /*    @Test
        public void seleMap() {
            System.out.println("查询单个");
            Map<String, Object> map = new HashMap<>();
            map.put("name", "凄涼");
            Users nu = mapper.findUserMap(map);
            System.out.println(nu.getUserName());
        }*/
    @Test
    public void seleMap() {
        System.out.println("查询单个");
        Map<String, Object> map = new HashMap<>();
        Users nu = new Users();
        nu.setUserName("凄涼");
        nu.setUser_id(37);
//        nu.setUsernpwd("sddd");
        map.put("name", nu);
        Users nuu = mapper.findUserMap(map);
        System.out.println(nuu.getUserName());
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
