package forexams;

// creating of objects 

public class Pokemom {
    String name;
    int level;

    void attack() {
        System.out.print(name + "" + "the name of my pok is");
    }

    public static void main(String[] args) {
        // initializing the object
        Pokemom p1 = new Pokemom();
        // we now specify what we want the name to be
        p1.name = "pikachu";
        p1.level = 10;

        System.out.println(p1.name + " " + p1.level);
        p1.attack();

        // creating another class

        Pokemom p2 = new Pokemom();

        p2.name = "lau tsu";

        System.out.println("  " + p2.name);
        // note that u need to call the attack method
        // p2.attack();

    }
}
