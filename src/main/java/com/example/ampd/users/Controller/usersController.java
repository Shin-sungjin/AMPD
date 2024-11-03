package com.example.ampd.users.Controller;

import org.apache.logging.log4j.spi.LoggerContextFactory;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactoryFriend;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.http.HttpRequest;

@Controller
@RequestMapping(value="/user")
public class usersController {

    @RequestMapping(value="/")
    public void userMain(HttpRequest hr){
    }

}
