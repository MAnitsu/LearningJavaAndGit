package week4;

public class Employee extends Person{
    private int accessCode;

    public void setAccessCode(int accessCode) {
        this.accessCode = accessCode;
    }

    public int getAccessCode() {
        return this.accessCode;
    }

    @Override
    public void action() {
        super.action();
        System.out.println("Work work work");
    }
}