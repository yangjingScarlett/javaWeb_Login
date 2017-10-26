package cn.yang.login.domain;

import java.io.Serializable;

/**
 * 上海万达小额贷款有限公司
 * Created by 杨静 on 2017/10/26
 */
public class Account implements Serializable {

    private String name;
    private String password;

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
}
