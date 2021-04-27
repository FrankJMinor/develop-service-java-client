package mx.com.develop.clientes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public TransactionService transactionService(){
        return new TransactionServiceImpl();
    }
}
