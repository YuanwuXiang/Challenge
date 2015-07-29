package com.tradeshift.loginProj.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by aaron on 15/7/27.
 */

@Service
@Component
@XmlRootElement
public class User {
    private String userName;
    private String psd;

    public User(){}

    public User(String userName, String psd){
        this.userName = userName;
        this.psd = psd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }
}
