package com.ceta.dtc.services;

import com.ceta.dtc.entities.Case;

import java.util.List;

public interface CaseServices {
    List<Case> findAll();

    Case findById(long id);

    Case addCase(Case model);

   void removeCase(long id);
}
