package xyz.chenmt.rabbitmqserver.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program chenmtrabbitmq
 * @description:
 * @author: chenmet
 * @create: 2019/07/23 15:41
 */
@Configuration
public class RabbitConfig {


    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }

}
