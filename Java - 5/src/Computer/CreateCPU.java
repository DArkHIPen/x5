package Computer;

public class CreateCPU implements FactoryComponents {
    @Override
    public ComponentsPC createComponent() {
        return new CPU();
    }
}