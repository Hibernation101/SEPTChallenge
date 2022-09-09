package com.sept.philiplee.rest.septchallenge.dao;
import com.sept.philiplee.rest.septchallenge.model.GetItemList;
import com.sept.philiplee.rest.septchallenge.model.Item;

import java.util.ArrayList;

public class ItemPlaceholderDAO extends Item {
    public Item createItem(String id, String name, String desc, double price) {
        GetItemList getArray = new GetItemList();
        Item newItem = new Item();
        newItem.setId(id);
        newItem.setName(name);
        newItem.setDesc(desc);
        newItem.setPrice(price);
        return newItem;
    }
}
