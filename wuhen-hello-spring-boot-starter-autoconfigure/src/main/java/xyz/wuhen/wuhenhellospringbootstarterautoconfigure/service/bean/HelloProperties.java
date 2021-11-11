package xyz.wuhen.wuhenhellospringbootstarterautoconfigure.service.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("wuhen.hello")
public class HelloProperties {
    private String who;
    private String name;

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
