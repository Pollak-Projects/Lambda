package hu.szakkor.onepick;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface OnePickRepositoryQuestion extends JpaRepository<OnepickQuestion, UUID> {

}
