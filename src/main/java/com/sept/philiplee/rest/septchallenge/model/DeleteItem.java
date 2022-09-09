package com.sept.philiplee.rest.septchallenge.model;

import com.sept.philiplee.rest.septchallenge.dao.ItemManagementDAO;

import java.util.ArrayList;

public class DeleteItem {
    public void deleteItem(ArrayList<Item> arr, Item item){
        arr.remove(item);
        item = null;
    }
}
