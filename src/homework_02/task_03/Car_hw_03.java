package homework_02.task_03;

        /*
        Задание 3+
        Используя Intelij IDEA создать проект, пакет.
        (Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
        Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
        Перегрузить конструкторы. Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.
         */

public class Car_hw_03 {

    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car_hw_03(){
        this.year = 1456;
        this.speed = 120.45;
        this.weight = 1300;
        this.color = "Черный";
    }

    public Car_hw_03(int year){
        this.year = year;
    }

    public Car_hw_03(int year, double speed){
        this.year = year;
        this.speed = speed;
    }

    public Car_hw_03(int year, double speed, int weight){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car_hw_03(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public void setYearWeight(int year, int weight){
        this.year = year;
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public int getWeight() {
        return weight;
    }

    public double getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }
}
