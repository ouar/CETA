package com.ceta.dtc.entities;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "caseworker")
public class CaseWorker implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private String phone;

    @PostLoad
    protected void repair(){
        if(name!=null)name=name.trim();
        if(email!=null)email=email.trim();
        if(phone!=null)phone=phone.trim();
    }
}
