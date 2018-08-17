package entity;

import java.io.Serializable;

public class Users implements Serializable {
    private Integer user_id; //用户ID
    private String userName;//用户名

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
