/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.DonorRole.DonorWorkAreaJPanel;
import javax.swing.JPanel;


public class DonorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, Organization organization, Enterprise enterprise, Ecosystem business) {
    return new DonorWorkAreaJPanel(userProcessContainer, useraccount, (DonorOrganization)organization, enterprise);
    }
    
}
