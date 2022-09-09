package com.sept.philiplee.rest.septchallenge.dao;
import com.sept.philiplee.rest.septchallenge.model.Item;

public class ItemPlaceholderDAO extends Item {
    public void createItem(String id, String name, String desc, double price) {
        Item newItem = new Item();
        newItem.setId(id);
        newItem.setName(name);
        newItem.setDesc(desc);
        newItem.setPrice(price);
    }
}
