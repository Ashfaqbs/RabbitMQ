package com.example.understanding_rabbit_mq.services;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {
    public static final String QUEUE_NAME = "exampleQueue";

    @RabbitListener(queues = QUEUE_NAME)
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }

    // as we are in same project we dont need to create a queue bean
    /*
     * @Bean
    public Queue exampleQueue() {
        return new Queue(QUEUE_NAME, false);
    }
     */
}

