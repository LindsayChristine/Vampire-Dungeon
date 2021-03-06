/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author linzi
 */
public class Location {
    private int x;
    private int y;

    
    public Location(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;      
    }
    
    public int getY(){
        return this.y;
    }
    
    public void newX(int x){
        this.x = x;
    }
    
    public void newY(int y){
        this.y = y;
    }
    
    @Override
    public String toString(){
        return this.x + " " + this.y;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.x;
        hash = 83 * hash + this.y;
        return hash;
    }

}
