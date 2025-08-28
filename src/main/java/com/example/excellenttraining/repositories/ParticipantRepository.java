package com.example.excellenttraining.repositories;
import com.example.excellenttraining.entities.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
    List<Participant> findByStructureId(Long structureId);
    List<Participant> findByProfileId(Long profileId);
}
