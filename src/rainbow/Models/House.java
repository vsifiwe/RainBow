/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainbow.Models;

/**
 *
 * @author TOSHIBA
 */
public class House {
    
    private int HouseId;
    private String location;
    private int OwnerId;
    private int numberofRooms;
    private int RentAmount;

    public int getHouseId() {
        return HouseId;
    }

    public void setHouseId(int HouseId) {
        this.HouseId = HouseId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(int OwnerId) {
        this.OwnerId = OwnerId;
    }

    public int getNumberofRooms() {
        return numberofRooms;
    }

    public void setNumberofRooms(int numberofRooms) {
        this.numberofRooms = numberofRooms;
    }

    public int getRentAmount() {
        return RentAmount;
    }

    public void setRentAmount(int RentAmount) {
        this.RentAmount = RentAmount;
    }
    
}
