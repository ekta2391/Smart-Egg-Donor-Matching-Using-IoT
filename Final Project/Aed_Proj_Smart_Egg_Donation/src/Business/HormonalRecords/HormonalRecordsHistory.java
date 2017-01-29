/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HormonalRecords;

import java.util.ArrayList;
import java.util.List;


public class HormonalRecordsHistory {
    
    private ArrayList<HormonalRecords> hormonalRecordsList;
    private double avgTempIOT;
    
    public HormonalRecordsHistory(){
        hormonalRecordsList = new ArrayList<>();
    }

    public ArrayList<HormonalRecords> getHormonalRecordsList() {
        return hormonalRecordsList;
    }

    public void setHormonalRecordsList(ArrayList<HormonalRecords> hormonalRecordsList) {
        this.hormonalRecordsList = hormonalRecordsList;
    }
    
    
    public HormonalRecords addHormonalRecords(){
        HormonalRecords hr = new HormonalRecords();
        hormonalRecordsList.add(hr);
        return hr;
    }
    
    public double calculateAvgIOT(){
    double var=0; 
    for(int i=0;i<hormonalRecordsList.size();i++)
    {
        
      var=var+hormonalRecordsList.get(i).getTempDropIOT();
   
    }
    
    double avg=var/hormonalRecordsList.size();
    avgTempIOT = avg;
       System.err.println(avgTempIOT);
    return avgTempIOT;
     
    }

    public double getAvgTempIOT() {
        return avgTempIOT;
    }

    public void setAvgTempIOT(double avgTempIOT) {
        this.avgTempIOT = avgTempIOT;
    }
  
}
