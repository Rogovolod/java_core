package poly;

public class VehicleCreate {
    public static void main(String[] args) {
        Vehicle[] arr = new Vehicle[3];
        arr[0] = new Plane();
        arr[1] = new Train();
        arr[2] = new Autobus();
        for (Vehicle v : arr) {
            v.move();
            v.size();
        }

    }
}
