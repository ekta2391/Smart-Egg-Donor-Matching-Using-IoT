/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Test;


public class BloodTest extends Test {
    
    private boolean antispermAntibodies;
    private int completeBloodCount;
    private String bloodGroup;
    private int hemoglobinElectrophoresis;
    
    public BloodTest(){
        
    }

    public boolean isAntispermAntibodies() {
        return antispermAntibodies;
    }

    public void setAntispermAntibodies(boolean antispermAntibodies) {
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
    
}
