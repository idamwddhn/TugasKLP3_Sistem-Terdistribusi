/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    
     public static void main(String[] args) {
        try {
            // Menghubungkan ke registry RMI
            Registry registry = LocateRegistry.getRegistry("172.125.1.173", 1099);

            // Mendapatkan stub remote
            RemoteInterface stub = (RemoteInterface) registry.lookup("RemoteHello");

            // Memanggil metode remote
            String response = stub.sayHello("Alice");
            System.out.println("Response from server: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
