package com.tradeshift.loginProj.Dao;

import com.sun.jersey.api.core.InjectParam;
import com.sun.jersey.spi.inject.Inject;
import com.tradeshift.loginProj.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class UserDaoImpl implements UserDao {
    @Inject
    private User user;

    @Autowired
    public UserDaoImpl(User user) {
        this.user = user;
    }

    public UserDaoImpl() {
        this.user = null;
    }


    public void setUser(User user) {
        this.user = user;
    }
    @Override
    public List AllUser() {
        List<User> userList=new ArrayList<User>();
        User u1=new User();
        u1.setPsd("123");
        u1.setUserName("Mike");
        userList.add(u1);
        User u2=new User();
        u2.setPsd("123");
        u2.setUserName("Jane");
        userList.add(u2);
        return userList;
    }

}
