package ru.anton.test2;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private int id;

    private int company_id;
    private List<Description> descriptions;


    static public List<Item> init() {

        List<Description> descriptions1 = new ArrayList<>();
        descriptions1.add(new Description(1, 1, "asd", "dasds"));
        List<Item> items = new ArrayList<>();

        items.add(new Item("Телефон,", 1, descriptions1));
        items.add(new Item("csdsdsds,", 2, descriptions1));
        return items;
    }

    public Item(String name, int id, List<Description> descriptions) {
        this.name = name;
        this.id = id;
        this.descriptions = descriptions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", descriptions=" + descriptions +
                '}';
    }
}
