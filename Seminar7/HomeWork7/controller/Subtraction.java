package Seminar7.HomeWork7.controller;

public class Subtraction extends Operation implements SubtractionOperation {

    @Override
    public double substruct(Number digit1, Number digit2) {
        super.result = Double.parseDouble(digit1.toString()) - Double.parseDouble(digit2.toString());
        return result;
    }
    
}
