package example1;

public class Fruit {
    private static String weight;
    private static String type;

    public Fruit(String weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void getInfo(){
        System.out.println("Waga: " + weight);
        System.out.println("Typ: " + type);
    }
}
