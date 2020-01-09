package com.saas.cloud.nacos.configuration;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;

import javax.validation.constraints.NotNull;

/**
 * @ClassName: ResponseInterceptor
 * @Description:
 * @Author: yanrong
 * @Date: 2020/1/8 19:58
 */
@Slf4j
public class ResponseInterceptor implements Interceptor {
    @Override
    public Response intercept(@NotNull Chain chain) throws IOException {
        Request request = chain.request();
        try {
            Response response = chain.proceed(request);
            log.info("请求协议：{}",response.protocol());
            return response;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
