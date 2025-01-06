package weddingplanner;

/**
 *
 * @author HP
 */
public class DummyTableClass {
 

    private String department;
    private int VolunteerCount;


    public DummyTableClass() {
    }

    public DummyTableClass(String department, int VolunteerCount) {
        this.department = department;
        this.VolunteerCount = VolunteerCount;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getVolunteerCount() {
        return VolunteerCount;
    }

    public void setVolunteerCount(int VolunteerCount) {
        this.VolunteerCount = VolunteerCount;
    }

    @Override
    public String toString() {
        return "DummyTableClass{" + "department=" + department + ", VolunteerCount=" + VolunteerCount + '}';
    }


    
}
