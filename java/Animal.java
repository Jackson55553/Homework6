public class Animal {
    private String name;
    private int run;
    private int swim;
    private static int animals = 0;
    public void setName(String name) {
        this.name = name;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }


    public Animal(String name, int run, int swim){
        this.name = name;
        this.run = run;
        this.swim = swim;
        animals++;
    }
    public void animalInfo(){
        System.out.printf("животное с именем %s, пробегает %s, проплывает %s", getName(), getRun(), getSwim());
    }

    public static int getAnimals() {
        return animals;
    }
}
