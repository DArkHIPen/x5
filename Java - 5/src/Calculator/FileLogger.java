package Calculator;

public class FileLogger extends Logger {
    @Override
    public Input log(String message) {
        return new File();
    }
}