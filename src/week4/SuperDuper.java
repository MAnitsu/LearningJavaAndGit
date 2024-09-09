package week4;

public class SuperDuper {
    public static void main(String[] args) {
        Cat myCat = new Cat(3, "Sumi", "Carnilove");

        System.out.println(myCat.name + " is " + myCat.age + " years old and she likes " + myCat.catFoodPreference);

        System.out.println();

        Employee myEmployee = new Employee();
        myEmployee.setAge(27);
        myEmployee.setName("Grunt");

        System.out.println(myEmployee.getName() + " is " + myEmployee.getAge() + " years old and he says: " );
        myEmployee.action();
    }
}
