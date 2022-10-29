package com.rmn.toolkit.user.registration.dto.response.error;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GeneralErrorTypeErrorResponse {
    @Schema(example = "2022-04-16T23:07:59.441143700Z")
    private Instant dateTime;

    private ErrorType errorType;

    public enum ErrorType {
        CLIENT_ALREADY_IS_REGISTERED,
        NOT_BANK_CLIENT,
        BANK_CLIENT_ALREADY_EXIST,
        NOT_RF_RESIDENT,
        REQUIRED_FIELD_IS_MISSING,
        DUPLICATED_PASSPORT_NUMBER,
        NOT_ENOUGH_RIGHTS,
        CLIENT_NOT_FOUND,
        ROLE_NOT_FOUND,
        VERIFICATION_CODE_NOT_FOUND,
        RULES_NOT_FOUND,
        EXPIRED_TOKEN,
        EXPIRED_VERIFICATION_CODE,
        INVALID_TOKEN,
        RBSS_SHOULD_BE_ACCEPTED
    }
}
