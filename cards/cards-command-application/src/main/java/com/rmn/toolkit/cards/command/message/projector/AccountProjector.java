package com.rmn.toolkit.cards.command.message.projector;

import com.rmn.toolkit.cards.command.event.card.CardCreatedEvent;
import com.rmn.toolkit.cards.command.model.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountProjector {
    public Account project(CardCreatedEvent event) {
        return event.getPayload().getAccount();
    }
}
