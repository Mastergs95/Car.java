package com.skillsoft.classesandobjects;

public class Car {

    public String name;
    public String type;
    public float mpg;
    public int price;

    public Car() {
        System.out.println("Default no-argument constructor: " + this);
    }

    public Car(String name){
        System.out.println("Car (String carName) " + this);

        this.name=name;
    }

    public Car(String name,String type){
        this(name);

        System.out.println("Car (String carName, String carType) " + this);


        this.type=type;
    }

    public Car(String name,String type,float mpg){
        this(name,type);

        System.out.println("Car (String carName, String carType, float carMpg) " + this);

        this.mpg=mpg;
    }

    public Car(String name, String type, float mpg, int price){
        this(name,type,mpg);

        System.out.println("Car (String carName, String carType, float carMpg, int carPrice) " + this);

        this.price=price;
    }



    public void printCarInfo(){
        System.out.format("Name: %s, Type: %s, MPG: %.1f, Price: %d\n",
                name,type,mpg,price);

    }


}
