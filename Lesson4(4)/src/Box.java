import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitList = new ArrayList<>();

    public Box() {
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public void setFruitList(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public float getWeight() {
        return fruitList.size() * fruitList.get(0).getWeight();
    }

    public boolean compare(Box<Orange> box2) {
        return false;
    }

    public void transfer(Box<T> box3) {

    }

    public void pourOver(Box<T> appleBox2) {

    }
}