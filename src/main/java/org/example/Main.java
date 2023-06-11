package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/record_company","root","Jmt1405");
            System.out.println("Connection Created");
            String query="CREATE TABLE STUDENT(ROLL INT,NAME VARCHAR(20))";
            Statement statement=con.createStatement();
            System.out.println("Statement Created ;)");
            statement.execute(query);
            System.out.println("Table Created");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}