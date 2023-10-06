package carFactory;

public class Factory {
       public static Car createSportsCar(String brand, String model) {
        return new Car("Спорткар", 300, brand, model);
    }
    public static Car createTruck(String brand, String model) {
        return new Car("Грузовик", 500, brand, model);
    }

    public static Car createSedan(String brand, String model) {
        return new Car("Легковой", 150, brand, model);
    }
}

