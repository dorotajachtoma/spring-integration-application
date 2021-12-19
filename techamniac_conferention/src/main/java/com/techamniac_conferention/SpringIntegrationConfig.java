package com.techamniac_conferention;


import com.techamniac_conferention.service.RegistrationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.MessageChannels;
import org.springframework.messaging.MessageChannel;

@Configuration
public class SpringIntegrationConfig {


    /*
    config of DLS for Spring Boot Integration


    @Bean
    public MessageChannel registrationRequest() {
        return MessageChannels.direct("registrationRequest").get();
    }

    @Bean
    public IntegrationFlow integrationFlow(RegistrationService registrationService){
        return IntegrationFlows.from("registrationRequest")
                .handle(registrationService, "register")
                .get();
    }
    */


    @Bean
    public MessageChannel registrationRequest(){
        return new DirectChannel();
    }
}
