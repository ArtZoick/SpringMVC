package top.zoick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.zoick.domain.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zoick
 * @date 2019/7/23 14:04
 */
@Controller
@RequestMapping("/user")
public class UserController {


    /**
     * 返回值是String
     *
     * @param model
     * @return
     */
    @RequestMapping("/testString")
    public String testString(Model model) {
        System.out.println("testString方法执行了");
        //模拟从数据库查询出了User对象
        User user = new User();
        user.setUsername("彭于晏");
        user.setPassword("123");
        user.setAge(20);

        //model对象 addAttribute第一个参数是key值，第二个参数是user对象
        model.addAttribute("user", user);

        return "success";
    }

    /**
     * 返回值是void，默认情况会去寻找方法请求路径名的testVoid.jsp
     *
     * @param request response
     * @return
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("testVoid方法执行了");
        //1、编写请求转发的程序,不会经过视图解析器，要将目录写完整
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //2、重定向，重新发的新请求不能访问WEb—INF/pages里的页面的
        //response.sendRedirect(request.getContextPath()+"/index.jsp");
        //设置中文乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //3、直接会进行响应
        response.getWriter().print("hello 你好");
        return;//不想让后面的代码继续执行加一个return
    }

    /**
     * 返回ModelAndView
     *
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {

        //创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        System.out.println("testModelAndView方法执行了");
        //模拟从数据库查询出了User对象
        User user = new User();
        user.setUsername("吴彦祖");
        user.setPassword("123123");
        user.setAge(20);

        //把user对象存储到mv对象中，也会把user对象存入到request对象
        mv.addObject("user", user);

        //跳转到哪个页面,这里会走视图解析器
        mv.setViewName("success");
        return mv;
    }

    /**
     * 使用关键字的方式进行转发或重定向
     *
     * @return
     */
    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect() {
        System.out.println("testForwardOrRedirect方法执行了");

        //1、请求的转发，不会走视图解析器，将路径写完整
        //return "forward:/WEB-INF/pages/success.jsp";

        //2、重定向 不用加项目名，注意和转发不同
        return "redirect:/index.jsp";
    }

    /**
     * 模拟异步响应请求
     * Ajax传的是json数据，获得请求体的内容，请求体的内容是传的json的字符串
     */
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user) {
        System.out.println("testAjax方法执行了");
        //客户端发送ajax请求，传的是json字符串，后端把json字符串封装到user对象中
        System.out.println(user);

        //做响应，模拟查询数据库
        user.setUsername("zoick");

        //做响应,返回的是对象，但是前端还是json数据
        return user;
    }

}
