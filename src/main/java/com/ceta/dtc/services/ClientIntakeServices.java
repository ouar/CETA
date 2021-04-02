package com.ceta.dtc.services;

import com.ceta.dtc.entities.ClientIntake;

import java.util.List;

public interface ClientIntakeServices {
    List<ClientIntake> findAll();

    ClientIntake findById(long id);

    void addClientIntake(ClientIntake model);

    void removeClientIntake(long id);
}
