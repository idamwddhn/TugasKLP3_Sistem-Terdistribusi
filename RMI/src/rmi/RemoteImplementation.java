/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Scanner;

import model.Pakaian;
import model.PakaianService;

import java.rmi.RemoteException;

public class RemoteImplementation extends UnicastRemoteObject implements RemoteInterface{

    Scanner scanner  = new Scanner(System.in);
    PakaianService pakaianService = new PakaianService();
    
    protected RemoteImplementation() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String name) throws RemoteException {

        System.out.print("Masukkan Nama");
        name = scanner.nextLine();

        return "Hello " + name ;
    }

    @Override
    public List<Pakaian> getPakaian() throws RemoteException {
        return pakaianService.getAllPakaian();
    }

    @Override
    public void menu() throws RemoteException {
        pakaianService.menu();
    }

    @Override
    public void viewAllPakaian() throws RemoteException {
        pakaianService.viewAllPakaian();
    }

    @Override
    public double potonganHarga(double total) throws RemoteException {
        if (total >= 150000){
            return total * 0.30;
        }
        return total;
    }
}
