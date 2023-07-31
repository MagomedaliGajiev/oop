package decorator.factory.calculator;

import decorator.factory.calculator.log.Logger;

public class CalculableDecorator implements Calculable {

    private Calculable calculator;
    private Logger logger;

    public CalculableDecorator(Calculable calculator, Logger logger) {
        this.calculator = calculator;
        this.logger = logger;

    }

    @Override
    public Calculable sum(int arg) {
        logger.log(String.format("Summarize %s with %s", arg, calculator.getResult()));
        Calculable result = calculator.sum(arg);
        logger.log(String.format("Result: %d", result.getResult()));
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        logger.log(String.format("Multiply %s на %s", arg, calculator.getResult()));
        Calculable result = calculator.multi(arg);
        logger.log(String.format("Result: %d", result.getResult()));
        return this;
    }

    @Override
    public int getResult() {
        return calculator.getResult();
    }

    
}