public class Bird {
    private Double weightOfTheBird;
    private BirdType birdType;
    private BeakSize beakSize;
    private String color;

    //Constructors
    public Bird(Double weightOfTheBird, BirdType birdType, BeakSize beakSize, String color){
        this.weightOfTheBird=weightOfTheBird;
        this.birdType=birdType;
        this.beakSize=beakSize;
        this.color=color;
    }

    //Getters and Setters - (Not using the lombok functionality)
    public void setWeightOfTheBird(Double weightOfTheBird) {
        this.weightOfTheBird = weightOfTheBird;
    }
    public Double getWeightOfTheBird() {
        return weightOfTheBird;
    }
    public BirdType getBirdType() {
        return birdType;
    }

    public void setBirdType(BirdType birdType) {
        this.birdType = birdType;
    }

    public BeakSize getBeakSize() {
        return beakSize;
    }

    public void setBeakSize(BeakSize beakSize) {
        this.beakSize = beakSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Behaviour Methods
    public void fly() throws Exception{
        switch(birdType){
            case PARROT: {
                System.out.println("Parrot is flying");
                break;
            }
            case EAGLE:{
                System.out.println("Eagle is flying high!");
                break;
            }
            case PENGUIN:{
                System.out.println("Penguin cannot fly!");
                break;
            }
            case PIGEON:{
                System.out.println("Pigeon takes a flight");
                break;
            }
            case OSTRICH:{
                System.out.println("Ostrich cannot fly!");
                break;
            }
            case SPARROW:{
                System.out.println("Sparrow takes a short flight!");
                break;
            }
            default:{
                throw new Exception("Not a defined birdType");
            }
        }

        return ;
    }

    public void run() throws Exception{
        switch(birdType){
            case PARROT: {
                System.out.println("Parrot sits but doesn't run");
                break;
            }
            case EAGLE:{
                System.out.println("Eagle sits but doesn't run!");
                break;
            }
            case PENGUIN:{
                System.out.println("Penguin can at least walk!");
                break;
            }
            case PIGEON:{
                System.out.println("Pigeon sits but doesn't run");
                break;
            }
            case OSTRICH:{
                System.out.println("Ostrich runs fast!");
                break;
            }
            case SPARROW:{
                System.out.println("Sparrow hops!");
                break;
            }
            default:{
                throw new Exception("Not a defined birdType");
            }
        }

        return ;
    }


}
