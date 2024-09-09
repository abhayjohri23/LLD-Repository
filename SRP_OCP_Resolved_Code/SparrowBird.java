public class SparrowBird extends Bird{
    public SparrowBird(Double weight,String color,BeakType beakType){
        super(weight,color,beakType);
    }
    @Override
    public void fly() {
        System.out.println("Fortunately, I can fly!");
        return ;
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eats insects!");
        return ;
    }
}
