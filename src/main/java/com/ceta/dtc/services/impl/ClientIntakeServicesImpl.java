package com.ceta.dtc.services.impl;


import com.ceta.dtc.entities.ClientIntake;
import com.ceta.dtc.repository.ClientIntakeRepository;
import com.ceta.dtc.services.ClientIntakeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ClientIntakeServicesImpl implements ClientIntakeServices {

    private final ClientIntakeRepository clientIntakeRepository;

    @Override
    public List<ClientIntake> findAll() {
        return this.clientIntakeRepository.findAll();
    }

    @Override
    public ClientIntake findById(long id) {
        return this.clientIntakeRepository.findById(id).get();
    }

    @Override
    public void addClientIntake(ClientIntake model) {
        this.clientIntakeRepository.save(model);
    }

    @Override
    public void removeClientIntake(long id) {
        this.clientIntakeRepository.deleteById(id);
    }
}
