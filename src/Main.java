public class Main {

    public static void main(String[] args) {

        TV tv1 = new TV();

        tv1.turnOn();
        tv1.setChannel(10);
        tv1.setVolume(3);

        System.out.println("Channel: " + tv1.channel);
        System.out.println("Volume: " + tv1.volumeLevel);
    }

}