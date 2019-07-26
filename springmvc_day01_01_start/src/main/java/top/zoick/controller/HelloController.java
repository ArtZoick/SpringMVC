package top.zoick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器类
 *
 * @author zoick
 * @date 2019/7/18 11:14
 */
@Controller
@RequestMapping(path = "user")
public class HelloController {

    /**
     * 入门案例
     *
     * @return
     */
    @RequestMapping(path = "/hello")
    public String sayHello() {
        System.out.println("Hello StringMVC");
        return "success";
    }

    /**
     * RequestMapping注解
     *
     * @return
     */
    @RequestMapping(path = "testRequestMapping")
    public String testRequestMapping() {
        System.out.println("测试RequsetMapping");
        return "success";
    }
}
