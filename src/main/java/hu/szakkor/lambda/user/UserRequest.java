package hu.szakkor.lambda.user;

import java.sql.Date;

public record UserRequest(
        String email,
        String password,
        Date birthDate,
        short omId
) {
}
