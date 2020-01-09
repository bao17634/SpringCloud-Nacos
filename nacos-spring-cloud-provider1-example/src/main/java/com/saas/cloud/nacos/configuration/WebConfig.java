package com.saas.cloud.nacos.configuration;
import io.undertow.UndertowOptions;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @ClassName: WebConfig
 * @Description: 配置Undertow使用Http2协议
 * @Author: yanrong
 * @Date: 2020/1/8 19:55
 */

@Configuration
public class WebConfig {
    @Bean
    public UndertowServletWebServerFactory embeddedServletContainerFactory() {
        UndertowServletWebServerFactory factory = new UndertowServletWebServerFactory();
        factory.addBuilderCustomizers(builder -> builder.setServerOption(UndertowOptions.ENABLE_HTTP2, true));
        return factory;
    }
}
