package com.example.skypro.proskyskyprospringexceptiondemo;

import com.example.skypro.proskyskyprospringexceptiondemo.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public String hello(){
        return "Hello mothefucker";
    }
    public String answerHello(String userName){
        return "Eres un cerdo asqueroso " + userName;
    }

}
