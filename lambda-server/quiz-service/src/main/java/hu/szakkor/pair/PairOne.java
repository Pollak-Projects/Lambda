package hu.szakkor.pair;

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
@Table(name = "pairOne", schema = "Forum")
public class PairOne {

    @Id
    @Generated
    private UUID id;

    private String pairOne;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(schema = "Forum", name = "pairOne_pairTwo",
            joinColumns = @JoinColumn(name = "pairOne_id"),
            inverseJoinColumns = @JoinColumn(name = "pairTwo_id"))
    private Set<PairTwo> pairTwoSet;
}
