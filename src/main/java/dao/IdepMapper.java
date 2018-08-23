package dao;

import entity.Users;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


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
    List<Users> findUserAll();

    //多条件查询
    Users findUserBy(@Param("id") int id, @Param("name") String name);

    Users findUserMap(Map<String, Object> map);

    //查询所有
    List<Users> findArr(int[] ints);

    //查询所有
    List<Users> findLis(List<Integer> ints);

    //查询所有
    List<Users> findlistuser(List<Users> ints);

    //
    int addarr(String[] ints);

    //查询所有
    List<Users> findMap(@Param("MapUsers") Map<String, Object> map);

}
