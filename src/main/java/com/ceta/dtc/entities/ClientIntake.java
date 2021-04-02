package com.ceta.dtc.entities;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "client_intake")
public class ClientIntake implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Column(name = "accept")
    private boolean accept;
    @ManyToOne
    @JoinColumn(name = "case_id", referencedColumnName = "id")
    private Case caseId;
    @Column(name = "fjc")
    private String fjc;
    @Column(name = "safe_email")
    private boolean safeEmail;
    @Column(name = "safe_phone")
    private boolean safePhone;
    @Column(name = "safe_times")
    private String safeTimes;

    @Column(name = "preferred_contact")
    private String preferredContact;
    @Column(name = "device_concerns")
    private String deviceConcerns;

    @Column(name = "account_concerns")
    private String accountConcerns;
    @Column(name = "general_concerns")
    private String generalConcerns;
    @Column(name = "fluent_languages")
    private String fluentLanguages;
    @Column(name = "pronouns")
    private String pronouns;
    @Column(name = "race_ethnicity")
    private String raceEthnicity;
    @Column(name = "age")
    private String age;
    @Column(name = "caseworker_share")
    private boolean caseworkerShare;
    @Column(name = "research_understand")
    private boolean researchUnderstand;


    @PostLoad
    protected void repair() {
        if (fjc != null) fjc = fjc.trim();
        if (age != null) age = age.trim();
        if (raceEthnicity != null) raceEthnicity = raceEthnicity.trim();
        if (pronouns != null) pronouns = pronouns.trim();
        if (fluentLanguages != null) fluentLanguages = fluentLanguages.trim();
        if (generalConcerns != null) generalConcerns = generalConcerns.trim();
        if (accountConcerns != null) accountConcerns = accountConcerns.trim();

        if (deviceConcerns != null) deviceConcerns = deviceConcerns.trim();
        if (preferredContact != null) preferredContact = preferredContact.trim();
        if (safeTimes != null) safeTimes = safeTimes.trim();
    }


}
