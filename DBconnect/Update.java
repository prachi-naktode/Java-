package com.prachi.DBconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/firstdatabase";
        String uname = "root";
        String pass = "mydatabasedata@999";

        int no = 7;
        String name = "mahi";
        String query = "insert into student values(?,?)";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        PreparedStatement pst = con.prepareStatement(query);

        //update the ? values
        pst.setInt(1,no);
        pst.setString(2,name);

        int rowsAffected = pst.executeUpdate();
        System.out.println(rowsAffected);

        pst.close();
        con.close();
    }
}
