import java.util.ArrayList;

public class Animal {
    private int id;
    private String name;
    private String typeAnimal;
    private String commandAnimal;
    private String birthAnimal;

    public Animal(int id, String name, String typeAnimal, String commandAnimal, String birthAnimal){
        this.id = id;
        this.name = name;
        this.typeAnimal = typeAnimal;
        this.commandAnimal = commandAnimal;
        this.birthAnimal = birthAnimal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public String getCommandAnimal() {
        return commandAnimal;
    }

    public void setCommandAnimal(String commandAnimal) {
        this.commandAnimal = commandAnimal;
    }

    public String getBirthAnimal() {
        return birthAnimal;
    }

    public void addCommand (String newCommand){
        StringBuilder ComAdder = new StringBuilder();
        ComAdder.append(commandAnimal)
            .append(String.format(", %s", newCommand));
        setCommandAnimal(ComAdder.toString());
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("ID животного: %d\n", id))
                .append(String.format("Имя животного: %s\n", name))
                .append(String.format("Тип животного: %s\n", typeAnimal))
                .append(String.format("Выученные команды: %s\n", commandAnimal))
                .append(String.format("День рождения животного: %s\n", birthAnimal));
        return res.toString();
    }
}