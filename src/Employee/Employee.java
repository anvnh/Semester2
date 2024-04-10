package Employee;
import DAO.*;

public class Employee {
    public int ID;
    public String FullName, BirthDay, Phone, Email, Employee_Type, Employee_Count;
    public Employee() {
    }
    public Employee(int ID, String FullName, String BirthDay, String Phone, String Email, String Employee_Type) {
        this.ID = ID;
        this.FullName = FullName;
        this.BirthDay = BirthDay;
        this.Phone = Phone;
        this.Email = Email;
        this.Employee_Type = Employee_Type;
    }
    public void Employee(int ID, String FullName, String BirthDay, String Phone, String Email, String Employee_Type, String Employee_Count, String GraduationDate, String GraduationRank, String Education, String Majors, String Semester, String UniversityName, int ExpInYear, String ProSkill){
        this.ID = ID;
        this.FullName = FullName;
        this.BirthDay = BirthDay;
        this.Phone = Phone;
        this.Email = Email;
        this.Employee_Type = Employee_Type;
        this.Employee_Count = Employee_Count;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String birthDay) {
        BirthDay = birthDay;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmployee_Type() {
        return Employee_Type;
    }

    public void setEmployee_Type(String employee_Type) {
        Employee_Type = employee_Type;
    }

    public String getEmployee_Count() {
        return Employee_Count;
    }

    public void setEmployee_Count(String employee_Count) {
        Employee_Count = employee_Count;
    }


    public void addEmployeeExp(String name, String birthDay, String phone, String email, String employee_Type, String Employee_Count, int ExpInYear, String ProSkill){
        try {
            EmployeeDAO employeeDAO = new EmployeeDAO();
            Experience exp = new Experience(1, name, birthDay, phone, email, employee_Type, Employee_Count, ExpInYear, ProSkill);
            employeeDAO.addEmpExp(exp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addEmployeeFrs(String name, String birthDay, String phone, String email, String employee_Type, String Employee_Count, String GraduationDate, String GraduationRank){
        try {
            EmployeeDAO employeeDAO = new EmployeeDAO();
            Fresher frs = new Fresher(1, name, birthDay, phone, email, employee_Type, Employee_Count, GraduationDate, GraduationRank);
            employeeDAO.addEmpFrs(frs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addEmployeeItr(String name, String birthDay, String phone, String email, String employee_Type, String Employee_Count, String Majors, String Semester, String UniversityName){
        try {
            EmployeeDAO employeeDAO = new EmployeeDAO();
            Intern itr = new Intern(1, name, birthDay, phone, email, employee_Type, Employee_Count, Majors, Semester, UniversityName);
            employeeDAO.addEmpItr(itr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateEmployee(int ID, String name, String birthDay, String phone, String email, String employee_Type) {
        try {
            EmployeeDAO employeeDAO = new EmployeeDAO();
            Employee needed = new Employee(ID, name, birthDay, phone, email, employee_Type);
            employeeDAO.UpdateEmp(needed);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void showEmployee() {
        try {
            EmployeeDAO employeeDAO = new EmployeeDAO();
            for (Employee employee : employeeDAO.getAllEmp()) {
                System.out.println("===============================================");
                System.out.println("ID: " + employee.getID());
                System.out.println("Full Name: " + employee.getFullName());
                System.out.println("Birth Day: " + employee.getBirthDay());
                System.out.println("Phone: " + employee.getPhone());
                System.out.println("Email: " + employee.getEmail());
                System.out.println("Employee Type: " + employee.getEmployee_Type());
                System.out.println("Employee Count: " + employee.getEmployee_Count());
                System.out.println("===============================================");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteEmployee(int ID) {
        try {
            EmployeeDAO employeeDAO = new EmployeeDAO();
            employeeDAO.DeleteEmp(ID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
