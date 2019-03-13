package com.adumas.exercicecours1;

public class CompareNumber {

    private int number1;
    private int number2;

    public enum compareState{BIGGER1,BIGGER2,EQUAL};

    public CompareNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public compareState getCompareResult(){
        if (number1 > number2){
            return compareState.BIGGER1;
        }
        else if (number2 > number1){
            return compareState.BIGGER2;
        }
        else{
            return compareState.EQUAL;
        }
    }
}
