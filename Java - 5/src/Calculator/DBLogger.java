package Calculator;

public class DBLogger extends Logger {
    @Override
    public Input log(String message) {
        return new DataBase();
    }
}