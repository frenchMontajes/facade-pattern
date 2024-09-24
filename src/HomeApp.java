import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HomeApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Light light = new Light();
        Tv tv = new Tv();
        AirConditioning airConditioning = new AirConditioning();
        HomeInterface homeInterface = new HomeInterface(light,tv,airConditioning);

        boolean stop = false;

while(!stop){
    System.out.println("1.Turn on All");
    System.out.println("2.Turn off All");
    System.out.println("3.Exit");
    System.out.println("Select an Option: ");
    int choice = scan.nextInt();

    switch (choice){
        case 1:
            homeInterface.turnOnAll();
            break;
        case 2:
            homeInterface.turnOffAll();
            break;
        case 3:
            stop = true;
            break;
        default:
            System.out.println("Invalid Option");
    }
}

    }
}