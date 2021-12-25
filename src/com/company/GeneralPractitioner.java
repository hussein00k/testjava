package com.company;

public class GeneralPractitioner extends Doctor{
    Consultant consultant;

    public GeneralPractitioner(String doctorName, int doctorNumber, int doctorPhone, Consultant consultant) {
        super(doctorName, doctorNumber, doctorPhone);
        this.consultant = consultant;
    }

    public void printInfo(){
        System.out.println("\t-the practice doctor name is "+getDoctorName()+", Number : "+getDoctorNumber()+", Phone Number : "+getDoctorPhone());
    }
}
