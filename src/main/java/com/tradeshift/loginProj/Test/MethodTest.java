package com.tradeshift.loginProj.Test;

import com.tradeshift.loginProj.Dao.UserDaoImpl;

/**
 * Created by aaron on 15/7/28.
 */
public class MethodTest {
    public static void main(String[] args){
        UserDaoImpl ud=new UserDaoImpl();
        System.out.println("<><><" + ud.AllUser().size());
    }
}
