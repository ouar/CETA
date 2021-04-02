package com.ceta.dtc.rest;



import com.ceta.dtc.entities.CaseWorker;
import com.ceta.dtc.services.CaseWorkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/caseWorkers", produces = MediaType.APPLICATION_JSON_VALUE)
public class CaseWorkerController {

    @Autowired
    CaseWorkerServices caseWorkerServices;

    @GetMapping
    public ResponseEntity findAll() {
        List<CaseWorker> listCases = this.caseWorkerServices.findAll();
        return ResponseEntity.ok(listCases);
    }

    @GetMapping("/{id}")
    public ResponseEntity search(@PathVariable long id) {
        CaseWorker caseWorker = this.caseWorkerServices.findById(id);
        return ResponseEntity.ok(caseWorker);
    }

    @PostMapping
    void addCase(@RequestBody CaseWorker model) {
        this.caseWorkerServices.addCaseWorker(model);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCase(@PathVariable long id) {
        this.caseWorkerServices.removeCaseWorker(id);
        return ResponseEntity.ok("");
    }
}
