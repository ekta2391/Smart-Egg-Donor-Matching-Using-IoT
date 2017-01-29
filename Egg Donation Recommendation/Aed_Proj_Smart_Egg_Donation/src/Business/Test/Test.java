/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Test;

import java.util.Date;

/**
 *
 * @author Pranjal
 */
public abstract class Test {
    private Date testDate;
    
    public Test(){
        
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }
    
    
    
}
