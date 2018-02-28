package com.elon.controller;

import com.elon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 2017/7/19 15:29.
 * <p>
 * Email: cheerUpPing@163.com
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/gettime/{param}")
    public String getTime(@PathVariable("param") String param, HttpServletRequest httpRequest) {
        String time = userService.getTime(param);
        System.out.println("controller---------------" + param + "==" + time);
        httpRequest.setAttribute("time", time);
        return "time";
    }

    @RequestMapping(value = "/remove/{param}")
    public String removeTime(@PathVariable("param") String param, HttpServletRequest request) {
        userService.removeTime(param);
        request.setAttribute("time", "删除成功");
        return "time";
    }

    @RequestMapping(value = "/update/{param}")
    public String updateTime(@PathVariable("param") String param, HttpServletRequest request) {
        String time = userService.updateTime(param);
        request.setAttribute("time", time);
        return "time";
    }

}
