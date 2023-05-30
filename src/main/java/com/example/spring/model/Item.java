package com.example.spring.model;

import java.util.Objects;

public class Item {
    private Integer ID;

    public Item(Integer ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(ID, item.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return "Item{" +
                "ID=" + ID +
                '}';
    }
}
