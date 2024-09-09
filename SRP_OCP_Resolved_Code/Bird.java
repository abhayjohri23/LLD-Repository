public abstract class Bird {
    private Double weight;
    private String color;
    private BeakType beakType;

    public Bird(Double weight, String color, BeakType beakType) {
        this.weight=weight;
        this.color=color;
        this.beakType=beakType;
    }

    //Basic functionalities expected from any bird on planet earth.
    public abstract void fly();
    public abstract void eat();
    public void makeSound(){
        System.out.println("Bird makes a sound! Yes, it can say something obviously.");
    }
}
