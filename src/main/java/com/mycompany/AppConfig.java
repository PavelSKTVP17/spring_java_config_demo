package com.mycompany;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.mycompany")
public class AppConfig 
{
    @Bean
    public MessageRenderer messageRenderer()
    {
        return new MessageRendererErrorImp( message(),messageBye());
    }
    @Bean
    public Message message(){return new HelloMessage(" My Name!");}
    @Bean
    public Message messageBye(){return new ByeMessage(" My Name!");}
}
