package com.sept.philiplee.rest.septchallenge.model;

public class UpdateItem {
    public void updateID(Item item, String id) {
        item.setId(id);
    }

    public void updateName(Item item, String name) {
        item.setName(name);
    }

    public void updateDesc(Item item, String desc) {
        item.setDesc(desc);
    }

    public void updatePrice(Item item, double price) {
        item.setPrice(price);
    }

    public void updateAll(Item item, String id, String name, String desc, double price) {
        item.setId(id);
        item.setName(name);
        item.setDesc(desc);
        item.setPrice(price);
    }
}
