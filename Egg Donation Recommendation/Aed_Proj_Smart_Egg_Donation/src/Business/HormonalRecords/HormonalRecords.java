/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HormonalRecords;

import java.util.Date;
import java.util.Random;


public class HormonalRecords {
 
private double leutinizingHormoneLevels;
private double follicleStimulatingHormoneLevels;
private double hCGLevels;
private double tempDropIOT;
private Date recordedOn;

    public Date getRecordedOn() {
        return recordedOn;
    }

    public void setRecordedOn(Date recordedOn) {
        this.recordedOn = recordedOn;
    }

    public double getLeutinizingHormoneLevels() {
        return leutinizingHormoneLevels;
    }

    public void setLeutinizingHormoneLevels(double leutinizingHormoneLevels) {
        this.leutinizingHormoneLevels = leutinizingHormoneLevels;
    }

    public double getFollicleStimulatingHormoneLevels() {
        return follicleStimulatingHormoneLevels;
    }

    public void setFollicleStimulatingHormoneLevels(double follicleStimulatingHormoneLevels) {
        this.follicleStimulatingHormoneLevels = follicleStimulatingHormoneLevels;
    }

    public double gethCGLevels() {
        return hCGLevels;
    }

    public void sethCGLevels(double hCGLevels) {
        this.hCGLevels = hCGLevels;
    }

  
    public double getTempDropIOT() {
        return tempDropIOT;
    }

    public void setTempDropIOT(double tempDropIOT) {
        this.tempDropIOT = tempDropIOT;
    }

public double generateRecordedTemperature(){
     Random random = new Random();
double value = 97.00 + (99.00 - 97.00) * random.nextDouble();
System.out.println(value);

tempDropIOT = value;
return tempDropIOT;

}

 @Override
    public String toString(){
        return String.valueOf(recordedOn);
    }

}
