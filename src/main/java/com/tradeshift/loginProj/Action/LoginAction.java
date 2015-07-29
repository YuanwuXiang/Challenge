package com.tradeshift.loginProj.Action;

import com.sun.jersey.spi.inject.Inject;
import com.sun.jersey.spi.resource.Singleton;
import com.tradeshift.loginProj.Service.LoginServiceInterface;
import com.tradeshift.loginProj.bean.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by aaron on 15/7/24.
 */
@Singleton
@Path("login")
public class LoginAction {
    @Inject
    private LoginServiceInterface lsi;

    @Autowired
    public LoginAction(LoginServiceInterface loginServiceInterface) {
        this.lsi = loginServiceInterface;
    }

    public LoginAction() {
        this.lsi = null;
    }

    @Path("/getUser")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(){
        List<User> mUser;
        mUser=lsi.userGet();
        return Response.ok(mUser).build();
    }

    @Path("/userLogin/{userName}/{psd}")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String loginPost(@PathParam("userName") String userName,@PathParam("psd") String psd){
        String result=lsi.userLogin(userName, psd);
        System.out.println("result----" + result);
        return result;
    }

    @Path("/hello")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public Response getHello(){
        return Response.ok("hello world").build();
    }
}

