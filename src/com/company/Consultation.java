package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Consultation {
    String name;
    List<Patient> patients=new ArrayList<>();
    List<Hospital_Doctor>hospital_doctors=new ArrayList<>();

    public Consultation(String name, List<Patient> patients,List<Hospital_Doctor>hospital_doctors) {
        this.name = name;
        this.patients = patients;
        this.hospital_doctors=hospital_doctors;
    }


    public List<Patient> getPatients() {
        return patients;
    }

    public List<Hospital_Doctor> getHospital_doctors() {
        return hospital_doctors;
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient patient){
        this.patients.add(patient);
    }
    public void addHdoctor(Hospital_Doctor hospital_doctor){
        this.hospital_doctors.add(hospital_doctor);
    }
    public void printInfo() {
        System.out.println("Consultation Information : ");
        System.out.println("The Consultation " + getName()+" The Patients in are : ");
        for (Patient patient : getPatients()) {
            System.out.println("\t-"+patient.getPatient_name());
        }
        System.out.println("The Consultation Hospital Doctors are : ");
        for(Hospital_Doctor hospital_doctor:getHospital_doctors()){
            System.out.println("\t-Dr."+hospital_doctor.getDoctorName());
        }
    }
}
