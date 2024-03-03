public class Dog extends Animal{
    private String earshape;
    private String tailShape;
    public Dog(String type, String size, double weight){
        super(type, size, weight);
    }
    public Dog(){
        super();
    }
    public void bark(){
        System.out.println(super.type+" is saying Woof");
    }
    public void run(){
        System.out.println("Dog is running");
    }
    public void wagtail(){
        System.out.println("Wagging tail");
    }

    @Override
    public String toString() {
        return "{" +
            " earshape='" + earshape + "'" +
            ", tailShape='" +tailShape + "'" +
            "}";
    }

}
