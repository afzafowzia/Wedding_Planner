
package weddingplanner;

import java.io.Serializable;

public class Employee implements Serializable{

    public Employee(int id, String name, String group, float salary) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.salary = salary;
    }



    private int id;
    private String name, group;
    private float salary;
    public int getId() {
        return id;
    }
    public void submitReport(){}
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    

    public Employee() {
        
    }    

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", group=" + group + ", salary=" + salary + "}\n";
    }

    
}