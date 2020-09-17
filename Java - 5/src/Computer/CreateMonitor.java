package Computer;

public class CreateMonitor implements FactoryComponents {
    @Override
    public ComponentsPC createComponent() {
        return new Monitor();
    }
}