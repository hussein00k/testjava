package com.company;

import java.util.List;

public class Patient {
    String patient_name;
    int patient_age;
    Consultant consultant;
    List<Condition> conditions;
    List<Medication> medications;

    public Patient(String patient_name, int patient_age,Consultant consultant, List<Condition> conditions,List<Medication> medications) {
        this.patient_name = patient_name;
        this.patient_age = patient_age;
        this.consultant=consultant;
        this.conditions = conditions;
        this.medications=medications;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public int getPatient_age() {
        return patient_age;
    }

    public List<Medication> getMedications() {
        return medications;
    }

    public List<Condition> getConditions() {
        return conditions;
    }
    public void printInfo(){
        System.out.println("The Doctor "+consultant.getDoctorName()+" patients : ");
        System.out.println("\t-the patient name : "+getPatient_name()+" ,age : "+getPatient_age());

        List<Condition> conditions1=getConditions();
        for(Condition condition:conditions1){
            condition.printInfo();
        }

    }
}
