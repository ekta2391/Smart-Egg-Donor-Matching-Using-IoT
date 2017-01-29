/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalRecords;

import java.util.ArrayList;


public class MedicalRecordsDirectory {
    
    private ArrayList<MedicalRecords> medicalRecordsList;
    
    public MedicalRecordsDirectory(){
        medicalRecordsList = new ArrayList<>();
    }

    public ArrayList<MedicalRecords> getMedicalRecordsList() {
        return medicalRecordsList;
    }

    public void setMedicalRecordsList(ArrayList<MedicalRecords> medicalRecordsList) {
        this.medicalRecordsList = medicalRecordsList;
    }
    
    public MedicalRecords addMedicalRecord(){
        MedicalRecords medicalRecords = new MedicalRecords();
        medicalRecordsList.add(medicalRecords);
        return medicalRecords;
    }
    
    
    
}
