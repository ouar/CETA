package com.ceta.dtc.services;

import com.ceta.dtc.entities.Case;
import com.ceta.dtc.entities.CaseWorker;

import java.util.List;

public interface CaseWorkerServices {
    List<CaseWorker> findAll();

    CaseWorker findById(long id);

    void addCaseWorker(CaseWorker model);

    void removeCaseWorker(long id);
}
