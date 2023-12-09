public class ComputerDescription {
    public static void computer() {
        Processor processor = new Processor("Intel");
        Memory memory = new Memory(8);
        Monitor monitor = new Monitor("Samsung");

        Computer computer = new Computer(processor, memory, monitor, ComputerType.MSI);
        computer.turnOn();

        System.out.println("Processor brand: " + computer.getProcessor().getBrand());
        System.out.println("Memory capacity: " + computer.getMemory().getCapacity() + "GB");
        System.out.println("Monitor brand: " + computer.getMonitor().getBrand());
        System.out.println("Computer type: " + computer.getType());

        computer.turnOff();
    }
}
