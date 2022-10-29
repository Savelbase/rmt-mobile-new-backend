package com.rmn.toolkit.cards.command.event.card;

import com.rmn.toolkit.cards.command.event.Event;
import com.rmn.toolkit.cards.command.event.EventPayload;
import com.rmn.toolkit.cards.command.model.type.CardOrderStatusType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "CARD_ORDER_CREATED")
@Data
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class CardOrderCreatedEvent extends Event<CardOrderCreatedEvent.Payload> {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @EqualsAndHashCode(callSuper = true)
    public static class Payload extends EventPayload {
        private String clientId;
        private String cardProductId;
        private CardOrderStatusType status;
    }
}
