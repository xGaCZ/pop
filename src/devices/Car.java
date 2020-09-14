package devices;

public class Car {
    String model;
    String producer;
    String color;
    String type;
   public Double price=600.0;

    public String toString() {

        return model+" "+price+" "+color+" "+producer+" "+type;
    }
    public Double getPrice() {return price;}


    public void setModel(String model) {this.model = model;}
    public void setType(String type) {this.type = type;}
    public void setProducer(String producer) {this.producer = producer;}
    public void setColor(String color) {this.color = color;}
    public void setPrice(Double price) {this.price = price;}


}
