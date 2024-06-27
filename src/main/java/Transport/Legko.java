package Transport;

public class Legko {

    public static void main(String[] args) {
        //объекты
        Avto bmw = new Avto();
        bmw.speed = 250.2f;
        bmw.weight = 2300f;
        bmw.color = "Black";
        bmw.coordinate = new int[]{3, 0, 1};

        Avto audi = new Avto();
        audi.speed = 260.2f;
        audi.weight = 2100f;
        audi.color = "White";
        audi.coordinate = new int[]{3, 0, 12};

        System.out.println("Скорость: " + bmw.speed + ";" + audi.speed);
    }
}
