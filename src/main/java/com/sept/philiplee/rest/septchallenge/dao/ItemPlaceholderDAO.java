package com.sept.philiplee.rest.septchallenge.dao;
import com.sept.philiplee.rest.septchallenge.model.Item;

public class ItemPlaceholderDAO extends Item {
    public void createItem(String id, String name, String desc, double price) {
        setId(id);
        setName(name);
        setDesc(desc);
        setPrice(price);
    }
}
