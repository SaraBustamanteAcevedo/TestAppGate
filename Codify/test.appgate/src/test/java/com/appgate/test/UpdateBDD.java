package com.appgate.test;

import com.appgate.test.util.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateBDD {

  public void Update(){
  Employee employee[] = {new Employee(12258,"Simón",3,6000000),
      new Employee(13545,"Tomas",3,5400000),
      new Employee(45687,"Bartolomé",3,7200000),
      new Employee(21546,"Juan",3,4300000),
      new Employee(46875,"Andrés",3,3500000)};

  {
    try {
      // create a mysql database connection
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://127.0.0.1:5432/test";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");

      // the mysql insert statement
      String query =
          " insert into users (idEmployee, name, months, salary)"
              + " values (?, ?, ?, ?)";
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      for (int i = 1; i < employee.length; i++) {
        preparedStmt.setString(i, String.valueOf(employee[i]));
        i++;
      }
      // execute the preparedstatement
      preparedStmt.execute();
      conn.close();
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
  }
}
