package week5;

public class Chihuahua extends Dog{

    int avgSize = 10;

    @Override
    public void bark() {
        System.out.println("yip yip!");
    }

    @Override
    public int getAvgSize() {
        return avgSize;
    }
}
