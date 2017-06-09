package br.com.muxi.springboottest.controller;

import br.com.muxi.springboottest.dao.entity.User;
import br.com.muxi.springboottest.dao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lardente on 07/06/2017.
 */
@Controller
@EnableAutoConfiguration
public class UserController {

    private String response;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/1.0/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<User>> listAllUsers() {
        List<User> users = (List<User>) userService.findAll();
        if (users.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
}
