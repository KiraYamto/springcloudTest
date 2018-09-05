package org.bobo.model;

import java.io.Serializable;

/**
 * @author tian.xubo
 * @created 2018 - 04 - 11 9:54
 */
public class Response implements Serializable {
    private String code;
    private String desc;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
