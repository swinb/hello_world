public class CarTest {

    public static void main(String[] args) {
        HyundaiFactory factory = HyundaiFactory.getFactory();
        Car myCar = factory.createCar();
        Car yourCar = factory.createCar();

        System.out.println("첫번째 차 번호는" +myCar.showCarNumber());
        System.out.println("두번째 차 번호는" +yourCar.showCarNumber());
    }
}

class HyundaiFactory{
    int count = 1000;
    public HyundaiFactory(){}
    public static HyundaiFactory getFactory(){
        HyundaiFactory factory = new HyundaiFactory();
        return factory;
    }
    public Car createCar(){
        Car car = new Car(count);
        count++;
        return car;
    }
}
class Car{
    int carNumber;
    public Car(int carNumber){
        this.carNumber = carNumber;
    }
    public int showCarNumber(){
    return carNumber;
    }
}