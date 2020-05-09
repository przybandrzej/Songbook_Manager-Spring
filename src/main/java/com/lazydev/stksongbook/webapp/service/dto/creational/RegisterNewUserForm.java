package com.lazydev.stksongbook.webapp.service.dto.creational;

import com.lazydev.stksongbook.webapp.util.Constants;
import com.lazydev.stksongbook.webapp.service.validators.NameConstraint;
import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Value
@Builder
public class RegisterNewUserForm {

  @NotNull(message = "Can't be null.")
  @Pattern(regexp = Constants.EMAIL_REGEX, message = Constants.EMAIL_INVALID_MESSAGE)
  String email;

  @NotNull(message = "Can't be null.")
  @Pattern(regexp = Constants.PASSWORD_REGEX, message = Constants.PASSWORD_INVALID_MESSAGE)
  String password;

  @NotNull(message = "Can't be null.")
  @Pattern(regexp = Constants.USERNAME_REGEX, message = Constants.USERNAME_INVALID_MESSAGE)
  String username;

  @NameConstraint
  String firstName;

  @NameConstraint
  String lastName;
}
