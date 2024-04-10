package Employee;

public class Fresher extends Employee implements IEmployee{
    public String GraduationDate;
    public String GraduationRank;
    public String Education;
    public Fresher(){}
    public Fresher(int ID, String FullName, String BirthDay, String Phone, String Email, String Employee_Type, String Employee_Count, String GraduationDate, String GraduationRank, String Education) {
        this.ID = ID;
        this.FullName = FullName;
        this.BirthDay = BirthDay;
        this.Phone = Phone;
        this.Email = Email;
        this.Employee_Type = Employee_Type;
        this.Employee_Count = Employee_Count;
        this.GraduationDate = GraduationDate;
        this.GraduationRank = GraduationRank;
        this.Education = Education;
    }

    public Fresher(int i, String name, String birthDay, String phone, String email, String employeeType, String employeeCount, String graduationDate, String graduationRank) {
        this.ID = i;
        this.FullName = name;
        this.BirthDay = birthDay;
        this.Phone = phone;
        this.Email = email;
        this.Employee_Type = employeeType;
        this.Employee_Count = employeeCount;
        this.GraduationDate = graduationDate;
        this.GraduationRank = graduationRank;
    }

    public void ShowInfo() {
    }

    public String getGraduationDate() {
        return GraduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        GraduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return GraduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        GraduationRank = graduationRank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }
}
