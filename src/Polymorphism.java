public class Polymorphism {
    AnimalSound animal_Sound = new AnimalSound();
    Dog animal_Dog = new Dog();
    AnimalSound animal_SoundDog = new Dog();
}

class Polymorphism_Exercise {
    public static void Exercise() {
        Polymorphism poly_Object = new Polymorphism();

        System.out.println();
        System.out.println("Roar for animal_Sound: ");
        poly_Object.animal_Sound.Roar();

        System.out.println("Move and Roar for animal_Dog");
        poly_Object.animal_Dog.Move();
        poly_Object.animal_Dog.Roar();

        System.out.println("Roar for animal_SoundDog");
        poly_Object.animal_SoundDog.Roar();
    }
}

class AnimalSound {
    void Roar() {
        System.out.println("Woooooooo\n");
    }
}

class Dog extends AnimalSound {
    void Move() {
        System.out.println("Walk/Run");
    }

    @Override
    void Roar() {
        System.out.println("Wan wan wan\n");
    }
}