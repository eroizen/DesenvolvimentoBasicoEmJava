package Car;

public class Exercise01 {
    public static void main(String[] args) {
        Car car = new Car("WV", "Passat", 2020);
        int i;
        for(i=0;i<5;i++){
            System.out.println("The number of passengers is "+car.getPassengers());
            car.setPassengers(car.getPassengers() + 1);
        }
        for(i=5;i>-1;i--){
            System.out.println("The number of passengers is "+car.getPassengers());
            car.setPassengers(car.getPassengers() - 1);
        }
        System.out.println("This car is a "+ car.getModel()+" "+car.getBrand()+" from "+ car.getYear());
    }
}
