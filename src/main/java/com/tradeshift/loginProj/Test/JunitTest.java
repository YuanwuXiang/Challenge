package com.tradeshift.loginProj.Test;
import com.tradeshift.loginProj.Action.LoginAction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by aaron on 15/7/25.
 */
public class JunitTest {
    private LoginAction cal = new LoginAction();

    @BeforeClass// 注意,这里必须是static...因为方法将在类被装载的时候就被调用(那时候还没创建实例)
    public static void before()
    {
        System.out.println("global");
    }

    @AfterClass
    public static void after() {
        System.out.println("global destroy");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("一个测试开始。。");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("一个测试结束");
    }

    @Test
    public void testDivide() throws Exception {
        String result=cal.loginPost("mike","123");
        Assert.assertEquals("suceess", result);
        // 很简单的办法.......
    }

}
