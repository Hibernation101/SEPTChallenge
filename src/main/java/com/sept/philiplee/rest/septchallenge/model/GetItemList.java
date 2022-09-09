package com.sept.philiplee.rest.septchallenge.model;

import com.sept.philiplee.rest.septchallenge.dao.ItemManagementDAO;

import java.util.ArrayList;

public class GetItemList {
    private ArrayList<Item> arrItemList;
    public void setList(ArrayList<Item> arr) {
        this.arrItemList = arr;
    }
    public ArrayList<Item> getList() {
        return this.arrItemList;
    }
    public Item getItemFromIndex(int index) {
        return arrItemList.get(index);
    }
}
