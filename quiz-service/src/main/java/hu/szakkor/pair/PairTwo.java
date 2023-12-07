package hu.szakkor.pair;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pairTwo", schema = "Forum")
public class PairTwo {

    @Id
    @Generated
    private UUID id;

    private String pairOne;

    @JsonIgnore
    @ManyToMany(mappedBy = "pairTwo" ,cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<PairOne> pairTwoSet;
}
