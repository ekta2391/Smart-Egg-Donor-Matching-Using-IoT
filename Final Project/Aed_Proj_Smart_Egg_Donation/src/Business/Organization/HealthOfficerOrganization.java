/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HealthOfficerRole;
import Business.Role.Role;
import java.util.ArrayList;


public class HealthOfficerOrganization extends Organization {

    public HealthOfficerOrganization() {
        super(Type.HealthOfiicer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles=new ArrayList<>();
    roles.add(new HealthOfficerRole());
    return roles;
    
    }
    
}
