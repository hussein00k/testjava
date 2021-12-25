package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Medication {
    String name;
    String time;
    String p_name;
    public Medication(String name, String time,String p_name) {
        this.name = name;
        this.time = time;
        this.p_name=p_name;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getP_name() {
        return p_name;
    }

    public void printInfo(){
        System.out.println("Patient "+getP_name()+" medication : "+getName()+" time "+getTime());
        }
    }

