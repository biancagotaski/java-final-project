package com.mycompany.aulaspring2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Bianca
 */
@Entity
public class Printer extends Product{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean isLaser;
    private int maxLeaf;
    private boolean hasWifi;
//
    public boolean isIsLaser() {
        return isLaser;
    }

    public void setIsLaser(boolean isLaser) {
        this.isLaser = isLaser;
    }

    public int getMaxLeaf() {
        return maxLeaf;
    }

    public void setMaxLeaf(int maxLeaf) {
        this.maxLeaf = maxLeaf;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
}
