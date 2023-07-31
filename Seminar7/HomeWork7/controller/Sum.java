package Seminar7.HomeWork7.controller;

public class Sum extends Operation implements SumOperation {

    @Override
    public double sum(Number digit1, Number digit2) {
        super.result = Double.parseDouble(digit1.toString()) + Double.parseDouble(digit2.toString());
        return result;
    }
    
}
