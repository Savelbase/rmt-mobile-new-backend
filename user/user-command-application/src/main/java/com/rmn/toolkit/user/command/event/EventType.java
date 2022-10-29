package com.rmn.toolkit.user.command.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum EventType {
    CLIENT_REGISTERED(AssociatedObject.CLIENT),
    USER_EDITED(AssociatedObject.USER),
    CLIENT_STATUS_CHANGED(AssociatedObject.CLIENT),
    NOTIFICATION_CHANGE_STATE(AssociatedObject.USER),
    USER_DELETED(AssociatedObject.USER),
    APPROVED_BANK_CLIENT(AssociatedObject.CLIENT);

    @Getter
    private final AssociatedObject associatedObject;

    public enum AssociatedObject {
        CLIENT,
        USER,
    }
}
