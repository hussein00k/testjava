package com.company;

public class Hospital_Doctor extends Doctor{
    String hospitatl_id;
    public Hospital_Doctor(String doctorName, int doctorNumber, int doctorPhone,String hospitatl_id) {
        super(doctorName, doctorNumber, doctorPhone);
        this.hospitatl_id=hospitatl_id;
    }

    public String getHospitatl_id() {
        return hospitatl_id;
    }
    public void printInfo(){
        System.out.println("Hospital Doctor Name : "+getDoctorName()+" number : "+getDoctorNumber()+" phone : "+getDoctorPhone()+" hosiptial ID "+getHospitatl_id());
    }
}
