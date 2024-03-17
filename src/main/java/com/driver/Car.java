package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        currentGear = 1;
        this.seats = seats;
    }



//    public Car(String name, boolean isManual) {
//        super(name);
//        this.isManual = isManual;
//    }

    public void changeGear(int newGear){
        currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        this.move(newSpeed,newDirection);;
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
    public void steer(int direction){
        super.steer(direction);
    }
    public void stop(){
        super.stop();
    }
    public int getWheels(){
       return wheels;
    }
    public String getType(){
        return type;
    }
    public int getDoors(){
        return doors;
    }
    public int getGears(){
        return gears;
    }
    public boolean isManual(){
        return isManual;
    }
    public int getSeats(){
        return seats;
    }
    public int getCurrentGear(){
        return currentGear;
    }
}
