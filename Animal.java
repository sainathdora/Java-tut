public class Animal {
    protected String type;
    private String size;
    private double weight;
    public void Move(String speed){
        System.out.println("The Animal is moving "+speed);
    }
    public void MakeNoise(){
        System.out.println(this.type+" Making some noise");
    }
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    public Animal(){ 
    }

    @Override
    public String toString() {
        return "{" +
            " type='" + this.type + "'" +
            ", size='" + this.size + "'" +
            ", weight='" + this.weight + "'" +
            "}";
    }
    
    
}

