/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;


import java.util.ArrayList;


public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;
    
    public EmployeeDirectory(){
        employeeList=new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
  
    public void  createEmployee(Employee employee){
       
        employeeList.add(employee);
       
        
    }
}
