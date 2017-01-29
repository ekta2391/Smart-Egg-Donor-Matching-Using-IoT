/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Enterprise.Enterprise;
import Business.HormonalRecords.HormonalRecordsHistory;
import Business.Organization.OrganizationDirectory;


public abstract class Employee {
    
  
    private int id;
    private static int count=1;
   
    private String name;
   private HormonalRecordsHistory hormonalRecordsHistory;
    
    public Employee(){
        
        id=count;
        count++;
  hormonalRecordsHistory = new HormonalRecordsHistory();
    }

    public HormonalRecordsHistory getHormonalRecordsHistory() {
        return hormonalRecordsHistory;
    }

    public void setHormonalRecordsHistory(HormonalRecordsHistory hormonalRecordsHistory) {
        this.hormonalRecordsHistory = hormonalRecordsHistory;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    @Override
    public String toString() {
        return name ;
    }


    
    
}
