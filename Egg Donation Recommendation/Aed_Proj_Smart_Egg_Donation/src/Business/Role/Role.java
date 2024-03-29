/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;


public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        Nurse("Nurse"),
        Donor("Donor"),
        Recepient("Recepient");
        
        
        private String value;
        private RoleType(String value){
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
        
        public abstract JPanel createWorkArea(JPanel userProcessContainer,
                UserAccount useraccount,
                Organization organization,
                Enterprise enterprise,
                Ecosystem business);
        
        
       @Override
        public String toString() {
            return this.getClass().getSimpleName();
        } 
        
        
        
        
    }
    

