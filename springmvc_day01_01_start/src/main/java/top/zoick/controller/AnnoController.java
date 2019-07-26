package top.zoick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import top.zoick.domain.User;

import java.util.Date;

/**
 * @author zoick
 * @date 2019/7/21 22:28
 */
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"}) //把msg=zoick存入到session域中
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(value = "username") String name) {
        System.out.println("执行了...");
        System.out.println(name);
        return "success";
    }

    /**
     * 获取请求体的内容
     *
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println("执行了...");
        System.out.println(body);
        return "success";
    }

    /**
     * PathVariable注解
     *
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{sssssid}")
    public String testPathVariable(@PathVariable(name = "sssssid") String id) {
        System.out.println("执行了...");
        System.out.println(id);
        return "success";
    }

    /**
     * 获取请求头的值
     *
     * @param header
     * @return
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String header) {
        System.out.println("执行了...");
        System.out.println(header);
        return "success";
    }

    /**
     * ModelAttribute注解
     *
     * @return
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user) {
        System.out.println("执行了...");
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public User showUser(String uname) {
        System.out.println("showUser方法执行了...");
        //通过用户查询数据库(模拟）
        User user = new User();
        user.setUname(uname);
        user.setAge(12);
        user.setDate(new Date());
        return user;
    }


    /**
     * SessionAttrubutes注解
     *
     * @return
     */
    @RequestMapping("/testSessionAttrubutes")
    public String testSessionAttrubutes(Model model) {
        System.out.println("执行了...");
        //底层会存储到request域对象中
        model.addAttribute("msg", "zoick");
        return "success";
    }

    /**
     * 获取值
     * @param modelmap
     * @return
     */
    @RequestMapping("/getSessionAttrubutes")
    public String getSessionAttrubutes(ModelMap modelmap) {
        System.out.println("getSessionAttrubutes...");
        String msg = (String) modelmap.get("msg");
        System.out.println(msg);
        return "success";
    }

    @RequestMapping("/delSessionAttrubutes")
    public String delSessionAttrubutes(SessionStatus status) {
        System.out.println("delSessionAttrubutes...");
        status.setComplete();
        return "success";
    }


}
