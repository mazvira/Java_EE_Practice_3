package library;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyLibraryAutoConfig {

    @Bean
    @ConditionalOnProperty(value = "my.property", havingValue = "default")
    MyLibraryClass myLibraryClass() {
        return new MyLibraryClass("default");
    }

    @Bean
    @ConditionalOnProperty(value = "my.property", havingValue = "custom")
    MyLibraryClass myCustomClass() {
        return new MyLibraryClass("custom");
    }
}
