package xyz.wuhen.startertest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.wuhen.wuhenhellospringbootstarterautoconfigure.service.HelloService;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public void hello() {
        helloService.hello();
    }
}
