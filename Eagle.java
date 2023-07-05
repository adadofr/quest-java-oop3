public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;
    private String land;

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
        this.land = "ground";
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println((getName() + " takes off in the sky."));
    }

    @Override
    public void ascend(int upward) {
        System.out.println(getName() + " flies upward, altitude: " + upward);
    }

    @Override
    public void glide() {
        System.out.println("glides into the air.");
    }

    @Override
    public void descend(int downwardMin) {
        System.out.println(getName() + " flies downward, altitude: " + downwardMin);
    }

    @Override
    public void land() {
        if (altitude > 0)
            System.out.println(getName() + " is too high, it can't land.");
        else
            System.out.println(getName() + " can land.");
    }
}
