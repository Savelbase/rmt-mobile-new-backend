package com.rmn.toolkit.user.command.model;

import com.rmn.toolkit.user.command.model.type.ClientStatusType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Table(name = "deleted_users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeletedUser {
    @Id
    @NotNull
    private String id;

    @NotNull
    private String mobilePhone;

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    private String middleName;

    @NotNull
    private ZonedDateTime accessionDateTime;

    @NotNull
    private String passportNumber;

    @NotNull
    private boolean resident;

    @NotNull
    private String roleId;

    @Enumerated(EnumType.STRING)
    @NotNull
    private ClientStatusType status;

    @Type(type = "jsonb")
    @NotNull
    private List<Notification> notifications;
    private String email;

    @NotNull
    private String password;
    private String pinCode;

    @NotNull
    private String securityQuestion;
    @NotNull
    private String securityAnswer;
}
