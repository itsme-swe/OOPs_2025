package Interfaces.Example2;

public class SmartPhone extends Phone implements ICamera, IMusicPlayer{

    @Override
    public void videoCall() {
        System.out.println("Smartphone can make video call");
    }

    @Override
    public void click() {
        System.out.println("Smartphone can click photo");
    }

    @Override
    public void record() {
        System.out.println("Smartphone can record videos");
    }

    @Override
    public void play() {
        System.out.println("Smartphone can play music");
    }

    @Override
    public void stop() {
        System.out.println("Smartphone can stop music");
    }
}
