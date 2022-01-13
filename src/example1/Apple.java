package example1;

public class Apple extends Fruit{
    private static String variety;
    private static final String TYPE = "jabłkowity";

    public Apple(String weight, String variety) {
        super(weight, TYPE);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Odmiana: " + variety);
    }
}
