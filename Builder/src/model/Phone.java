package model;

public class Phone {
    private String os;
    private String processor;
    private double ScreenSize;
    private int battery;
    private int camera;

    public Phone(String os, String processor, double screenSize, int battery, int camera) {
        super();
        this.os = os;
        this.processor = processor;
        ScreenSize = screenSize;
        this.battery = battery;
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" + "os='" + os + '\'' + ", processor='" + processor + '\'' + ", ScreenSize=" + ScreenSize
                + ", battery=" + battery + ", camera=" + camera + '}';
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(double screenSize) {
        ScreenSize = screenSize;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

}
