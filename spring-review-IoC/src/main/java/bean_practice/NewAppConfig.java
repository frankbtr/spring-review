package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NewAppConfig {

    @Bean(name = "String 1")
    public String str1(){
        return  "Welcome to App.";
    }

    @Bean
    @Primary
    public String str2(){
        return "Spring core practice";
    }
}
