package com.company;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class Consultant extends Doctor {

    ArrayList<GeneralPractitioner> generalPractitioners=new ArrayList<>();

    public Consultant(String doctorName, int doctorNumber, int doctorPhone,ArrayList<GeneralPractitioner> generalPractitioners) {
        super(doctorName, doctorNumber, doctorPhone);
        this.generalPractitioners=generalPractitioners;
    }


    public ArrayList<GeneralPractitioner> getGeneralPractitioners() {
        return generalPractitioners;
    }
    public void addg(GeneralPractitioner generalPractitioner){
        this.generalPractitioners.add(generalPractitioner);
    }

    public void printInfo(){
        System.out.println("The doctor name is "+getDoctorName()+", number : "+getDoctorNumber()+", phone : "+getDoctorPhone());
        for(GeneralPractitioner g:getGeneralPractitioners()){
            g.printInfo();
        }
    }
}
