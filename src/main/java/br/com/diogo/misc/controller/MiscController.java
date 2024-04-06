package br.com.diogo.misc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MiscController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Misc!";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
