import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();
        animalList.addAnimal(new Camel(1, "john", "go", "01-01-2010"));
        animalList.addAnimal(new Cat(2, "matroskin", "miau", "02-03-2018"));
        animalList.addAnimal(new Dog(3, "sharik", "gav", "03-04-2017"));
        animalList.addAnimal(new Donkey(4, "ralph", "eat", "05-06-2015"));
        animalList.addAnimal(new Hamster(5, "kuzia", "eat", "04-06-2022"));
        animalList.addAnimal(new Horse(6, "marusia", "go", "16-05-2014"));
        System.out.println("Начальный список животных в зоопарке:\n");
        animalList.showAll();
        System.out.println("Список команд:\nshow-список животных\nadd-добавить новое животное\ncomshow-показать список команд\ncomadd-обучить животное новой команде\nexit-выход\nhelp-список команд\n");
        while(true){
            System.out.println("Введите команду: ");
            Scanner iScanner = new Scanner(System.in, "Cp866");
            String com = iScanner.nextLine();
            if (com.toLowerCase().equals("show")) {
                animalList.showAll();
            }else{
                if (com.toLowerCase().equals("add")){
                    animalList.animalConsoleAdd(animalList, animalList.getLastId()+1);                   
                }else{
                    if (com.toLowerCase().equals("exit")){
                        break;
                    }else{
                        if (com.toLowerCase().equals("help")){
                            System.out.println("Список команд:\nshow-список животных\nadd-добавить новое животное\ncomshow-показать список команд\ncomadd-обучить животное новой команде\nexit-выход\nhelp-список команд\n");
                        }else{
                            if (com.toLowerCase().equals("comshow")) {
                                animalList.showAnimalCommand();
                            }else{
                                if (com.toLowerCase().equals("comadd")){
                                    animalList.CommandNewAdd();
                                    System.out.println("Животное успешно обучено команде!");
                                }else{
                                    System.out.println("Команда не найдена. Попробуйте другую команду.");
                                }
                            }
                        }
                    }
                }
            }
        }

        
    }
}
