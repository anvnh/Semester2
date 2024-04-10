package Employee;

public class Experience extends Employee implements IEmployee{
    public int ExpInYear;
    public String ProSkill;
    public Experience(){}
    public Experience(int ID, String FullName, String BirthDay, String Phone, String Email, String Employee_Type, String Employee_Count, int ExpInYear, String ProSkill) {
        this.ID = ID;
        this.FullName = FullName;
        this.BirthDay = BirthDay;
        this.Phone = Phone;
        this.Email = Email;
        this.Employee_Type = Employee_Type;
        this.Employee_Count = Employee_Count;
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }
    public void ShowInfo() {
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }
}
