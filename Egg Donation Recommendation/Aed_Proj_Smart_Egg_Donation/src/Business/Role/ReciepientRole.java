/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ReciepientOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.ReciepientRole.ReciepientWorkAreaJPanel;
import javax.swing.JPanel;


public class ReciepientRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new ReciepientWorkAreaJPanel(userProcessContainer, useraccount, (ReciepientOrganization)organization, enterprise);
    }
    
}
