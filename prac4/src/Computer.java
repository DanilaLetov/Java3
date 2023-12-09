public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private ComputerType brand;

    public Computer(Processor processor, Memory memory, Monitor monitor, ComputerType brand) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.brand = brand;
    }

    public void turnOn() {
        System.out.println("Computer is turning on");
    }

    public void turnOff() {
        System.out.println("Computer is turning off");
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }
    public ComputerType getType(){
        return brand;
    }
}

