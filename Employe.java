/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weddingplanner;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Employe extends User implements Serializable {
    
    private String group,department;
    private float salary;
    private int id;
    private String name;

    public Employe() {
    }

    public Employe(int accountId, String accountName, LocalDate doj, LocalDate dob,String group, String department, float salary) {
       
        this.id = id;
        this.name = name;
        this.doj = doj;
        this.dob = dob;
        this.group = group;
        this.department = department;
        this.salary = salary;
        
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getdepartment() {
        return department;
    }

    public void setdepartment(String department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    

    @Override
    public String toString() {
        return "Employe{" 
                
                + ",id="+id
                +",name="+name
                +",doj="+doj
                +",dob="+dob
                + "group=" + group 
                + ", department=" + department 
                + ", salary=" + salary 
                 +"}\n";
    }


  
    
}
