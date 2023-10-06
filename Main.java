//Создайте Package (щелчок правой кнопкой мыши на папке src -> New -> Package).
//1 В созданном пакете создайте класс Автомобиль. Создайте поля для типа автомобиля – грузовик, спорткар, легковой (можно сделать перечисление), мощность двигателя (сколько лошадиных сил), поля для марки и модели автомобиля. Одно из полей сделайте публичным, второе – без модификатора доступа, остальные – приватными. Создайте объект этого класса в программе и попробуйте установить значения для полей. Какие поля возможно установить? Для приватных полей напишите геттеры и сеттеры.
//2 Создайте класс Завод. Класс будет производить три вида автомобилей (иметь 3 метода) – спорткар, грузовик, легковой. В основной программе создайте несколько автомобилей с помощью класса Завод.

import carFactory.Car;
import carFactory.Factory;

public class Main {
    public static void main(String[] args) {

             Car sportsCar = Factory.createSportsCar("Ferrari", "458 Italia");

            Car truck = Factory.createTruck("Volvo", "VNL 860");
            truck.setPower(600);

            Car sedan = Factory.createSedan("Toyota", "Camry");
            System.out.println("Спорткар: " + sportsCar.getBrand() + " " + sportsCar.getModel());
            System.out.println("Грузовик: " + truck.getBrand() + " " + truck.getModel() + ", Мощность: " + truck.getPower() + " л.с.");
            System.out.println("Легковой автомобиль: " + sedan.getBrand() + " " + sedan.getModel());
        }
    }

