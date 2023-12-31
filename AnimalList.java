import java.text.SimpleDateFormat;
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

    public void showAnimalCommand(){
        Scanner iScanner = new Scanner(System.in); 
        System.out.println("Введите ID животного:");
        Integer animalID = iScanner.nextInt();
        if (animalID < 1 || animalID > getLastId()) {
        System.out.println("Животного с таким ID нет в списке.");
        }else{
            for (Animal animal : animalsInZoo) {
                if (animalID.equals(animal.getId())) {
                    System.out.println("Выученные команды данного животного:");
                    System.out.println(animal.getCommandAnimal());
                    break;
                }
            }
        }

    }

    public void CommandNewAdd(){
        Scanner iScanner = new Scanner(System.in, "Cp866"); 
        Scanner iScanner2 = new Scanner(System.in, "Cp866"); 
        System.out.println("Введите ID животного для обучения новой команде:");
        Integer animalID = iScanner.nextInt();
        if (animalID < 1 || animalID > getLastId()) {
            System.out.println("Животного с таким ID нет в списке.");
        }else{
            for (Animal animal : animalsInZoo) {
                if (animalID.equals(animal.getId())) {
                    System.out.println("введите новую команду для животного:");
                    String commandNew = iScanner2.nextLine(); 
                    animal.setCommandAnimal(animal.getCommandAnimal() + ", " + commandNew);
                    System.out.println("Животное успешно обучено команде!");
                }
            }
        }
    }

    public void animalConsoleAdd(AnimalList listOfAnimal, int id){
        Boolean flag = true;
        Scanner iScanner = new Scanner(System.in, "Cp866"); 
        System.out.println("Введите вид животного: Dog, Cat, Horse, Hamster, Donkey или Camel.");
        String typyAnimal = iScanner.nextLine();
        System.out.println("Введите имя животного: ");
        String nameAnimal = iScanner.nextLine();
        System.out.println("Введите команду для животного: ");
        String commandAnimal = iScanner.nextLine();
        System.out.println("Введите год рождения животного: ");
        String birthAnimal = iScanner.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        try{
            formatter.parse(birthAnimal);
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
            System.out.println("Новое животное успешно добавлено в зоопарк!");
        }catch(Exception e){
            flag = false;
            System.out.println("Некорректно введена дата. нужен формат dd.MM.yyyy");
        }
    }

   


    
}
