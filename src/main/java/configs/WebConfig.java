package configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
    /*This configuration enables Thymeleaf with the default parameters;  this is why we don't have to add anything inside. */
}
