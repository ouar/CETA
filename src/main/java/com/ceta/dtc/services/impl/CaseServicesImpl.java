package com.ceta.dtc.services.impl;

import com.ceta.dtc.entities.Case;
import com.ceta.dtc.repository.CaseRepository;
import com.ceta.dtc.services.CaseServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CaseServicesImpl implements CaseServices {

    private final CaseRepository caseRepository;


    @Override
    public List<Case> findAll() {
        return this.caseRepository.findAll();
    }

    @Override
    public Case findById(long id) {
        return this.caseRepository.findById(id).orElse(null);
    }

    @Override
    public Case addCase(Case model) {
        return this.caseRepository.save(model);
    }

    @Override
    public void removeCase(long id) {
        this.caseRepository.deleteById(id);
    }
}
