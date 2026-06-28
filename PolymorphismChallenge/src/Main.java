public class Main {

    public static void main(String[] args) {

   
    Car Tesla = new ElectricCar("2022 Red Tesla Model 3" , 568 , 72);
    runRace(Tesla);  
System.out.println(Tesla.description);
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}
