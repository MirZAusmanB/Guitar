import java.util.Scanner;

public class Guitar {

    private String id;
    private String type;
    private String model;
    private String make;
    private double price;

    Guitar2 g1 = new Guitar2();
    public Guitar(String id, String type, String make, String model, double price){
        this.id = id;
        this.type = type;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public void setId(String id) {
        if(g1.checkId(id))
            this.id = id;
        else
            System.out.println("This ID already exists! Try again.");
    }

    public String getId() {
        return id;
    }
    public String getType() {
        return type;
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
}
