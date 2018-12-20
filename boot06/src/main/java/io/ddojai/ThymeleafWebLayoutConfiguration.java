package io.ddojai;


import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(name = "nz.net.ultraq.thymeleaf.LayoutDialect")
public class ThymeleafWebLayoutConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }

}