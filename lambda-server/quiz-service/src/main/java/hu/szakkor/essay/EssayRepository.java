package hu.szakkor.essay;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EssayRepository extends JpaRepository<Essay, UUID> {
}
