package ru.kpfu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ru.kpfu.application.AppConstants;

/**
 * @author Iskander Valiev
 * created by isko
 * on 4/15/20
 */
@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Override
    public void sendMessage(String message) {
        kafkaTemplate.send(AppConstants.TOPIC, message);
    }
}
