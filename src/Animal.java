public class Animal {

    private static final Double DEFAULT_DOG_WEIGHT = 10.5;
    private static final Double DEFAULT_CAT_WEIGHT = 4.0;
    private static final Double DEFAULT_ELEPHANT_WEIGHT = 700.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    final String species;
    String name;
    Boolean isAlive;
    private Double weight;



    public void feed(){
        if(this.weight<= 0.0){
            System.out.println("Pet does not eat, coz it's dead");
        }else {
            this.weight += 1.0;
        }
        System.out.println(this.weight);
    }

    public void takeForWalk(){
        if(this.weight<=0.0){
            System.out.println("Animal does not move, it's dead");
        }else {
            this.weight -= 1.0;
            if(this.weight <= 0.0){
                System.out.println("Animal has died");
            }
        }

        System.out.println(this.weight);
    }

    public Animal(String species) {
        this.species = species;
        this.isAlive = true;

        switch (species) {
            case "dog" : this.weight = DEFAULT_DOG_WEIGHT; break;
            case "cat" : this.weight = DEFAULT_CAT_WEIGHT; break;
            case "elephant" : this.weight = DEFAULT_ELEPHANT_WEIGHT; break;
            default : this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }


}
