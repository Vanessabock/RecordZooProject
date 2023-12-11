package de.vanessaBock;

public class Main {
    public static void main(String[] args) {

        Species regenwurm = new Species("Regenwurm", 3);
        Species trauermuecke = new Species("Trauermuecke", 20);
        Owner zooOwner = new Owner("Olav", 77, "Im Zoo");

        Animal animal1 = new Animal(1, "Franz", regenwurm, 3, zooOwner);
        Animal animal2 = new Animal(2, "Juergen", regenwurm, 7, zooOwner);
        Animal animal3 = new Animal(3, "Guenther", trauermuecke, 4, zooOwner);
        Animal animal4 = new Animal(4, "Guenther", trauermuecke, 4, zooOwner);

        System.out.println(animal1.name());
        System.out.println(animal2.species());
        System.out.println(animal3.equals(animal4));
        System.out.println(animal1);

    }
}
