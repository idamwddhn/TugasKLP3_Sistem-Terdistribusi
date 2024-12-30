/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import model.Pakaian;


public interface RemoteInterface extends Remote{
    
    String sayHello(String name) throws RemoteException;


    List<Pakaian> getPakaian() throws RemoteException;

    void menu() throws RemoteException;

    void viewAllPakaian() throws RemoteException;

    double potonganHarga(double total) throws RemoteException;
    
}
