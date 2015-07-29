package com.tradeshift.loginProj.Test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

/**
 * Created by aaron on 15/7/25.
 */
public class TestClient {
    public static void main(String[] args){

    }

    private static WebResource getWr(String USER_URL)  {
        String user ="mike";
//    user.setUserName("hndes");
//    user.setAge(39);

        USER_URL = "http://localhost:8080/rest/restresource/insertUser";
        MultivaluedMapImpl params = new MultivaluedMapImpl();
        params.add("user",user);
        String result = getWr(USER_URL).entity(user, javax.ws.rs.core.MediaType.APPLICATION_XML).post(String.class);
        System.out.println("result"+result);

        System.out.println("kkkkk");
        Client c = Client.create();  //创建一个 com.sun.jersey .api.client.Client 类的实例
        System.out.println("llllll"+USER_URL);
        WebResource wr = c.resource(USER_URL);  // 建了一个 WebResponse 对象
        return wr;
    }
}
