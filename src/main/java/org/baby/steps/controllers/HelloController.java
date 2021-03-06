package org.baby.steps.controllers;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/example/handlers")
public class HelloController {

    @RequestMapping(value = "/firstMethodHandler", method = RequestMethod.POST)
    public String simpleHelloMethodPost() {

        return "Hello World: POST";
    }

    @RequestMapping(value = "/firstMethodHandler", method = RequestMethod.GET)
    public String simpleHelloMethodGet() {

        return "Hello World: GET WOOOHOOO! This is FUN! :D";
    }
}
