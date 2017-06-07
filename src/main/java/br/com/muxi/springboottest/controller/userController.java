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

    @RequestMapping("/teste")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
