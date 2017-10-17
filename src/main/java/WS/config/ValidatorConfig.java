package WS.config;

import WS.interceptors.HeaderValidatorInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ValidatorConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private HeaderValidatorInterceptor headerValidator;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(headerValidator);
    }
}
