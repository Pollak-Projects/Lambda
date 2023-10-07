package hu.szakkor.lambda.user;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users", schema = "public")
public class User {
    @Id
    @GeneratedValue
    private UUID id;
    private String email;
    private String password;
    private Date birthDate;
    @Column(length = 11)
    private short omId;

}
