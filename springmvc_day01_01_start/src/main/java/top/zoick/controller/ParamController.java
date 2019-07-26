package top.zoick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.zoick.domain.Account;
import top.zoick.domain.User;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author zoick
 * @date 2019/7/20 19:32
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    /**
     * 请求参数绑定入门
     * @param username
     * @return
     */
    @RequestMapping("testParam")
    public String testparam(String username){
        System.out.println("执行了...");
        System.out.println("用户名："+username);
        return "success";
    }

    /**
     * 请求参数绑定，把数据封装到javaBean的类当中
     * @return
     */
    @RequestMapping("saveAccount")
    public String saveAccount(Account account){
        System.out.println("执行了...");
        System.out.println(account);
        return "success";
    }

    /**
     * 自定义类型转换器
     * @param user
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println("执行了...");
        System.out.println(user);
        return "success";
    }

    /**
     * 原生的api获取
     * @return
     */
    @RequestMapping("testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("执行了...");
        System.out.println(request);
        HttpSession session = request.getSession();
        System.out.println(session);
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        System.out.println(response);
        return "success";
    }


}
