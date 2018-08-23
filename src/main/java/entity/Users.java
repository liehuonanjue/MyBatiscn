package entity;

import java.io.Serializable;

public class Users implements Serializable {
    private Integer user_id; //用户ID

    public Users() {
    }

    public Users(Integer user_id) {

        this.user_id = user_id;
    }

    private String userName;//用户名
    private String usernpwd;//用户名

    public String getUsernpwd() {
        return usernpwd;
    }

    public void setUsernpwd(String usernpwd) {
        this.usernpwd = usernpwd;
    }


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
