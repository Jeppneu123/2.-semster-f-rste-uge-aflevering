public class Car {
    public String model;
    public int price;

    public Car (String model, int price){
        this.model = model;
        this.price = price;
    }

    public void start (){
        System.out.println("Car is started & ready to go");
    }

    public void move () {
        System.out.println("Car is moving and cruising");

    }

    public void stop (){
        System.out.println("Car is stopped and not going further");
    }

    public String getModel (){
        return model;
    }

    public int getPrice () {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
