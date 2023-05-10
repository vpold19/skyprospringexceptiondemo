package com.example.skypro.proskyskyprospringexceptiondemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {
    private final HelloServiceImpl helloService;
    public HelloController(HelloServiceImpl helloService){
        this.helloService = helloService;
    }
    private int counter;

    @GetMapping
    public String hello(){
        return helloService.hello();
    }
    @GetMapping(path = "/lol")
    public String answerHello(@RequestParam("name")String userName){
        return helloService.answerHello(userName);
    }

}
