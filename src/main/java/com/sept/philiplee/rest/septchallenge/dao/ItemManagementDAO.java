package com.sept.philiplee.rest.septchallenge.dao;

import java.util.ArrayList;
import com.sept.philiplee.rest.septchallenge.model.Item;

public class ItemManagementDAO {
    //Array List Methods for Placeholder DAO Items
    private ArrayList<Item> arrItemList = new ArrayList<Item>();
    public ArrayList<Item> getItemList() {
        return arrItemList;
    }

    public void save(Item item){
        arrItemList.add(item);
    }

    public void delete(Item item){
        arrItemList.remove(item);
    }
}
