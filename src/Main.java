public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal("dog");
        dog.name = "Szarik";
        //dog.species = "canis";
        dog.isAlive = true;


        System.out.println(dog.name);
        System.out.println(dog.isAlive);





        Car auto1 = new Car("BMW", "S5");
        auto1.color = "blue";
        auto1.mileage = 356.67;
        auto1.isOn = false;

        System.out.println(auto1.color);
        System.out.println(auto1.mileage);
        System.out.println(auto1.isOn);


        Car auto2 = new Car("Mercedes", "Maybach");
        auto2.color = "red";
        auto2.mileage = 67840.87;
        auto2.isOn = true;
        System.out.println(auto2.color);
        System.out.println(auto2.mileage);
        System.out.println(auto2.isOn);

        Human personOne = new Human(1924);
        System.out.println(personOne.yearOfBirth);

        Human personTwo = new Human(2005);
        System.out.println(personTwo.yearOfBirth);

        personOne.pet = dog;


        Car carOne = new Car("BMW", "G4");
        Car carTwo = new Car("BMW", "G4");

        Boolean isTheSame =  (carOne == carTwo);
        System.out.println(isTheSame);


        personOne.pet = new Animal("dog");
        System.out.println(personOne.pet.species);



    }
}