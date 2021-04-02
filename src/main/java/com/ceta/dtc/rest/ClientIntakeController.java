package com.ceta.dtc.rest;



import com.ceta.dtc.entities.ClientIntake;
import com.ceta.dtc.services.ClientIntakeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/clientIntakes", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientIntakeController {

    @Autowired
    ClientIntakeServices clientIntakeServices;


    @GetMapping
    public ResponseEntity findAll() {
        List<ClientIntake> listClientIntake = this.clientIntakeServices.findAll();
        return ResponseEntity.ok(listClientIntake);
    }

    @GetMapping("/{id}")
    public ResponseEntity search(@PathVariable long id) {
        ClientIntake clientIntake = this.clientIntakeServices.findById(id);
        return ResponseEntity.ok(clientIntake);
    }

    @PostMapping
    void addCase(@RequestBody ClientIntake model) {
        this.clientIntakeServices.addClientIntake(model);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCase(@PathVariable long id) {
        this.clientIntakeServices.removeClientIntake(id);
        return ResponseEntity.ok("");
    }
}
