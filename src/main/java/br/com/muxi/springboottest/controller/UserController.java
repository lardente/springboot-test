package br.com.muxi.springboottest.controller;

import br.com.muxi.springboottest.dao.entity.User;
import br.com.muxi.springboottest.dao.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lardente on 07/06/2017.
 */
@RestController
@RequestMapping(value = "/1.0/users")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private ResponseEntity<User> response;

    @Autowired
    UserService userService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Page<User> getAllUsers(Pageable pageable) {

        logger.info("[Início]Recuperando Usuários");

        Page<User> users = userService.findAll(pageable);

        logger.info("[Fim]Recuperando Usuários");
        return users;
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUser(@PathVariable Long id) {

        logger.info("[Início]Recuperando Usuários");

        User user = userService.findOne(id);

        if (user != null){
            response = new ResponseEntity<>(user, HttpStatus.OK);
        } else {

            response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        logger.info("[Fim]Recuperando Usuários");
        return response;
    }
}
