package br.com.muxi.springboottest.controller;

import br.com.muxi.springboottest.dao.entity.User;
import br.com.muxi.springboottest.dao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lardente on 07/06/2017.
 */
@Controller
@EnableAutoConfiguration
public class UserController {

    private String response;

    @Autowired
    UserService userService;

    @ResponseBody
    @GetMapping(value = "/1.0/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<User> getAllUsers(Pageable pageable) {
        Page<User> users = userService.findAll(pageable);
        return users;
    }
}
