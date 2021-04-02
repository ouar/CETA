package com.ceta.dtc.repository;



import com.ceta.dtc.entities.ClientIntake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientIntakeRepository extends JpaRepository<ClientIntake, Long> {
}
