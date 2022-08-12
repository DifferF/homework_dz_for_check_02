package homework_02.task_03;

public class Main {

    public static void main(String[]args){

        Car_hw_03 car_01 = new Car_hw_03();
        Car_hw_03 car_02 = new Car_hw_03(1999);
        Car_hw_03 car_03 = new Car_hw_03(200, 180.00);
        Car_hw_03 car_04 = new Car_hw_03(2017, 190.00, 1100);
        Car_hw_03 car_05 = new Car_hw_03(2019, 210.00, 900, "Зеленый");
        Car_hw_03 car_06 = new Car_hw_03(2018, 320.00, 1100);

        System.out.println("car_06 год: " + car_06.getYear() + " скорость: " + car_06.getSpeed() + " вес: " + car_06.getWeight());
        car_06.setYearWeight(2019,1000);
        System.out.println("car_06 изменили год/вес " + car_06.getYear() + " / " + car_06.getWeight());
    }




}
