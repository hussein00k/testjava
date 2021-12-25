package com.company;

public class Doctor {
    String doctorName;
    int doctorNumber;
    int doctorPhone;

    public Doctor(String doctorName, int doctorNumber, int doctorPhone) {
        this.doctorName = doctorName;
        this.doctorNumber = doctorNumber;
        this.doctorPhone = doctorPhone;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public int getDoctorNumber() {
        return doctorNumber;
    }

    public int getDoctorPhone() {
        return doctorPhone;
    }
}
