package dao;

import entity.Users;

import java.io.Serializable;
import java.util.List;


public interface IdepMapper {
    //新增
    int addUser(Users users);

    //修改
    int updateUser(Serializable serializable);

    //删除
    int deleteUser(Serializable serializable);

    //条件查询
    Users findUserById(Serializable serializable);

    //查询所有
    List<Users> findUserAll(Serializable serializable);

}
