import java.util.ArrayList;
import java.util.List;

public class AnimalList {
    public List<Animal> animalsInZoo = new ArrayList<>();

    public void addAnimal(Animal newAnimal){
        this.animalsInZoo.add(newAnimal);
    }

    public void showAll(){
        for (Animal animalsInZoo: this.animalsInZoo){
            System.out.println(animalsInZoo);
        }
    }

    public void searchAnimal(Integer animalID){
        int count = 0;
        for (Animal animal : animalsInZoo) {
            if (animalID.equals(animal.getId())) {
                System.out.println("животное найдено!");
                System.out.println(animal);
                count ++;
            }

        }
    if (count == 0) {
        System.out.println("животного с таким ID нет в списке");
        }
    }


    
}
