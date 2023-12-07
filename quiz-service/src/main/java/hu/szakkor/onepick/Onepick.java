package hu.szakkor.onepick;

import jakarta.persistence.*;
import lombok.*;

import java.security.Timestamp;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "onepick", schema = "Quiz")
public class Onepick {

}
