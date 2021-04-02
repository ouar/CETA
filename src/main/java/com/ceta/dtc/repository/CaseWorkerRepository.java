package com.ceta.dtc.repository;


import com.ceta.dtc.entities.CaseWorker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseWorkerRepository extends JpaRepository<CaseWorker, Long> {
}
