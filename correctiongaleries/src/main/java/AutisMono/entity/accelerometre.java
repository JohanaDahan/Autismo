/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutisMono.entity;

import java.time.LocalDateTime;

/**
 *
 * @author johan
 */
class accelerometre {
     private int X;
     
     private int Y;
     
     private int Z;

    public accelerometre(int X, int Y, int Z) {
        this.X = X;
        this.Y = Y;
        this.Z = Z;
    }
     
    @Override  
         
    public String toString() {
        return "accelerometre{" + "X=" + X + ", Y=" + Y + ", Z=" + Z +'}';
    }
    
     
}
