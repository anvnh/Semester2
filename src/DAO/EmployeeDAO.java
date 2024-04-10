package DAO;

import Employee.*;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Position;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO{
    DBConnect conn = new DBConnect();
    Connection connection = conn.getConn();
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    String query;
    int check;
    public EmployeeDAO() throws Exception {
    }
    public boolean addEmpExp(Experience exp) throws Exception {
        Connection conn = new DBConnect().getConn();
        String Insert = "INSERT INTO employee(FullName, Birthday, Phone, Email, Type, ExperimentInYear, ProSkill) VALUES(?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(Insert);
        ps.setString(1, exp.getFullName());
        ps.setString(2, exp.getBirthDay());
        ps.setString(3, exp.getPhone());
        ps.setString(4, exp.getEmail());
        ps.setString(5, exp.getEmployee_Type());
        ps.setInt(6, exp.getExpInYear());
        ps.setString(7, exp.getProSkill());
        check = ps.executeUpdate();
        conn.close();
        return check > 0;
    }
    public boolean addEmpFrs(Fresher frs) throws Exception {
        Connection conn = new DBConnect().getConn();
        String Insert = "INSERT INTO employee(FullName, Birthday, Phone, Email, Type, GraduationDate, GraduationRank) VALUES(?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(Insert);
        ps.setString(1, frs.getFullName());
        ps.setString(2, frs.getBirthDay());
        ps.setString(3, frs.getPhone());
        ps.setString(4, frs.getEmail());
        ps.setString(5, frs.getEmployee_Type());
        ps.setString(6, frs.getGraduationDate());
        ps.setString(7, frs.getGraduationRank());
        check = ps.executeUpdate();
        conn.close();
        return check > 0;
    }
    public boolean addEmpItr(Intern itr) throws Exception {
        Connection conn = new DBConnect().getConn();
        String Insert = "INSERT INTO employee(FullName, Birthday, Phone, Email, Type, Majors, Semester, UniversityName) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(Insert);
        ps.setString(1, itr.getFullName());
        ps.setString(2, itr.getBirthDay());
        ps.setString(3, itr.getPhone());
        ps.setString(4, itr.getEmail());
        ps.setString(5, itr.getEmployee_Type());
        ps.setString(6, itr.getMajors());
        ps.setString(7, itr.getSemester());
        ps.setString(8, itr.getUniversityName());
        check = ps.executeUpdate();
        conn.close();
        return check > 0;
    }

    public boolean UpdateEmp(Employee emp) throws Exception {
        Connection conn = new DBConnect().getConn();
        String Update = "UPDATE Employee SET FullName = ?, Birthday = ?, Phone = ?, Email = ?, Type = ? WHERE ID = ?";
        PreparedStatement ps = conn.prepareStatement(Update);
        ps.setString(1, emp.getFullName());
        ps.setString(2, emp.getBirthDay());
        ps.setString(3, emp.getPhone());
        ps.setString(4, emp.getEmail());
        ps.setString(5, emp.getEmployee_Type());
        ps.setInt(6, emp.getID());
        check = ps.executeUpdate();
        conn.close();
        return check > 0;
    }
    public boolean DeleteEmp(int ID) throws Exception {
        Connection conn = new DBConnect().getConn();
        String Delete = "DELETE FROM Employee WHERE ID = ?";
        PreparedStatement ps = conn.prepareStatement(Delete);
        ps.setInt(1, ID);
        check = ps.executeUpdate();
        conn.close();
        return check > 0;
    }
    public List<Employee> getAllEmp() throws Exception {
        List<Employee> employees = new ArrayList<>();
        Connection conn = new DBConnect().getConn();
        String Select = "SELECT * FROM Employee";
        PreparedStatement ps = conn.prepareStatement(Select);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Employee emp = new Employee();
            emp.setID(rs.getInt("ID"));
            emp.setFullName(rs.getString("FullName"));
            emp.setBirthDay(rs.getString("Birthday"));
            emp.setPhone(rs.getString("Phone"));
            emp.setEmail(rs.getString("Email"));
            emp.setEmployee_Type(rs.getString("Type"));
            emp.setEmployee_Count(rs.getString("EmployeeCount"));
            employees.add(emp);
        }
        conn.close();
        return employees;
    }
}