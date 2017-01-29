/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Employee.SysAdmin;

import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;


public class ConfigureASystem {
    public static Ecosystem configure(){
        
        Ecosystem system=Ecosystem.getInstance();
        
       SysAdmin sysAdmin = new SysAdmin();
       sysAdmin.setName("SysAdmin");
       system.getEmployeeDirectory().createEmployee(sysAdmin);
        
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", sysAdmin, new SystemAdminRole());
       return system; 
    }
    
}
