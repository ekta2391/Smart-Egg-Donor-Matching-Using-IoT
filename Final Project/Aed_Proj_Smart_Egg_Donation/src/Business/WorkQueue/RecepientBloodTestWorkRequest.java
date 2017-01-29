/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Employee.Recepient;
import java.util.Date;




public class RecepientBloodTestWorkRequest extends WorkRequest{
     private Recepient recepient;
     private String antispermAntibodies;
    private int completeBloodCount;
    private String bloodGroup;
    private int hemoglobinElectrophoresis;
    private Date createdOn;

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    
    

    public Employee getRecepient() {
        return recepient;
    }

    public void setRecepient(Recepient recepient) {
        this.recepient = recepient;
    }

    public String getAntispermAntibodies() {
        return antispermAntibodies;
    }

    public void setAntispermAntibodies(String antispermAntibodies) {
        this.antispermAntibodies = antispermAntibodies;
    }

   

   

    public int getCompleteBloodCount() {
        return completeBloodCount;
    }

    public void setCompleteBloodCount(int completeBloodCount) {
        this.completeBloodCount = completeBloodCount;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getHemoglobinElectrophoresis() {
        return hemoglobinElectrophoresis;
    }

    public void setHemoglobinElectrophoresis(int hemoglobinElectrophoresis) {
        this.hemoglobinElectrophoresis = hemoglobinElectrophoresis;
    }
    
    
    
    
    @Override
    public String toString(){
        return recepient.getName();
    }
    
    
}
