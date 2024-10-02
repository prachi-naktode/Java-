package com.prachi.DBconnect;
import java.sql.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url = "jdbc:mysql://localhost:3306/firstdatabase";
        String uname = "root";
        String pass = "mydatabasedata@999";

//        String query = "select sname from student where rollno = 2;";
        String query = "select * from student;";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);

        Statement st = con.createStatement();

        //get data from database
//        ResultSet rs = st.executeQuery(query); // it will give the whole data
//        String studentData = "";
//
//        //also check for next value and increment the pointer
//        while(rs.next()){
//            studentData = rs.getInt(1) + " : " + rs.getString(2);
//            System.out.println(studentData);
//        }

        //insert value to database
        int rollno = 6;
        String name = "Roshni";
        String query2 = "insert into student values(" + rollno + ",'" + name + "');";
        int rowsAffected = st.executeUpdate(query2);
        System.out.println(rowsAffected);
        st.close();
        con.close();
    }
}
