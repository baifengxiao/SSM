package com.this0.spring6.bean;

public class User {

    private int Uid;
    private String Uname;
    private String Sex;
    private Integer Tel;

    public int getUid() {
        return Uid;
    }

    public void setUid(int uid) {
        Uid = uid;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public Integer getTel() {
        return Tel;
    }

    public void setTel(Integer tel) {
        Tel = tel;
    }

    public User() {
    }

    public User(int uid, String uname, String sex, Integer tel) {
        Uid = uid;
        Uname = uname;
        Sex = sex;
        Tel = tel;
    }


}
