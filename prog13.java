class Car {
    private String name;
    private String brand;
    private int year;

    
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.name = model; 
        this.year = year;
    }

    
    public Car(String brand, String model) {
        this(brand, model, 0); 
    }

        public Car(String brand) {
        this(brand, "Unknown"); 
    }

    
    
    public Car() {
        this("Unknown"); 
    }

    
    public void display() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println();
    }
}


class  ford {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "VS", 2005);
        Car car2 = new Car("Ford", "VS");
        Car car3 = new Car("Ford");
        Car car4 = new Car();


        car1.display();
        car2.display();
        car3.display();
        car4.display();
    }
}
