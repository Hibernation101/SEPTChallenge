package com.sept.philiplee.rest.septchallenge.model;

import java.util.ArrayList;

public class GetItemList {
    public ArrayList<Item> getList() {
        return ItemManagementDAO.arrItemList;
    }
    public Item getItemFromIndex(int index) {
        return ItemManagementDAO.arrItemList[index];
    }
}
