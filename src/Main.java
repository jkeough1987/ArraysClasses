public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Laptop laptop = new Laptop();
        Food food = new Food();
        Job job = new Job();

        int currentYear = 2016;



         car.manufacturer= "chevy";
        System.out.println(car.manufacturer);

        motorcycle.years = 2016;
        motorcycle.manufacturer = "Kawasaki";
        motorcycle.power = 78;
        motorcycle.style = "sport";
        motorcycle.production = (motorcycle.years == currentYear);

        System.out.println("My motorcycle is a " + motorcycle.manufacturer + " made in " + motorcycle.years +
                ". Its a " + motorcycle.style + " bike with " + motorcycle.power + "hp.");
        if(motorcycle.production == true) {
            System.out.println("It is currently still in production.");
        } else {
            System.out.println("It is no longer being produced.");
        }
        }



    }



