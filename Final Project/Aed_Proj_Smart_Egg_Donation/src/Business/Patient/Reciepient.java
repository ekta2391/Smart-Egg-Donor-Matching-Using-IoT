/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;


public class Reciepient extends Patient{
    
    private int reciepientID;
    private static int count=0;
    
    public Reciepient(){
        reciepientID=count;
        count++;
    }

    public int getRecepientID() {
        return reciepientID;
    }

    public void setRecepientID(int recepientID) {
        this.reciepientID = recepientID;
    }
    
}
