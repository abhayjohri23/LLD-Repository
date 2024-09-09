public class PenguinBird extends Bird{
    public PenguinBird(Double weight,String color,BeakType beakType){
        super(weight,color,beakType);
    }
    @Override
    public void fly() {
        System.out.println("Penguins cannot fly.");
        return ;
        //In year 2050, if penguins learn to fly I can come to this class to modify the method independent of other flying types.
        //Testing becomes easier, Code readability increases and hence it is closed to modification. (OCP), but open to extension of fly behavior.
    }

    @Override
    public void eat() {
        System.out.println("Penguins eat fishes from the ponds and lakes");
        return ;
    }
}
