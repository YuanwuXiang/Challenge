package com.tradeshift.loginProj.Service;

import com.tradeshift.loginProj.bean.User;

import java.util.List;

/**
 * Created by aaron on 15/7/27.
 */
public interface LoginServiceInterface {
    public String userLogin(String userName,String psd);
    public List userGet();
}
