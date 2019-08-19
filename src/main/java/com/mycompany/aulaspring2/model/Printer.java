package com.mycompany.aulaspring2.model;

/**
 *
 * @author Bianca
 */
public class Printer extends Product{
    private boolean isLaser;
    private int maxLeaf;
    private boolean hasWifi;

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
    
    
}
