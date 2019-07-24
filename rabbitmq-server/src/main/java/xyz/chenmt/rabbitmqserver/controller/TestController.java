package xyz.chenmt.rabbitmqserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.chenmt.rabbitmqserver.model.User;
import xyz.chenmt.rabbitmqserver.sender.HelloSender;

/**
 * @program chenmtrabbitmq
 * @description:
 * @author: chenmet
 * @create: 2019/07/23 15:53
 */
@RestController
public class TestController {

    @Autowired
    HelloSender helloSender;

    @RequestMapping("test")
    public String sead(){
        User user=new User();
        user.setName("hehe");
        user.setPass("123456");
        helloSender.send();
        helloSender.send(user);
        helloSender.send1();
        helloSender.send2();
        helloSender.send3();
        return "success";
    }


}
