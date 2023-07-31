package decorator.factory.calculator.log;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger{
    
    @Override
    public void log(String str) {
        System.err.printf("%n%s : %s%n", LocalDateTime.now(), str);
    }
    
}
