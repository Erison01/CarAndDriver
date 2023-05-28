package com.caranddriver;

public class Car {
    protected int gas ;

    public Car(int gas) {
        this.gas = gas;
    }

    public void statusOfGas(){

        System.out.println("The gas status is: " +gas);
    }
    public void decGas(int fuel){
        gas -=fuel;
        if (gas<=0){
            gameOver();
        }
    }
    public void incGas(int fuel){
        gas +=fuel;
    }
    public void gameOver(){
        System.out.println("Game Over");
    }


}
