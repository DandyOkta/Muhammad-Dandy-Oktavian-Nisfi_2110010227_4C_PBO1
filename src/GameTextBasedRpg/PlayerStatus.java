/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameTextBasedRpg;

//Inheritance
public class PlayerStatus extends Player {
    public PlayerStatus(String name, String job, String weapon, Integer exp) {
        super(name, job, weapon, exp);
    }
    
     public String getPilihan(){
        //Seleksi Percabangan If dengan Operator OR
        String noJob = getJob();
        if(noJob.equals("1") || noJob.equals("Warrior")) {
            return "Warrior";
        } else if(noJob.equals("2") || noJob.equals("Tanker")) {
            return "Tanker";
        } else if(noJob.equals("3") || noJob.equals("Healer")) {
            return "Healer";
        } else {
            return "Default Job";
        }
    }
    
    public String getStat(){
        //Seleksi switch Case dengan dua Seleksi kemungkinan
        String namaJob = getJob();
        switch(namaJob){
            case "1":
            case "Warrior":
                return "\nHP : 1000 \nAtt : 300 \nDef : 100 \nMagic : 10";
            case "2":
            case "Tanker":
                return "\nHP : 3000 \nAtt : 100 \nDef : 300 \nMagic : 0";
            case "3":
            case "Healer":
                return "\nHP : 2000 \nAtt : 150 \nDef : 50 \nMagic : 150";
            default:
                return "\nnama Job Lain";
        }
    }
    
     public String getBonus(){
        //Seleksi Percabangan IF menggunakan operator AND dan OR dengan membandingakn Dua data inputan 
        String noJob = getJob();
        String Bonus = getWeapon();
        if(Bonus.equals("1") && noJob.equals("1") || Bonus.equals("Sword") && noJob.equals("Warrior")) {
            return "\nMendapatkan Skill Rage";
        } else if(Bonus.equals("2") && noJob.equals("2") || Bonus.equals("Shield") && noJob.equals("Tanker")) {
            return "\nMendapatkan Skill Taunt";
        } else if(Bonus.equals("3") && noJob.equals("3") || Bonus.equals("Staff") && noJob.equals("Healer")) {
            return "\nMendapatkan Skill Ether Cannon";
        } else {
            return "\nTidak ada Bonus";
        }
    }
     
     public String getEquip(){
        String infoEquip = getWeapon();
        //Seleksi Switch Case dengan dua Seleksi kemungkinan
        switch(infoEquip){
            case "1":
            case "Sword":
                return "\nWeapon : Sword \nArmor : plate armor \nleg : iron leg \nboot : cooper boot";
            case "2":
            case "Shield":
                return "\nWeapon : Shield \nArmor : iron armor \nleg : iron leg \nboot : iron boot";
            case "3" :
            case "Staff":
                return "\nWeapon Staff \nArmor : magic robe \nleg : - \nboot : wizard boot";
            default:
                return "\nTidak ada Equipment";
        }
    }
     
    public String getPengalaman(){
        Integer infoExp = getExp();
        //Seleksi Switch Case dengan dua Seleksi kemungkinan
        switch(infoExp){
            case 1000 :
                return "\nAnda Naik Ke Level 1";
            case 2000:
                return "\nAnda Naik Ke Level 2";
            case 3000 :
                return "\nAnda Naik Ke Level 3";
            default:
                return "\nLevel Tidak Naik";
        }
    }
     
    //Polymorphis Override
    @Override
    public String Status(){
        return super.Status()+"\nJob  : "+getPilihan()+"\n=======Stat======="+getStat()+"\n=======Info======="+getPengalaman()+"\n=====Equipment====="+getEquip()+"\n=====Bonus====="+getBonus();
    }
    
    }
    
    