/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;


public class Donor extends Patient {
   private int donorID;
   private static int count=0;
   
   public Donor(){
       donorID=count;
       count++;
   }

    public int getDonorID() {
        return donorID;
    }

    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }
   
   
}
