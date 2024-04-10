package Employee;

public class Intern extends Employee implements IEmployee{
    public String Majors;
    public String Semester;
    public String UniversityName;
    public Intern(){}
    public Intern(int ID, String FullName, String BirthDay, String Phone, String Email, String Employee_Type, String Employee_Count, String Majors, String Semester, String UniversityName) {
        this.ID = ID;
        this.FullName = FullName;
        this.BirthDay = BirthDay;
        this.Phone = Phone;
        this.Email = Email;
        this.Employee_Type = Employee_Type;
        this.Employee_Count = Employee_Count;
        this.Majors = Majors;
        this.Semester = Semester;
        this.UniversityName = UniversityName;
    }
    public void ShowInfo() {
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        Majors = majors;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getUniversityName() {
        return UniversityName;
    }

    public void setUniversityName(String universityName) {
        UniversityName = universityName;
    }
}
