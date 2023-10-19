package ru.aston.intensive.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.aston.intensive.service.PairService;
import ru.aston.intensive.service.PairServiceImpl;

@Configuration
@ConditionalOnClass()
public class PairAutoConfig {

    @Value("${upcase:false}")
    private boolean flag;

    @Bean
    PairService pairService(){
        return new PairServiceImpl(flag);
    }
}
