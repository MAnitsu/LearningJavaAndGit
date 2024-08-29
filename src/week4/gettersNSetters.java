package week4;

public class gettersNSetters {
    private String name;
    private int age;

    public void setName(String name) {  // setter that sets the name of an object of Account
        this.name = name;
    }

    public void setAge(int age) { // setter that sets the age of an object of Account
        this.age = age;
    }

    public String getName() { // getter that returns the name of an object of Account
        return this.name;
    }

    public int getAge() { // getter that returns the age of an object of Account
        return this.age;
    }

    public static void main(String[] args) {
        gettersNSetters a = new gettersNSetters();
        a.setName("Pablo");
        a.setAge(23);
        System.out.println(a.getName() + ", " + a.getAge());
    }
}
