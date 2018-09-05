package org.bobo.util.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

/**
 * @author tian.xubo
 * @created 2018 - 04 - 11 16:41
 */
@Configuration
public class FeignRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
    }
}
