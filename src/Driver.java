public class Driver {
    public String name;
    public int age;

    public Driver (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void drive (Car car) {
        System.out.println(name + ", aged: " + age + ". Is driving a " + car.getModel() + ". That costs " + car.getPrice());

    }
}
