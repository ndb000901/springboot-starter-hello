package xyz.wuhen.wuhenhellospringbootstarterautoconfigure.service.auto;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.wuhen.wuhenhellospringbootstarterautoconfigure.service.HelloService;
import xyz.wuhen.wuhenhellospringbootstarterautoconfigure.service.bean.HelloProperties;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfigure {

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService() {
        return new HelloService();
    }
}
