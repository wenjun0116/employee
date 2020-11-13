package com.qiufeng.domain;

/**
 * 城市
 */
public class City {

    /** 城市ID */
    private Integer id;

    /** 城市名 */
    private String name;

    /** 城市父级ID*/
    private Integer parentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
