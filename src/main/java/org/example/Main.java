package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb",
                    "root",
                    "developerCamu*@");

            Statement statementColumn = connection.createStatement();
            statementColumn.execute("ALTER TABLE students ADD COLUMN country VARCHAR(30)");

            Statement statementItaly = connection.createStatement();
            statementItaly.execute("UPDATE students SET country = \"Italy\" WHERE student_id <=2;");

            Statement statementGermany = connection.createStatement();
            statementGermany.execute("UPDATE students SET country = \"Germany\" WHERE student_id > 2 AND student_id <= 4;");

            System.out.println("I've add two column country and add two students to country");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error!!!");
        }
    }
}
