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
public class Projector extends Product{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String resolution;
    private boolean hasLCD;
    private boolean hasLaser;

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public boolean isHasLCD() {
        return hasLCD;
    }

    public void setHasLCD(boolean hasLCD) {
        this.hasLCD = hasLCD;
    }

    public boolean isHasLaser() {
        return hasLaser;
    }

    public void setHasLaser(boolean hasLaser) {
        this.hasLaser = hasLaser;
    }
    
    
}
