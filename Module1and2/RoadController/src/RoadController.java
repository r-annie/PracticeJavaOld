import core.*;
import core.Camera;

import java.util.Scanner;

public class RoadController {
    //переменная типа double
    private static double passengerCarMaxWeight = 3500.0; // kg
    //переменная типа int
    private static int passengerCarMaxHeight = 2000; // mm
    //переменная типа int
    //модуль 2, урок 5, задача 1.1, строка 13
    private static int controllerMaxHeight = 3500; // mm
    //переменная типа int
    private static int passengerCarPrice = 100; // RUB
    //переменная типа int
    private static int cargoCarPrice = 250; // RUB
    //переменная типа int
    private static int vehicleAdditionalPrice = 200; // RUB

    public static void main(String[] args) {
        System.out.println("Сколько автомобилей сгенерировать?");

        Scanner scanner = new Scanner(System.in);
        //переменная типа int
        int carsCount = scanner.nextInt();

        //переменная типа int
        for (int i = 0; i < carsCount; i++) {
            Car car = Camera.getNextCar();
            System.out.println(car);

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) {
                openWay();
                continue;
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car);
            if (price == -1) {
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car) {
        //переменная типа int
        int carHeight = car.height;
        //переменная типа int
        int price = 0;
        //модуль 2, урок 5, задача 1.2, строки 58-79
        if (carHeight > controllerMaxHeight) {
            blockWay("высота вашего ТС превышает высоту пропускного пункта!");
            return -1;
        } else if (carHeight > passengerCarMaxHeight) {
            //Грузовой автомобиль
            price = cargoCarPrice;
        } else {
            double weight = car.weight;
            if (weight > passengerCarMaxWeight) {
                //Грузовой автомобиль
                price = cargoCarPrice;
            } else {
                //Легковой автомобиль
                price = passengerCarPrice;
            }
        }
        if (car.hasVehicle) {
            //Прицеп
            price = price + vehicleAdditionalPrice;
        }
        return price;
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay() {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason) {
        System.out.println("Проезд невозможен: " + reason);
    }
}