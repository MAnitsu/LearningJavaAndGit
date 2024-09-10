package week4;

public class Cat extends Animal{
    String catFoodPreference;

    public Cat(int age, String name, String catFoodPreference) {
        super(age, name); // super can also be used to call the parent class constructor like this
                          // with the parameters of the constructor
                          // the super word for constructors can be used only in a constructor itself
                          // and it has to be the first line inside the constructor
        this.catFoodPreference = catFoodPreference;
    }

    @Override
    public void makeNoise() {
        super.makeNoise(); // calls the parent class' makeNoise method
        System.out.println("Meow meow meow!");

        eat();
    }

    public void jump() {
        super.makeNoise(); // the super keyword can also be used outside the overrode method, but in real world scenarios this will not happen
    }
}