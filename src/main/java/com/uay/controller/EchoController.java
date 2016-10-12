package com.uay.controller;

import com.uay.entity.Message;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EchoController {

    @RequestMapping(path = "/echo/{message}", method= RequestMethod.GET)
    public Message getEcho(@PathVariable("message") String str) {
        return new Message("Hello " + str);
    }

    @RequestMapping(path = "/echo", method = RequestMethod.POST)
    public Message postEcho(@RequestBody Message message) {
        return new Message("Hello " + message.getMessage());
    }
}
