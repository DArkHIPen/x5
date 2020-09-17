package Computer;

public class FacadePC {
    CPU cpu = new CPU();
    RAM ram = new RAM();
    GC gc = new GC();
    HDD hdd = new HDD();
    Monitor monitor = new Monitor();

    public void createPC() {
        cpu.output();
        ram.output();
        gc.output();
        hdd.output();
        monitor.output();
    }
}