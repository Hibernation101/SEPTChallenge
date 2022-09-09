package com.sept.philiplee.rest.septchallenge.dao;

import java.util.ArrayList;
import com.sept.philiplee.rest.septchallenge.model.Item;

public class ItemManagementDAO {
    private ArrayList<Item> arrItemList = new ArrayList<Item>();

    public void save(Item item){
        arrItemList.add(item);
    }

    public void delete(Item item){
        arrItemList.remove(item);
    }
}
