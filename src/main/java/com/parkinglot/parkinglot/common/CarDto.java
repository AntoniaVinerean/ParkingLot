package com.parkinglot.parkinglot.common;

public class CarDto {

Long id;
String licensePlate;
String parkingSpot;
String ownerName;

public CarDto(Long id, String licensePlate, String parkingSpot, String ownerName){
    this.id=id;
    this.licensePlate=licensePlate;
    this.ownerName=ownerName;
    this.parkingSpot=parkingSpot;
}

public Long getId(){
    return id;
}

public String getLicensePlate(){
    return licensePlate;
}

    public String getParkingSpot(){
        return parkingSpot;
    }

    public String getOwnerName(){
        return ownerName;
    }
}
