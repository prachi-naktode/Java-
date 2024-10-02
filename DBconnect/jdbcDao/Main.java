package com.prachi.DBconnect.jdbcDao;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        StudentDAO d1 = new StudentDAO();
        d1.connect();
//        Student s1 = d1.getStudentByRollno(3);
//        System.out.println(s1.sname);

        //add student in table
        Student s2 = new Student();
        s2.sname = "kelly";
        s2.rollno = 8;
//        d1.addStudent(s2);

        //remove student
        d1.removeStudent(5);
    }
}

class StudentDAO{
    Connection con = null;
    public void connect(){
        String url = "jdbc:mysql://localhost:3306/firstdatabase";
        String uname = "root";
        String pass = "mydatabasedata@999";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,uname,pass);
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
    public Student getStudentByRollno(int rollno)  {
        Student s = new Student();
        s.rollno = rollno;

        try {
//            connect();
            String query = "select sname from student where rollno="+rollno;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();

            String name = rs.getString(1);
            s.sname = name;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return s;
    }

    public void addStudent(Student s){
        String query = "insert into student values(?,?)";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);
            pst.setInt(1,s.rollno);
            pst.setString(2,s.sname);

            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void removeStudent(int rollno){
        String query = "delete from student where rollno=" + rollno;
        try {
            Statement st = con.createStatement();
            int rowsAffected = st.executeUpdate(query);
            if(rowsAffected > 0){
                System.out.println("Deleted");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

class Student{
    int rollno;
    String sname;

}
