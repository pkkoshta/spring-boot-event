package com.prashant.event.controller;

import com.prashant.event.domain.Patient;
import com.prashant.event.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patient")
public class DischargePatient {

    @Autowired
    private PatientService service;

    @PostMapping("/discharge")
    public String dischargePatient(@RequestBody Patient patient){
        return service.disChargePatient(patient);
    }
}
