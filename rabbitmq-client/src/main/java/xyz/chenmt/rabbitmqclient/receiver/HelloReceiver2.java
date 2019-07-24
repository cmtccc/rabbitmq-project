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
@RabbitListener(queues = "topic.messages")
public class HelloReceiver2 {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver2  : " + hello);
    }


}
