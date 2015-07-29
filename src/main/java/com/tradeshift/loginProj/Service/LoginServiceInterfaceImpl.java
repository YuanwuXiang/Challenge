package com.tradeshift.loginProj.Service;

import java.util.ArrayList;
import java.util.List;

import com.sun.jersey.spi.inject.Inject;
import com.sun.jersey.spi.resource.Singleton;
import com.tradeshift.loginProj.Dao.UserDao;
import com.tradeshift.loginProj.Dao.UserDaoImpl;
import com.tradeshift.loginProj.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by aaron on 15/7/27.
 */
@Component
@Service
@Repository
public class LoginServiceInterfaceImpl implements LoginServiceInterface{
    private String result;
    @Inject
    private User user;
    @Inject
    private UserDao userDao;

    @Autowired
    public LoginServiceInterfaceImpl(User user, UserDao userDao) {
        this.user = user;
        this.userDao = userDao;
    }

    public LoginServiceInterfaceImpl() {
        this.user = null;
        this.userDao = null;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    //method for post
    @Override
    public String userLogin(final String userName, final String psd) {
        for(int h=0;h<userDao.AllUser().size();h++){
                   user=(User)userDao.AllUser().get(h);
            if(userName.equals(user.getUserName())&psd.equals(user.getPsd())){
                       result=user.getUserName()+":login succeed";
                   }else{
                       result ="login failed";
                   }
                }

        return result;
    }
    //method for get

    @Override
    public List userGet()
    {
        return  userDao.AllUser();
    }
}
