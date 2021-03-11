public class Cat extends Animal{
    private String color;
    private static int cats = 0;

    public Cat(String name, int run, int swim, String color) {
        super(name, run, swim);
        cats++;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void catInfo(){
        System.out.printf("кот с именем %s, пробегает %sм, не умеет плавать, цвет %s", getName(), getRun(), getColor());
    }
    public void run(){
        if (getRun() > 200){
            System.out.print("Кот не может пробежать такое расстояние(" + getRun() +"м)");
        }else {
            System.out.print(getName() + " Пробежал " + getRun() + "м");
        }
    }
    public void swim(){
        if (getSwim() > 0){
            System.out.print("Кот не умеет плавать");
        }else {
            System.out.print("Кот никуда не плывет");
        }
    }

    public static int getCats() {
        return cats;
    }
}
