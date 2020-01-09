package com.saas.cloud.nacos.configuration;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: HttpClientConfiguration
 * @Description: Http协议配置
 * @Author: yanrong
 * @Date: 2020/1/9 9:26
 */
@Configuration
public class HttpClientConfiguration {

    @Bean
    public OkHttpClient okHttpClient() {
        List<Protocol> protocols = new ArrayList<>();
        protocols.add(Protocol.H2_PRIOR_KNOWLEDGE);
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(120, TimeUnit.SECONDS)
                .connectionPool(new ConnectionPool());
        // 添加拦截器用于打印响应时所使用的协议
        builder.addInterceptor(new ResponseInterceptor());
        builder.protocols(protocols);
        return builder.build();
    }
}
