/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameTextBasedRpg;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class PlayerBermain {
    public static void main(String[] args) {
        
    int length;
    
    //Try Catch
    try {
        Scanner scan = new Scanner(System.in);
        //array
        PlayerStatus[] player = new PlayerStatus[1];
        
        System.out.print("Masukkan Nama Player : ");
        String name = scan.nextLine();
        System.out.print("====== JOB ====== \n= 1.Warrior \n= 2.Tanker \n= 3.Healer \n");
        System.out.print("Pilih No Job         : ");
        String job = scan.nextLine();
        System.out.print("==== WEAPON ===== \n= 1.Sword \n= 2.Shield \n= 3.Staff \n");
        System.out.print("Pilih Senjata        : ");
        String weapon = scan.nextLine();
        System.out.print("Berapa Item yang ingin anda bawa : ");
        length = scan.nextInt();
     
        //Array
        String[] item = new String[length];
        
        //Perulangan
        for(int counter =0; counter < length; counter++){
            System.out.println("Masukkan Nama Item "+(counter+1));
            item[counter] = scan.next();
        }
        
        player[0] = new PlayerStatus(name,job,weapon);
        
        System.out.println("");
        System.out.println("===================");
        System.out.println("=======Player======");
        System.out.println(player[0].Status());
        System.out.println("=====Inventory=====");
        for(int counter =0; counter < length; counter++){
            System.out.println("=    "+item[counter]);
        }
    //Try Catch
    } catch (InputMismatchException e) {
        System.out.println("Pakai ANGKA Bukan Huruf : "+e.getMessage());
    }
      }
    }
