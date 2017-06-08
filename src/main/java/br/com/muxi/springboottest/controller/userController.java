package br.com.muxi.springboottest.controller;

import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lardente on 07/06/2017.
 */
@Controller
@EnableAutoConfiguration
public class userController {

    private String response;

    @RequestMapping(value = "/teste", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String home() {

        response = "Hello World!";
        return response;
    }
}
