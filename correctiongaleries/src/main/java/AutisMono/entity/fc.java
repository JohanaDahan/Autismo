/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

package AutisMono.entity;

import static java.lang.Thread.sleep;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johan
 */
public class fc {

    public ArrayList<fc> listfc;
   
     private  fc [] tabfc = new fc[100];
     private int myFc;
     private LocalDateTime myDate;
     

 
    public fc(int myFc, LocalDateTime myDate) {
        this.myFc = myFc;
        this.myDate = myDate;
    }
 
 
    public void simulFc (){ 
      
        
             try {
                for (int i = 0; i <= 100; i++) {                 
               tabfc=listfc.add((170*Math.random()+50));
               System.out.println((int) (170*Math.random()+50)); 
               Thread.sleep(1000);
                }
            } catch (InterruptedException ex) {
           
            }
         
                     
         
    }
         
    
    @Override       
    public String toString() {
        return "fc{" + "myFc=" + myFc + ", myDate=" + myDate + ", myDuration=" +'}';
    }
    
}

    