public class AirConditioning implements HomeService{
    @Override
    public void turnOn() {
        System.out.println("AirConditioning are turned on\n");
    }

    @Override
    public void turnOff() {
        System.out.println("AirConditioning are turned off\n");
    }
}
