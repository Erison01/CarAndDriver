package com.caranddriver;

public class Driver extends Car{

    public Driver(int gas) {
        super(gas);
    }

    public void drive(){
        if(gas>0){
         decGas(1);
        System.out.println("Driving ");
         statusOfGas();
    }else {
            System.out.println("Out of gas");
        }}

    public void boost(){
            if(gas>3){
        decGas(3);
        System.out.println("Boost ");
        statusOfGas();
    }else {
                System.out.println("out of gas");
            }}

    public void refuel(){
        if (gas<=8){
        incGas(2);
        System.out.println("Refueling ");
        statusOfGas();
    }else {
            System.out.println("Can't refuel");
        }}

}
