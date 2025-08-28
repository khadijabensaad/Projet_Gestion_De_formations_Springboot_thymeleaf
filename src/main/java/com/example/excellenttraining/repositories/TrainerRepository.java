package com.example.excellenttraining.repositories;
import com.example.excellenttraining.entities.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {
    List<Trainer> findByType(String type); // "interne" or "externe"
}
