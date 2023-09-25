import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public int getLastId(){
        return animalsInZoo.size();
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

    public void animalConsoleAdd(AnimalList listOfAnimal, int id){
        Scanner iScanner = new Scanner(System.in); 
        System.out.println("Введите вид животного: Dog, Cat, Horse, Hamster, Donkey или Camel.");
        String typyAnimal = iScanner.nextLine();
        System.out.println("Введите имя животного: ");
        String nameAnimal = iScanner.nextLine();
        System.out.println("Введите команду для животного: ");
        String commandAnimal = iScanner.nextLine();
        System.out.println("Введите год рождения животного: ");
        String birthAnimal = iScanner.nextLine();
        if (typyAnimal.toLowerCase().equals("dog")) {
            listOfAnimal.addAnimal(new Dog(id, nameAnimal, commandAnimal, birthAnimal));
        }else if (typyAnimal.toLowerCase().equals("cat")) {
            listOfAnimal.addAnimal(new Cat(id, nameAnimal, commandAnimal, birthAnimal));
        }else if (typyAnimal.toLowerCase().equals("horse")) {
            listOfAnimal.addAnimal(new Horse(id, nameAnimal, commandAnimal, birthAnimal));
        }else if (typyAnimal.toLowerCase().equals("hamster")) {
            listOfAnimal.addAnimal(new Hamster(id, nameAnimal, commandAnimal, birthAnimal));
        }else if (typyAnimal.toLowerCase().equals("donkey")) {
            listOfAnimal.addAnimal(new Donkey(id, nameAnimal, commandAnimal, birthAnimal));
        }else if (typyAnimal.toLowerCase().equals("camel")) {
            listOfAnimal.addAnimal(new Camel(id, nameAnimal, commandAnimal, birthAnimal));
        }else{
            System.out.println("Такого вида животного не может быть в нашем зоопарке.");
        }
    }

   


    
}
