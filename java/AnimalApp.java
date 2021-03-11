public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Дружок", 100, 200);
        Cat cat = new Cat("Барсик", 111, 1, "Серый");
        System.out.println();
        cat.run();
        System.out.println();
        cat.swim();
        Dog dog = new Dog("Бобик", 432, 5, "Черный");
        Dog dog1 = new Dog("Бобик1", 432, 5, "Черный");
        System.out.println();
        dog.run();
        System.out.println();
        dog.swim();
        System.out.println();
        System.out.println("Котов создано: " + cat.getCats());
        System.out.println("Cобак создано: " + dog.getDogs());
        System.out.println("Животных создано: " + Animal.getAnimals());
    }
}
