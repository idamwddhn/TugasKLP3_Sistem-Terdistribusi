/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import rmi.RemoteInterface;
import model.Pakaian;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;

public class PakaianService {

    List<Pakaian> list;

    {
        list = new ArrayList<>();
    }
    private RemoteInterface stubConfig() throws RemoteException {
        try{
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            return (RemoteInterface) registry.lookup("RemoteHello");
        }catch (RemoteException exception){
            throw new RemoteException(exception.getMessage());
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Pakaian> getGetAllPakaian() {
        try{
            return this.stubConfig().getPakaian();
        }catch (RemoteException exception){
            throw new RuntimeException(exception);
        }
    }

    public double hitung(double total){
        try{
            return this.stubConfig().potonganHarga(total);
        }catch (RemoteException exception){
            throw new RuntimeException(exception);
        }
    }

    public void setSelected(Pakaian pakaian){
        list.add(pakaian);
    }

    public List<Pakaian> selected(){
        return list;
    }

    public void kosongkan(){
        list = new ArrayList<>();
    }
}
