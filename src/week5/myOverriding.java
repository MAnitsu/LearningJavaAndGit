package week5;

public class myOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        System.out.println(d.getAvgSize());

        Chihuahua c = new Chihuahua();
        c.bark();
        System.out.println(c.getAvgSize());
    }
}
