/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import model.Pakaian;

public interface RemoteInterface extends Remote {

    List<Pakaian> getPakaian() throws RemoteException;

    double potonganHarga(double total) throws RemoteException;
    
}
