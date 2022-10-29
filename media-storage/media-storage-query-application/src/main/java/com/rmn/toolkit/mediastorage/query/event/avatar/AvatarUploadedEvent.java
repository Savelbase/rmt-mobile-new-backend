package com.rmn.toolkit.mediastorage.query.event.avatar;

import com.rmn.toolkit.mediastorage.query.event.Event;
import com.rmn.toolkit.mediastorage.query.event.EventPayload;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class AvatarUploadedEvent extends Event<AvatarUploadedEvent.Payload> {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @EqualsAndHashCode(callSuper = true)
    public static class Payload extends EventPayload {
        protected String url;
        protected boolean confirmed;
        protected ZonedDateTime dateTime;
    }
}