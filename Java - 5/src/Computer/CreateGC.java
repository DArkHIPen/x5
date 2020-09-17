package Computer;

public class CreateGC implements FactoryComponents {
    @Override
    public ComponentsPC createComponent() {
        return new GC();
    }
}