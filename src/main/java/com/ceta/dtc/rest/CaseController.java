package com.ceta.dtc.rest;


import com.ceta.dtc.entities.Case;
import com.ceta.dtc.services.CaseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(path = "/cases", produces = MediaType.APPLICATION_JSON_VALUE)
public class CaseController {


    @Autowired
    CaseServices caseServices;



    @GetMapping
    public ResponseEntity  findAll(){
        List<Case> listCase = this.caseServices.findAll();
        return ResponseEntity.ok(listCase);
    }

    @GetMapping("/{id}")
    public ResponseEntity search(@PathVariable long id){
        Case caseId = this.caseServices.findById(id);
        return ResponseEntity.ok(caseId);
    }

    @PostMapping
    void addCase(@RequestBody Case model){
        this.caseServices.addCase(model);
    }
    @DeleteMapping("/cases/{id}")
    public ResponseEntity  deleteCase(@PathVariable long id){
        this.caseServices.removeCase(id);
        return ResponseEntity.ok("");
    }
}
