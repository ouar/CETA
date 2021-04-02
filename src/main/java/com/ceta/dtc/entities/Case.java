package com.ceta.dtc.entities;


import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "caseceta")
public class Case implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="language")
    private String language;
    @Column(name="norton_referral")
    private boolean nortonReferral;
    @Column(name="status_notes")
    private String statusNotes;
    @Column(name="translator")
    private boolean translator;
    @Column(name="caseworker_pcc_status")
    private String caseworkerPccStatus;
    @ManyToOne
    @JoinColumn(name = "caseworker", referencedColumnName = "id")
    private CaseWorker caseworkerId;


}
