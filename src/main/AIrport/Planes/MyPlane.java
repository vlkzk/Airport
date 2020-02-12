package Planes;

public class MyPlane extends Plane {
    public MyPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
       super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public int getMaxSpeed() {
        return super.getMaxSpeed();
    }

    @Override
    public int getMaxFlightDistance() {
        return super.getMaxFlightDistance();
    }

    @Override
    public int getMaxLoadCapacity() {
        return super.getMaxLoadCapacity();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
