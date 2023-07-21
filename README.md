# Proyek Akhir Pemrograman Berbasis Objek 1
Proyek ini adalah Contoh Sederhana dari game TextBasedRpg menggunakan java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1 

## Deskripsi
Aplikasi ini menerima input berupa nama, job, senjata dan item, dan memberikan output berupa informasi Status dari job yang user pilih seperti Stat player, Equipment Player, Bonus Senjata Player dan Inventaris dari player, 
Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

1. --- Class --- adalah template atau blueprint dari object. Pada kode ini, `Player`, `PlayerStatus`, dan `Player Bermain` adalah contoh dari class.
   
         public class Player {
         .......
         }

         public class PlayerStatus extends Player {
         .......
         }

         public class PlayerBermain {
         .......
         }

2. --- Object --- adalah instance dari class. Pada kode ini, `player[0] = new PlayerStatus(name,job,weapon);` adalah contoh pembuatan object.

           player[0] = new PlayerStatus(name,job,weapon);

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `name`, `job` dan `Weapon` adalah contoh atribut.

          private String name;
          private String job;
          private String weapon;

4. --- Constructor --- adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Player` dan `PlayerStatus`.

         public Player(String name, String job, String weapon) {
              this.name = name;
              this.job = job;
              this.weapon = weapon;
         }

         public PlayerStatus(String name, String job, String weapon) {
              super(name, job, weapon);
         }

5. --- Mutator/Setter --- atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setName`, `setJob` dan `setWeapon` adalah contoh method mutator.

          public void setName(String name) {
              this.name = name;
          }
      
          public void setJob(String job) {
              this.job = job;
          }
      
          public void setWeapon(String weapon) {
              this.weapon = weapon;
          }

6. --- Accessor/Getter --- atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getName`, `getJob`, `getWeapon`, `getPilihan`, `getStat`, `getBonus` dan `getEquip` adalah contoh method accessor.

          public String getName() {
              return name;
          }
      
          public String getJob() {
              return job;
          }
      
          public String getWeapon() {
              return weapon;
          }
      
          public String getPilihan(){
          ........
          }
      
          public String getStat(){
          ........
          }
      
          public String getBonus(){
          ........
          }
      
          public String getEquip(){
          ........
          }

7. --- Encapsulation --- adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `name`, `Job` dan `weapon` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

         private String name;
         private String job;
         private String weapon; 

9. --- Inheritance --- adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PlayerStatus` mewarisi `Player` dengan sintaks `extends`.
   
         public class PlayerStatus extends Player {
         ......
         }

10. -- Polymorphism -- adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `Status(String)` di `Player` merupakan overloading method `Status` dan `displayInfo` di `PlayerStatus` merupakan override dari method `Status` di `Player`.

          public String Status(){
              return "Nama : "+getName();
          }
      
          public String Status(String level){
              return Status() + "\nLevel :"+level;
          }
      
          @Override
          public String Status(){
              return super.Status()+"\nJob  : "+getPilihan()+"\n=======Stat======="+getStat()+"\n=====Equipment====="+getEquip()+"\n=====Bonus====="+getBonus();
          }

11. --- Seleksi --- adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dengan operator `OR` dalam method `getPilihan`, seleksi `switch` dengan 2 kemugkinan dalam method `getStat`, seleksi `if else` dengan operator `OR(||)` `AND(&&)` dalam method `getBonus`, dan seleksi `switch` dengan 2 kemugkinan dalam method `getEquip`.

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
                     return "Default Job ";
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

11. --- Perulangan --- adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

         for(int counter =0; counter < length; counter++){
                     System.out.println("Masukkan Nama Item "+(counter+1));
                     item[counter] = scan.next();
                 }

12. -- Input Output Sederhana -- digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

         Scanner scan = new Scanner(System.in);
         
         System.out.print("Masukkan Nama Player : ");
         String name = scan.nextLine();
         System.out.print("Pilih No Job         : ");
         String job = scan.nextLine();
         System.out.print("Pilih Senjata        : ");
         String weapon = scan.nextLine();
         System.out.print("Berapa Item yang ingin anda bawa : ");
         length = scan.nextInt();

13. --- Array --- adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PlayerStatus[] player = new PlayerStatus[1];` dan `String[] item = new String[length];` adalah contoh penggunaan array.

          PlayerStatus[] player = new PlayerStatus[1];
      
          player[0] = new PlayerStatus(name,job,weapon);

14. --- Error Handling --- digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

           try {
          
           } catch (InputMismatchException e) {
              System.out.println("Pakai ANGKA Bukan Huruf : "+e.getMessage());
           }
    
## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Dandy Oktavian Nisfi
NPM: 2110010227

    
