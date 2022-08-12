package homework_02.task_04;

        /*
        Задание 4+
        Используя Intelij IDEA создать проект, пакет. (Заново!)
        Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
        Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
        Перегрузить конструкторы вызывая конструктор из конструктора.
        Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.
         */

public class Car_hw_04 {

    private int year;
    private double speed;
    private int weight;
    private int mileage;
    private String color;

    // used car_01
    public Car_hw_04() {
        this.year = 1456;
        this.speed = 120.45;
        this.weight = 1300;
        this.mileage = 120000;
        this.color = "Черный";
    }

    // used car_02
    public Car_hw_04(int year) {
        this.year = year;
    }

    // used car_03
    public Car_hw_04(int year, double speed, int weight, int mileage) {
        this(year);
        this.speed = speed;
        this.weight = weight;
        this.mileage = mileage;
    }

    // used car_04
    public Car_hw_04(int year, double speed, int weight, int mileage, String color) {
        this(year, speed, weight, mileage);
        this.color = color;
    }

    // used car_05
    public Car_hw_04(int year, int mileage) {
        this.year = year;
        this.mileage = mileage;
    }

//    public Car_hw_04(int year, int weight) {
//        this.year = year;
//        this.weight = weight;
//    }

    // used car_06
    public Car_hw_04(int year, int weight, int mileage) {
        this(year, weight);
        this.mileage = mileage;
    }

    // used car_07
    public Car_hw_04(int year, int mileage, double speed) {
        this(year, mileage);
        this.speed = speed;
    }

    // used car_08
    public Car_hw_04(double speed, int year, int mileage) {
        this(year, mileage);
        this.speed = speed;
    }

    // used car_09
    public Car_hw_04(String color, int year, double speed, int weight, int mileage) {
        this(year, speed, weight, mileage);
        this.color = color;
    }
}
