package oopSeminar4HW;

import java.util.List;

class Box<T extends Fruit> {
    private List<T> itemsList;

    public Box(List<T> itemsList) {
        this.itemsList = itemsList;
    }

    public void put(T item) {
        itemsList.add(item);
    }

    public List<T> getItemsList() {
        return itemsList;
    }
}
