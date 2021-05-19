package com.appgate.test.util;

public class Employee {

  private int idEmployee;
  private String name;
  private int months;
  private int salary;

  public Employee(int idEm, String nameE, int month, int sal){
    idEmployee=idEm;
    name=nameE;
    months=month;
    salary=sal;
  }

  @Override
  public String toString(){
    return idEmployee+","+name+","+months+","+salary;
  }


}
