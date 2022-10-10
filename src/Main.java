public class Main {
    public static void main(String[] args) {

        Person person = new Person("Pitt", "Brad");
        Fridge bradPittFridge = person.getFridge();
        System.out.println(bradPittFridge);

        Food rice = new Food("Riz");

        bradPittFridge.add(rice);

        System.out.println(bradPittFridge);

        bradPittFridge.remove(rice);
        System.out.println(bradPittFridge);


    }
}