package by.tmstasks.objects.animal;

public class Vet{
    String name;

    public Vet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void treatAnimal(Animal animal){
        System.out.println("Животное из города " + animal.getLocation() + ", кушает " + animal.getFood() + ", " + animal.makeNoise());
    }
}
