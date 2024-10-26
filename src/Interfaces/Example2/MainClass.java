package Interfaces.Example2;

public class MainClass {
    public static void main(String[] args) {

        // Object of Smartphone class
        SmartPhone sp = new SmartPhone();

        sp.videoCall(); // unique method of smartphone class
        sp.click(); // method of interface ICamera
        sp.play();  // method of interface IMusic

        System.out.println();

        // Object of Phone Class
        Phone ph = new SmartPhone();

        ph.call();
        ph.sms();
        ph.videoCall(); // Phone Class ref. calling SmartPhone method

        System.out.println();

        // Ref. of interface ICamera and object of SmartPhone class
        ICamera ic = new SmartPhone();

        ic.click();
        ic.record();

        System.out.println();

        // Ref. of interface IMusic Player and object of SmartPhone class
        IMusicPlayer iMP = new SmartPhone();

        iMP.play();
        iMP.stop();
    }
}
