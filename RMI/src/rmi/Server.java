/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    
    public static void main(String[] args) {
        try{
            
            System.setProperty("java.rmi.server.hostname", "localhost");
            
            RemoteImplementation implementation = new RemoteImplementation();
            
            Registry registy = LocateRegistry.createRegistry(1099);
            
            registy.rebind("RemoteHello", implementation);
            
            System.out.println("RMI Server is Running");
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
