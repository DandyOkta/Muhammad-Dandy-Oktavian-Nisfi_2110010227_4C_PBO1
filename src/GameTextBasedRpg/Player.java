/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameTextBasedRpg;

/**
 *
 * @author acer
 */
public class Player {
    //Atribut Dan Enkapsulasi
    private String name;
    private String job;
    private String weapon;
    
    //Konstruktor
    public Player(String name, String job, String weapon) {
        this.name = name;
        this.job = job;
        this.weapon = weapon;
    }
    
    //Getter
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getWeapon() {
        return weapon;
    }
    
    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
         
    //Polymerphism Overloading
    public String Status(){
        return "Nama : "+getName();
    }

    public String Status(String level){
        return Status() + "\nLevel :"+level;
    }
}
