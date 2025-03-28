public class Event {

    private String name;
    private String description;
    private String location;
    private int maxNumberOfSeats = 100;
    private int availableSeats = 0;
    private double price;

    public Event(String name, String description, String location, int maxNumberOfSeats, int availableSeats, double price) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.maxNumberOfSeats = maxNumberOfSeats;
        this.availableSeats = availableSeats;
        this.price = price;
    }

    public Event(String name, double price) {

        this.name = name;
        this.price = price;
    }

    public Event(String name, double price, String date){

        this.name = name;
        this.price = price;
        this.description = date;
    }

    public Event(String name, double price, String date, String location){

        this.name = name;
        this.price = price;
        this.description = date;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public int getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMaxNumberOfSeats(int maxNumberOfSeats) {
        this.maxNumberOfSeats = maxNumberOfSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", maxNumberOfSeats=" + maxNumberOfSeats +
                ", availableSeats=" + availableSeats +
                ", price=" + price +
                '}';
    }

    public void reserveSeat(int numberOfSeats) {

        availableSeats--;
    }
}
