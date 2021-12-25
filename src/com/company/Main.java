package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        ArrayList<GeneralPractitioner> generalPractitioners = new ArrayList<>();
        ArrayList<Patient>patients=new ArrayList<>();
        ArrayList<Condition> conditions = new ArrayList<>();
        ArrayList<Hospital_Doctor>hospital_doctors=new ArrayList<>();
        ArrayList<Medication>medications=new ArrayList<>();
        ArrayList<Treatment>treatments=new ArrayList<>();
        //Doctor input information
        System.out.println("Doctor name :  ");
        String doctorName = put.nextLine();
        System.out.println("Doctor Number : ");
        int doctorNumber = put.nextInt();
        System.out.println("Doctor Phone: ");
        int doctorPhone = put.nextInt();
        Consultant consultant = new Consultant(doctorName, doctorNumber, doctorPhone, generalPractitioners);
        //general practitoner
        System.out.println("general practitoner information");
        System.out.println("#Number of General Practitoner : ");
        int gnum = put.nextInt();
        for (int i = 0; i < gnum; i++) {
            String solution = put.nextLine();
            System.out.println("General Practitioner Doctor name : ");
            String pName = put.nextLine();

            System.out.println("General Practitioner Doctor Number : ");
            int pNumber = put.nextInt();

            System.out.println("General Practitioner Doctor Phone: ");
            int pPhone = put.nextInt();
            GeneralPractitioner generalPractitioner = new GeneralPractitioner(pName, pNumber, pPhone, consultant);
            consultant.addg(generalPractitioner);
        }
            //input patient and condtion info
            System.out.println("#enter the number of Patient : ");
            int patient_number = put.nextInt();
            int patientAge = 0;
            String patientName = null;

            for (int i = 1; i <= patient_number; i++) {
                String solutino1 = put.nextLine();
                System.out.println("enter the patient name : ");
                patientName = put.nextLine();
                System.out.println("enter the Patient age : ");
                patientAge = put.nextInt();
                System.out.println("#enter the number of Conditions : ");
                int cond_number1 = put.nextInt();
                for (int s = 1; s <= cond_number1; s++) {
                    //patient condtion input info
                    String solution2 = put.nextLine();
                    System.out.println("enter the condtion " + s + " : ");
                    String condName = put.nextLine();
                    System.out.println("enter the condtion "+s+" mark : ");
                    String condmark = put.nextLine();
                    Condition cond1 = new Condition(condName, condmark);
                    conditions.add(cond1);
                    }
                    Patient patient = new Patient(patientName, patientAge, consultant, conditions,medications);
                    patients.add(patient);
                    }
                    //consultation info
                   System.out.println("enter the name of consultation : ");
                    String con_name= put.nextLine();
                   //hospital doctor info
                System.out.println("#enter the number of hospitatl doctor : ");
                int hDnum=put.nextInt();
                for(int i=0;i<hDnum;i++){
                    System.out.println("Hospital Doctor name : ");
                    String sout0=put.nextLine();
                    String hDName = put.nextLine();
                    System.out.println("Hospital Doctor Number : ");
                    int hDNumber = put.nextInt();
                    System.out.println("Hospital Doctor Phone: ");
                    int hDPhone = put.nextInt();
                    System.out.println("Hospital Doctor ID: ");
                    String soul1=put.nextLine();
                    String hDid = put.nextLine();
                    Hospital_Doctor hospital_doctor=new Hospital_Doctor(hDName,hDNumber,hDPhone,hDid);
                    hospital_doctors.add(hospital_doctor);
                }
                //medication info
                for(Patient p:patients){
                    System.out.println("#Number of Medication of Patient : "+p.getPatient_name());
                    int m_num=put.nextInt();
                    for (int k=0;k<m_num;k++){
                        System.out.println("enter medication name : ");
                        String soul0=put.nextLine();
                        String name=put.nextLine();
                        System.out.println("enter medication time: ");
                        String time=put.nextLine();
                        Medication medication=new Medication(name,time,p.getPatient_name());
                        medications.add(medication);
                    }
                }
                //treatment info
                for(Patient p:patients){
                    System.out.println("#Number of Treatment of Patient : "+p.getPatient_name());
                    int m_num=put.nextInt();
                    for (int k=0;k<m_num;k++){
                        System.out.println("enter Treatment name : ");
                        String soul0=put.nextLine();
                        String name=put.nextLine();
                        System.out.println("enter Treatment time: ");
                        String time=put.nextLine();
                        Treatment treatment=new Treatment(name,time,p.getPatient_name());
                        treatments.add(treatment);
                    }
                }

                    //display
                    consultant.printInfo();
                    for(Patient p:patients){
                        p.printInfo();
                    }
                    for(Hospital_Doctor h:hospital_doctors){
                        h.printInfo();
                    }
                    Consultation consultation=new Consultation(con_name,patients,hospital_doctors);
                    consultation.printInfo();
                    System.out.println("Medication : ");
                    for(Medication m:medications){
                        m.printInfo();
                    }
                    System.out.println("Treatment : ");
                    for(Treatment t:treatments){
                        t.printInfo();
                    }
                    }
                }

