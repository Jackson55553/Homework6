public class Dog extends Animal{
    private String color;
    private static int dogs = 0;

    public Dog(String name, int run, int swim, String color) {
        super(name, run, swim);
        this.color = color;
        dogs++;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public static int getDogs() {
        return dogs;
    }
    public void dogInfo(){
        System.out.printf("Собака с именем %s, пробегает %sм, проплывает %sм, цвет %s", getName(), getRun(), getSwim(), getColor());
    }

    public void run(){
        if (getRun() > 500){
            System.out.print("Собака не может пробежать такое расстояние(" + getRun() +"м)");
        }else {
            System.out.print(getName() + " Пробежал " + getRun() + "м");
        }
    }
    public void swim(){
        if (getSwim() > 10){
            System.out.print("Собака не может проплыть такое расстояние(" + getSwim() +"м)");
        }else {
            System.out.print(getName() + " Проплыл " + getSwim() + "м");
        }
    }
}
