package builder.item;

public class Characteristic {
    private String brand;
    private String color;
    private String ram;
    private String cpu;
    private String os;
    private String weight;
    private String memory;
    private String memoryType;
    private String battery;
    private String body;
    private String wheel;

    private Characteristic(Builder builder) {
        this.brand = builder.brand;
        this.color = builder.color;
        this.ram = builder.ram;
        this.cpu = builder.cpu;
        this.os = builder.os;
    }

    // public Characteristic() {
    // }

    // public Characteristic(String brand, String color, String ram, String cpu,
    // String os, String weight, String memory,
    // String memoryType, String battery, String body, String wheel) {
    // this.brand = brand;
    // this.color = color;
    // this.ram = ram;
    // this.cpu = cpu;
    // this.os = os;
    // this.weight = weight;
    // this.memory = memory;
    // this.memoryType = memoryType;
    // this.battery = battery;
    // this.body = body;
    // this.wheel = wheel;
    // }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String brand;
        private String color;
        private String ram;
        private String cpu;
        private String os;
        private String weight;
        private String memory;
        private String memoryType;
        private String battery;
        private String body;
        private String wheel;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder os(String os) {
            this.os = os;
            return this;
        }

        public Characteristic build() {
            return new Characteristic(this);
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getRam() {
        return ram;
    }

    // public String getCpu() {
    // return cpu;
    // }

    // public String getOs() {
    // return os;
    // }

    // public String getWeight() {
    // return weight;
    // }

    // public String getMemory() {
    // return memory;
    // }

    // public String getMemoryType() {
    // return memoryType;
    // }

    // public String getBattery() {
    // return battery;
    // }

    // public String getBody() {
    // return body;
    // }

    // public String getWheel() {
    // return wheel;
    // }
}
