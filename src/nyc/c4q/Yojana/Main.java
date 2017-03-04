package nyc.c4q.Yojana;
import nyc.c4q.Yojana.animals.Animal;
import nyc.c4q.Yojana.animals.Dog;
import nyc.c4q.Yojana.animals.GuineaPig;
import nyc.c4q.Yojana.animals.Persian;
import nyc.c4q.Yojana.animals.Cat;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
	        new Dog(),
            new GuineaPig(),
            new Persian(),
    };

    for (int index = 0; index < animals.length; index++) {
        Animal currentAnimal = animals[index];
        currentAnimal.vocalise();
        System.out.println(currentAnimal.vocalise());
        Persian aPersian = new Persian();
        Cat aPersianCat = (Cat) aPersian;
        Object  animal = new Dog();

    }
    }
}
// different unrelated functions and methods work together is interface