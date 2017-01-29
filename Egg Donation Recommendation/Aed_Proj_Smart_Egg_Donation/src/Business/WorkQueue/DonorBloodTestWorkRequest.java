/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Donor;
import Business.Employee.Employee;
import java.util.Date;




public class DonorBloodTestWorkRequest extends WorkRequest{
    
     private String antispermAntibodies;
    private int completeBloodCount;
    private String bloodGroup;
    private int hemoglobinElectrophoresis;
    private Donor donor;
    private Date createdOn;

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
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

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

   

    @Override
    public String toString() {
        return donor.getName()  ;
    }

   
    
   
    
    
}
