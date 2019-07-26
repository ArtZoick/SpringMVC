package top.zoick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.zoick.exception.SysException;

/**
 * @author zoick
 * @date 2019/7/25 14:11
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testException")
    public String testException() throws SysException {

        try {
            //模拟异常
            int a = 10 / 0;
        } catch (Exception e) {
            //打赢异常
            e.printStackTrace();
            throw new SysException("查询所有用户出现了错误....");
        }

        System.out.println("testException方法执行了");
        return "success";
    }
}
