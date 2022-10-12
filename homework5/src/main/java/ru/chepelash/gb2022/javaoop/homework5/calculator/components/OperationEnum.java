package ru.chepelash.gb2022.javaoop.homework5.calculator.components;

public enum OperationEnum {
    SUM("+"),
    DIFF("-"),
    MULTIPLY("*"),
    DIVISION("/");
    public final String label;
    OperationEnum(String label){
        this.label = label;
    }
    static OperationEnum convertFromString(String operation){
        switch (operation){
            case "+":
                return SUM;
            case "-":
                return DIFF;
            case "*":
                return MULTIPLY;
            case "/":
                return DIVISION;
            default:
                throw new IllegalArgumentException("Unknown operation");
        }
    }
}
