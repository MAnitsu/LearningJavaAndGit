package week4;

public class Mouse1 extends Mouse {
    String color = "Matte"; // this attribute is unique to Mouse1, but it will also inherit the attributes of Mouse

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
