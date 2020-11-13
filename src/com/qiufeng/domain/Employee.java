package com.qiufeng.domain;

/**
 * 员工
 */
public class Employee {

    /** 员工id */
    private Long id;

    /** 员工姓名 */
    private String name;

    /** 员工密码 */
    private String password;

    /** 员工年龄 */
    private Integer age;

    /** 员工性别 */
    private char sex;

    /** 员工电话号码 */
    private String phone;

    /** 员工头像 */
    private String headImage;

    /** 员工权限，0表示为普通用户，1表示管理员 */
    private Integer auth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public Integer getAuth() {
        return auth;
    }

    public void setAuth(Integer auth) {
        this.auth = auth;
    }
}
