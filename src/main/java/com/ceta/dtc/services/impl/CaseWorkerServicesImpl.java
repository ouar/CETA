package com.ceta.dtc.services.impl;

import com.ceta.dtc.entities.CaseWorker;
import com.ceta.dtc.repository.CaseWorkerRepository;
import com.ceta.dtc.services.CaseWorkerServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CaseWorkerServicesImpl  implements CaseWorkerServices {

    private final CaseWorkerRepository caseWorkerRepository;

    @Override
    public List<CaseWorker> findAll() {
        return this.caseWorkerRepository.findAll();
    }

    @Override
    public CaseWorker findById(long id) {
        return this.caseWorkerRepository.findById(id).get();
    }

    @Override
    public void addCaseWorker(CaseWorker model) {
        this.caseWorkerRepository.save(model);
    }

    @Override
    public void removeCaseWorker(long id) {
        this.caseWorkerRepository.deleteById(id);
    }
}
