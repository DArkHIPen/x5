package Computer;

public class CreateRAM implements FactoryComponents {
    @Override
    public ComponentsPC createComponent() {
        return new RAM();
    }
}