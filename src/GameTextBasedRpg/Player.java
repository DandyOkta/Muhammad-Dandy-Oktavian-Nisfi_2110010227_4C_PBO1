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
    protected Integer exp;
    
    //Konstruktor
    public Player(String name, String job, String weapon, Integer exp) {
        this.name = name;
        this.job = job;
        this.weapon = weapon;
        this.exp = exp;
    }

    void setMengalahkan(int slime) {
        exp = exp + slime;
    }
    
    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
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
         
    public String Status(){
        return "Nama : "+getName();
    }

    //Polymerphism Overloading
    public String Status(int level){
        return Status() + "\nLevel :"+level;
    }
    
    public String Status(int level, String gold){
        return Status() + "\nLevel :"+level + "\nGold :"+gold;
    }
    
    public String Status(int level, String gold, String pet){
        return Status() + "\nLevel :"+level + "\nGold :"+gold  + "\nPet :"+pet;
    }
}
