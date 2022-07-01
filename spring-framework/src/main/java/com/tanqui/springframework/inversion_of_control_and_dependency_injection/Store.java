package com.tanqui.springframework.inversion_of_control_and_dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Store {

//    @Autowired
//    @Qualifier("item1")
    private Item item;

//    public Store() {
//        item = new ItemImpl1();
//    }

    public Store() {}

    public Store(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void print() {
        item.display();
    }
}
