public class LabExample {
    public static void main(String[] args) {
 Animal dog = new Dog("Barney");
Animal cat = new Cat("Tom");
Animal tiger= new Tiger();
Animal zebra= new Zebra(true);
Animal [] animals = {dog,cat,tiger,zebra};
    for (Animal animal : animals) {
        System.out.println(animal.sound());
        if (animal instanceof Trainable)
            System.out.println((((Trainable) animal).performTrick()));
            if (animal instanceof  PetAnimal)
                System.out.println(((PetAnimal)animal).getName());
        }
}
    }
interface Trainable {
    public String performTrick();
}
abstract class Animal implements Comparable<Animal> {
    public abstract String sound();

    public int compareTo(Animal o) {
        return 0;
    }
}
 abstract class PetAnimal extends Animal {
     private String name;

     public PetAnimal(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }
 }
abstract class WildAnimal extends Animal {
        private boolean eatsMeat;

        public WildAnimal (boolean eatsMeat) {
            this.eatsMeat=eatsMeat;
        }
        public boolean isCarnivore() {
            return eatsMeat;
        }
}
class Dog extends PetAnimal implements Trainable {
        public Dog (String name) {
            super(name);
        }
        public String sound() {
            return "hav hav";
        }
        public String performTrick() {
            return "catch disc";
        }
        }
class Cat extends PetAnimal {
        public  Cat (String name) {
            super(name);
        }
        public String sound() {
            return "miyav";
        }
}
class Tiger extends WildAnimal implements Trainable {
    public Tiger() {
        super(true);
    }
    public String sound() {
        return "roar";
    }
    public String performTrick() {
        return "Eat someone";
    }
}
    class Zebra extends WildAnimal {
        public Zebra(boolean eatsMeat) {
            super(eatsMeat);
        }
        public Zebra() {
            this(false);
        }
        public String sound() {
            return null;
        }
    }

    class Human extends Animal implements Trainable {
        public String sound() {
            return "Merhaba";
        }

        public String performTrick() {
            return null;
        }
    }


