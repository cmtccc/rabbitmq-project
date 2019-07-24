package xyz.chenmt.rabbitmqserver.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @program chenmtrabbitmq
 * @description:
 * @author: chenmet
 * @create: 2019/07/24 11:31
 */
@Data
@ToString
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    private String name;

    private String pass;


}
