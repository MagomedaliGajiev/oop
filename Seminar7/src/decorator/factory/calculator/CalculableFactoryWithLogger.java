package decorator.factory.calculator;

import decorator.factory.calculator.log.ConsoleLogger;

public class CalculableFactoryWithLogger implements ICalculableFactory{

    @Override
    public Calculable create(int primaryArg) {
        return new CalculableDecorator(new Calculator(primaryArg), new ConsoleLogger());
    }
    
}
