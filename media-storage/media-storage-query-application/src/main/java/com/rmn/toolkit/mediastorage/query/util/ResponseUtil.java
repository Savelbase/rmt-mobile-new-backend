package com.rmn.toolkit.mediastorage.query.util;

import com.rmn.toolkit.mediastorage.query.dto.response.error.GeneralErrorTypeErrorResponse;
import com.rmn.toolkit.mediastorage.query.dto.response.error.GeneralMessageErrorResponse;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class ResponseUtil {

    public GeneralErrorTypeErrorResponse createGeneralErrorTypeErrorResponse(GeneralErrorTypeErrorResponse.ErrorType errorType) {
        return GeneralErrorTypeErrorResponse.builder()
                .dateTime(Instant.now())
                .errorType(errorType)
                .build();
    }

    public GeneralMessageErrorResponse createGeneralMessageErrorResponse(String message) {
        return GeneralMessageErrorResponse.builder()
                .dateTime(Instant.now())
                .message(message)
                .build();
    }
}
