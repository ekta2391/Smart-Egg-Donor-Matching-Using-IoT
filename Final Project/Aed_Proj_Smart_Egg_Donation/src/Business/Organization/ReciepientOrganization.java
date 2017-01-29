/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ReciepientRole;
import Business.Role.Role;
import java.util.ArrayList;


public class ReciepientOrganization extends Organization{

    public ReciepientOrganization() {
        super(Type.Recepient.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
    ArrayList<Role> roles = new ArrayList<>();
    roles.add(new ReciepientRole());
    return roles;
    }
    
}
