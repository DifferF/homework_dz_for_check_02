package homework_02.task_02;

public class Main {

    public static void main(String[] args) {

        Car_hw_02 car_01 = new Car_hw_02();
        System.out.println("Конструктор по умолчанию (year=0 color=null), объект car_01");
        System.out.println("year = " + car_01.getYear()+ " color = " + car_01.getColor());

        Car_hw_02 car_02 = new Car_hw_02(2021);
        System.out.println("Конструктор принимает только год, объект car_02");
        System.out.println("year = " + car_02.getYear());

        Car_hw_02 car_03 = new Car_hw_02("Красный");
        System.out.println("Конструктор принимает только цвет, объект car_03");
        System.out.println("year = " + car_03.getColor());

        Car_hw_02 car_04 = new Car_hw_02(2012,"Синий");
        System.out.println("Конструктор принимает год и цвет, объект car_04");
        System.out.println("year = " + car_04.getYear()+ " color = " + car_04.getColor());
    }

}
