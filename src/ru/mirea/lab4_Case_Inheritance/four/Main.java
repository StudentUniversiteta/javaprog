package ru.mirea.lab4_Case_Inheritance.four;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7", 3.8);
        Memory memory = new Memory("DDR4", 16);
        Monitor monitor = new Monitor("1920x1080");

        Computer computer = new Computer(Brand.APPLE, processor, memory, monitor);

        System.out.println("Brand: " + computer.getBrand());
        System.out.println("Processor: " + computer.getProcessor().getModel()
                + ", " + computer.getProcessor().getSpeed() + " GHz");
        System.out.println("Memory: "
                + computer.getMemory().getType() + ", "
                + computer.getMemory().getSize() + " GB");
        System.out.println("Monitor: " + computer.getMonitor().getResolution());
    }
}