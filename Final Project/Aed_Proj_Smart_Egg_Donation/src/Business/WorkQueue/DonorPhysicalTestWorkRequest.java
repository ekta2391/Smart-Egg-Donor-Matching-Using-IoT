/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import java.util.Date;



public class DonorPhysicalTestWorkRequest extends WorkRequest{
     private String baseLineUltrasound;
    private int cavityCheck;
    private int cysticFibrosis;
    private Employee donor;
    private Date createdOn;

    public String getBaseLineUltrasound() {
        return baseLineUltrasound;
    }

    public void setBaseLineUltrasound(String baseLineUltrasound) {
        this.baseLineUltrasound = baseLineUltrasound;
    }

    public int getCavityCheck() {
        return cavityCheck;
    }

    public void setCavityCheck(int cavityCheck) {
        this.cavityCheck = cavityCheck;
    }

    public int getCysticFibrosis() {
        return cysticFibrosis;
    }

    public void setCysticFibrosis(int cysticFibrosis) {
        this.cysticFibrosis = cysticFibrosis;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

   

    public Employee getDonor() {
        return donor;
    }

    public void setDonor(Employee donor) {
        this.donor = donor;
    }

 
    
     @Override
    public String toString(){
        return donor.getName();
    }
    
    
}
