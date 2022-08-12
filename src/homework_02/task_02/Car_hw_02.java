package homework_02.task_02;

    /*
    Задание 2 +
    Используя Intelij IDEA создать проект, пакет.
    Создать класс Машина с полями год(int), цвет(String).
    Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
    Создать класс Main в котором создать экземпляры вызывая разные конструкторы.
     */

public class Car_hw_02 {

    private int year;
    private String color;

    public Car_hw_02() {
    }

//    public Car_hw_02() {
//        this.year = 1999;
//        this.color = "Желтый";
//    }

    public Car_hw_02(int year) {
        this.year = year;
    }

    public Car_hw_02(String color) {
        this.color = color;
    }

    public Car_hw_02(int year, String color) {
        this.color = color;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}
