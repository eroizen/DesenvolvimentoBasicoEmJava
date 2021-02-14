public class Actions {
    public static void main(String[] args) {
        Car car = new Car();
        int i;
        for(i=0;i<5;i++){
            System.out.println("The number of passengers is "+car.getPassengers());
            car.setPassengers(car.getPassengers() + 1);
        }
        for(i=5;i>-1;i--){
            System.out.println("The number of passengers is "+car.getPassengers());
            car.setPassengers(car.getPassengers() - 1);
        }
    }
}
