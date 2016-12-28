package com.kodz.schema.bean;

import com.kodz.schema.Message;
import org.springframework.stereotype.Component;

/**
 * Created by michal.kodz on 12-11-2015.
 */
@Component
public class Beanek {

    public Message retiveMessage(String text){
        Message msg = new Message(text, "HELL " + text);
        return  msg;
    }
}
