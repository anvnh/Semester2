import Employee.*;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;


public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Experience experience = new Experience();
        Intern intern = new Intern();
        Fresher fresher = new Fresher();
        boolean isExit = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add Employee");
        System.out.println("2. Show Employee");
        System.out.println("3. Delete Employee");
        System.out.println("4. Update Employee");
        System.out.println("5. Exit");
        while(!isExit){
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    String name, birthDay, phone, email, employee_Type;
                    System.out.println("Full Name:");
                    employee.setFullName(scanner.next());
                    System.out.println("Birth Day:");
                    employee.setBirthDay(scanner.next());
                    System.out.println("Phone:");
                    employee.setPhone(scanner.next());
                    System.out.println("Email:");
                    employee.setEmail(scanner.next());
                    System.out.println("Employee Type:");
                    employee.setEmployee_Type(scanner.next());
                    String tmp = employee.getEmployee_Type();
                    //employee.addEmployee(employee.getFullName(), employee.getBirthDay(), employee.getPhone(), employee.getEmail(), employee.getEmployee_Type());
                    if(tmp.equals("Experiment")){
                        System.out.println("Experience in year:");
                        experience.setExpInYear(scanner.nextInt());
                        System.out.println("Pro Skill:");
                        experience.setProSkill(scanner.next());
                        employee.addEmployeeExp(employee.getFullName(), employee.getBirthDay(), employee.getPhone(), employee.getEmail(), employee.getEmployee_Type(), String.valueOf(0), experience.getExpInYear(), experience.getProSkill());
                    }
                    else if(tmp.equals("Intern")){
                        System.out.println("Majors:");
                        intern.setMajors(scanner.next());
                        System.out.println("Semester:");
                        intern.setSemester(scanner.next());
                        System.out.println("University Name:");
                        intern.setUniversityName(scanner.next());
                        employee.addEmployeeItr(employee.getFullName(), employee.getBirthDay(), employee.getPhone(), employee.getEmail(), employee.getEmployee_Type(), String.valueOf(0), intern.getMajors(), intern.getSemester(), intern.getUniversityName());
                    }
                    else if(tmp.equals("Fresher")){
                        System.out.println("Graduation Date:");
                        fresher.setGraduationDate(scanner.next());
                        System.out.println("Graduation Rank:");
                        fresher.setGraduationRank(scanner.next());
                        employee.addEmployeeFrs(employee.getFullName(), employee.getBirthDay(), employee.getPhone(), employee.getEmail(), employee.getEmployee_Type(), String.valueOf(0), fresher.getGraduationDate(), fresher.getGraduationRank());
                    }
                    break;
                case 2:
                    employee.showEmployee();
                    break;
                case 3:
                    System.out.println("Enter ID to delete:");
                    int ID = scanner.nextInt();
                    employee.deleteEmployee(ID);
                    break;
                case 4:
                    System.out.println("Enter ID to update:");
                    int ID1 = scanner.nextInt();
                    System.out.println("Full Name:");
                    employee.setFullName(scanner.next());
                    System.out.println("Birth Day:");
                    employee.setBirthDay(scanner.next());
                    System.out.println("Phone:");
                    employee.setPhone(scanner.next());
                    System.out.println("Email:");
                    employee.setEmail(scanner.next());
                    System.out.println("Employee Type:");
                    employee.setEmployee_Type(scanner.next());
                    employee.updateEmployee(ID1, employee.getFullName(), employee.getBirthDay(), employee.getPhone(), employee.getEmail(), employee.getEmployee_Type());
                    break;
                case 5:
                    isExit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}