/*
 * A program to demonstrate getters and setters.
 */

public class Cessna152 {

    private int airSpeed, altitude;

    public Cessna152(int asp, int alt) {
        airSpeed = asp;
        altitude = alt;

        System.out.println("Airspeed: " + airSpeed);
        System.out.println("Altitude: " + altitude);
    }

    public int getAirSpeed() {
        return airSpeed;
    }

    public void setAirSpeed(int airSpeed) {
        this.airSpeed = airSpeed;
        System.out.println("-> Airspeed increased to " + this.airSpeed + " knots.");
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
        System.out.println("-> Altitude increased to " + this.altitude + " feet.");
    }
}

class Start {

    public static void main(String[] args) {

        Cessna152 c152 = new Cessna152(0, 0);

        c152.setAirSpeed(120);
        c152.setAltitude(12000);

        int speed = c152.getAirSpeed();
        int alt = c152.getAltitude();

        System.out.println(":: Cessna 152 cruising at " + speed + " at " + alt + " feet.");

    }
}

