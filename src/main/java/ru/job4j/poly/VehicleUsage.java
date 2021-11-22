package ru.job4j.poly;

public class VehicleUsage {
    public static void main(String[] args) {
        Plane plane1 = new Plane();
        Plane plane2 = new Plane();
        Plane plane3 = new Plane();
        Train train1 = new Train();
        Train train2 = new Train();
        Train train3 = new Train();
        Autobus bus1 = new Autobus();
        Autobus bus2 = new Autobus();
        Autobus bus3 = new Autobus();
        Vehicle planeV1 = plane1;
        Vehicle planeV2 = plane2;
        Vehicle planeV3 = plane3;
        Vehicle trainV1 = train1;
        Vehicle trainV2 = train2;
        Vehicle trainV3 = train3;
        Vehicle busV1 = bus1;
        Vehicle busV2 = bus2;
        Vehicle busV3 = bus3;
        Vehicle[] vehicles = new Vehicle[]{planeV1, planeV2, planeV3, trainV1, trainV2, trainV3,
                busV1, busV2, busV3};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.liftCapacity();
        }
    }
}
