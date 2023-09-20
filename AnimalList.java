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


    
}
