package ru.kpfu.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.kpfu.application.AppConstants;

/**
 * @author Iskander Valiev
 * created by isko
 * on 4/15/20
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    @KafkaListener(topics = AppConstants.TOPIC, groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}
