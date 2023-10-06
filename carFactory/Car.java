//Создайте Package (щелчок правой кнопкой мыши на папке src -> New -> Package).
//1 В созданном пакете создайте класс Автомобиль. Создайте поля для типа автомобиля – грузовик, спорткар, легковой (можно сделать перечисление), мощность двигателя (сколько лошадиных сил), поля для марки и модели автомобиля. Одно из полей сделайте публичным, второе – без модификатора доступа, остальные – приватными. Создайте объект этого класса в программе и попробуйте установить значения для полей. Какие поля возможно установить? Для приватных полей напишите геттеры и сеттеры.
//2 Создайте класс Завод. Класс будет производить три вида автомобилей (иметь 3 метода) – спорткар, грузовик, легковой. В основной программе создайте несколько автомобилей с помощью класса Завод.
package carFactory;
public class Car {
    public String type;
    private int power;
    private String brand;
    private String model;
    public Car(String type, int power, String brand, String model) {
        this.type = type;
        this.power = power;
        this.brand = brand;
        this.model = model;
    }

      public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

