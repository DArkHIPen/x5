package Computer;

public class CreateHDD implements FactoryComponents {
    @Override
    public ComponentsPC createComponent() {
        return new HDD();
    }
}