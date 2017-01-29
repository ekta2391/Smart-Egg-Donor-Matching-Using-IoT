/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;


public class Ecosystem extends Organization {
private static Ecosystem business;
private ArrayList<Network> networkList;

public static Ecosystem getInstance(){
    if(business==null)
    {
        business=new Ecosystem();
        
    }
    return business;
}

private Ecosystem(){
    super(null);
    networkList=new ArrayList<>();
}

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

public Network createAndAddNetwork(){ //creating a new network and adding it to the networklist.
    Network network=new Network();
    networkList.add(network);
    return network;
}
  @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    
    
    
    
}
