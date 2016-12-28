package com.kodz.schema.controller;

import com.kodz.schema.Message;
import com.kodz.schema.bean.Beanek;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by michal.kodz on 05-11-2015.
 */
@RestController
public class RestControllerek {

    @Autowired
    Beanek serwisik;

    @RequestMapping("/hello/{people}")

    public Message getMessage(@PathVariable String people)
    {
        return  serwisik.retiveMessage(people);
    }
}
