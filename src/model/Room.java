package model;

public class Room {
private String code;
private double price;
private String type;
private boolean status = true;

    public Room() {
    }

    public Room(String code, double price, String type) {
        this.code = code;
        this.price = price;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "code='" + code + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", status=" + status +
                '}';
    }
}
