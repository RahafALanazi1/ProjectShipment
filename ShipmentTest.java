
package shipmenttest;


class Shipment {
    private int number;
    private String destination;
    private String deliveryOptions;
    private double deliveryPrice;

    public Shipment(int number, String destination, String deliveryOptions, double deliveryPrice) {
        this.number = number;
        this.destination = destination;
        this.deliveryOptions= deliveryOptions;
        this.deliveryPrice = deliveryPrice;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeliveryOptions() {
        return deliveryOptions;
    }

    public void setDeliveryOptions(String deliveryOptions) {
        if (deliveryOptions.equals("PickUp") || deliveryOptions==("HomeDelivery")) {
         this.deliveryOptions = deliveryOptions;
        } 
        else {
         System.out.println("Invalid delivery option. It must be 'PickUp' or 'HomeDelivery'.");
        }
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public double calculatePriceWithTax() {
        return (deliveryPrice * 0.15) + deliveryPrice;
    }
}

class ShipmentTest {
    public static void main(String[] args) {
     Shipment sh1 = new Shipment(101, "New York", "HomeDelivery", 50.0);

     System.out.println(" Number: " + sh1.getNumber());
     System.out.println(" Destination: " + sh1.getDestination());
     System.out.println("Delivery Option: " + sh1.getDeliveryOptions());
     System.out.println("Delivery Price: " + sh1.getDeliveryPrice());
     System.out.println("Price with Tax: " + sh1.calculatePriceWithTax());
    }
}