package com.uniloftsky.springframework.spring5jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5JmsApplication {

    public static void main(String[] args) throws Exception {

/*
        ActiveMQServer server = ActiveMQServers.newActiveMQServer(new ConfigurationImpl()
                .setPersistenceEnabled(false)
                .setJournalDirectory("target/data/journal")
                .setSecurityEnabled(false)
                .addAcceptorConfiguration("invm", "vm://0")
        );

        server.start();
*/

        SpringApplication.run(Spring5JmsApplication.class, args);
    }

}
