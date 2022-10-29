package com.rmn.toolkit.bankclient.message;

import com.rmn.toolkit.bankclient.event.Event;
import com.rmn.toolkit.bankclient.event.EventPayload;
import com.rmn.toolkit.bankclient.repository.EventRepository;
import com.rmn.toolkit.bankclient.util.EventUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class EventSenderKafkaImpl implements EventSender {
    @Value("${kafka.topic.bank-client}")
    private String bankClientTopic;
    private final KafkaTemplate<Long, Event<? extends EventPayload>> kafkaTemplate;
    private final EventRepository eventRepository;

    @Override
    public void send(Event<? extends EventPayload> event) {
        kafkaTemplate.send(bankClientTopic, EventUtil.uuidStringToLong(event.getEntityId()), event);
        log.info("kafka send 'bank-client' event with entity-id {}", event.getEntityId());
        eventRepository.save(event);
        kafkaTemplate.flush();
    }
}
