package com.prashant.event.service;

import com.prashant.event.event.DischargeEventPublisher;
import com.prashant.event.domain.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service

public class PatientService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public String disChargePatient(Patient patient){

        eventPublisher.publishEvent(new DischargeEventPublisher(this, patient.getId(), patient.getName()));

        return "patient " + patient.getName()+ " discharge successfully...";
    }
}
