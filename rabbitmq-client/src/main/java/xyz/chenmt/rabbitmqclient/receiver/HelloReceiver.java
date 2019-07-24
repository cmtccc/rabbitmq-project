package xyz.chenmt.rabbitmqclient.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import xyz.chenmt.rabbitmqserver.model.User;

/**
 * @program chenmtrabbitmq
 * @description:
 * @author: chenmet
 * @create: 2019/07/23 15:44
 */
@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  : " + hello);
    }

    @RabbitHandler
    public void process(User user) {
        System.out.println("Receiver object : " + user.toString());
    }


}
