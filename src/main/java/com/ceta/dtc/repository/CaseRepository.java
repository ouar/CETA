package com.ceta.dtc.repository;

import com.ceta.dtc.entities.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CaseRepository  extends JpaRepository<Case, Long> {


}
