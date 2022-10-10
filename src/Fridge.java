import java.util.*;

public class Fridge {
    List<Food> foods;

    public Fridge() {
        this.foods = new ArrayList<>();
    }

    public int getNbFood(){

        return this.foods.size();
    }

    public boolean existIn(Food food) {

        for (Food myFood : this.foods) {
            if (myFood.getName().equalsIgnoreCase(food.getName())) {
                return true;
            }
        }
        return false;
    }

    public void add(Food food) {
        if(!this.existIn(food)) {
            this.foods.add(food);
        }
    }

    public void remove(Food food) {
        if(this.existIn(food)) {
            this.foods.removeIf(myFood -> myFood.getName().equalsIgnoreCase(food.getName()));
        }
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "foods=" + foods +
                '}';
    }
}
