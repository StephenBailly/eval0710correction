public class Person {

    private String firstName;
    private String lastName;
    private Fridge fridge;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fridge = new Fridge();
    }

    public void addInMyFridge(Food food) {
        this.fridge.add(food);
    }

    public void removeInMyFridge(Food food) {
        this.fridge.remove(food);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Fridge getFridge() {
        return fridge;
    }
}
