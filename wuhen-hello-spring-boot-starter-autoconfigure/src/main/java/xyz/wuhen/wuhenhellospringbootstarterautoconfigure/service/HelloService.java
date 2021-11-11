package xyz.wuhen.wuhenhellospringbootstarterautoconfigure.service;


import org.springframework.beans.factory.annotation.Autowired;
import xyz.wuhen.wuhenhellospringbootstarterautoconfigure.service.bean.HelloProperties;

public class HelloService {
    @Autowired
    private HelloProperties helloProperties;

    public void hello() {
        System.out.println(helloProperties.getWho() + "-->say--->" + helloProperties.getName());
    }
}
