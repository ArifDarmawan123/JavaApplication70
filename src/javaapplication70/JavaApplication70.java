/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication70;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author ASUS
 */
public class JavaApplication70 {
public String angka;

public void setName(String newName){
    angka = newName;
}
    public String getName(){
        return angka;
        
    }
   
public static void main(String[] args) {
ExecutorService service=Executors.newFixedThreadPool(6);
for (int i = 1; i < 6; i++){
    service.submit(new NewClass(1));
    JavaApplication70 testangka=new JavaApplication70();
    testangka.setName("adalah bilangan ganjil");
    for (int angka = 1; angka <100; angka=angka+2){
        System.out.println(angka+testangka.getName());
        
    }
}
System.out.println("semua task telah disubmit");
service.shutdown();

try{
    service.awaitTermination(1, TimeUnit.DAYS);
}catch(InterruptedException e){
    e.printStackTrace();
}
System.out.println("Semua task telah selesai");

}
}
    
    

