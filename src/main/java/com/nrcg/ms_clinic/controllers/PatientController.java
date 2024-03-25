package com.nrcg.ms_clinic.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.nrcg.ms_clinic.models.Attention;
import com.nrcg.ms_clinic.models.Patient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api")
public class PatientController {

    private List<Patient> patients = new ArrayList<>();

    public PatientController() {
        patients.add(
                new Patient(1, "Nestor", "Castillo", "M",
                        Arrays.asList(
                                new Attention(1, "Dolor de cabeza", new Date()),
                                new Attention(2, "Dolor de espalda", new Date()),
                                new Attention(3, "Dolor de rodilla", new Date()))));
        patients.add(
                new Patient(2, "Patricia", "Perez", "F",
                        Arrays.asList(
                                new Attention(1, "Dolor abdominal", new Date()),
                                new Attention(2, "Dolor de cadera", new Date()))));
        patients.add(
                new Patient(3, "Carlos", "Garcia", "M",
                        Arrays.asList(
                                new Attention(1, "Dolor de espalda", new Date()),
                                new Attention(2, "Dolor de rodilla", new Date()),
                                new Attention(3, "Dolor de cabeza", new Date()),
                                new Attention(4, "Dolor de cadera", new Date()))));
    }

    @GetMapping("/patients")
    public List<Patient> getPatients() {
        return patients;
    }

    @GetMapping("/patient/{patientId}")
    public Patient getPatient(@PathVariable("patientId") int patientId) {
        return patients.get(patientId - 1);
    }

    @GetMapping("/patient/{patientId}/medicalrecord")
    public List<Attention> getMedicalRecordById(@PathVariable("patientId") int id) {
        return patients.get(id - 1).getMedicalRecord();
    }

}
