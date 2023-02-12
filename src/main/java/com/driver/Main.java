package com.driver;


public class Main {

    public static void main(String args[]){
        RWOnly obj=new RWOnly();
        //obj.x=1;
        //System.out.println(obj.x);
        obj.setName("mustafa");
        obj.getName();
    }

}