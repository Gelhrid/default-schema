package com.kodz.springmvc.controller;

import com.kodz.schema.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by michal.kodz on 05-11-2015.
 */
@RestController
public class RestControllerek {
    @RequestMapping("/hello/{people}")
    public Message getMessage(@PathVariable String people){
        Message msg = new Message(people, "HEY" + people);
        return  msg;
    }
}
