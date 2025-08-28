package com.example.excellenttraining.repositories;

import com.example.excellenttraining.entities.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TrainingRepository extends JpaRepository<Training, Long> {
    List<Training> findByYear(int year);
    List<Training> findByDomainId(Long domainId);

    @Query("SELECT t FROM Training t JOIN t.participants p WHERE p.id = :participantId")
    List<Training> findTrainingsByParticipantId(@Param("participantId") Long participantId);
}
