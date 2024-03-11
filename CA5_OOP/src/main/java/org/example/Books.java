package org.example;

public class Books {
    public void start(){
        String url = "jdbc:myqsl://localhost/";
        String dbName = "bookshop";
        String userName = "root";
        String password = "";

        try(Connection conn = DriverManager.getConnection(url + dbName, userName, password))
        {


        }
    }



}
