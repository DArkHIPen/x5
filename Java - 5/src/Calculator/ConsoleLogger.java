package Calculator;

public class ConsoleLogger extends Logger {
    @Override
    public Input log(String message) {
        return new Console();
    }
}