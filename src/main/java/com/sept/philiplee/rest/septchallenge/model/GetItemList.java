package com.sept.philiplee.rest.septchallenge.model;

import com.sept.philiplee.rest.septchallenge.dao.ItemManagementDAO;

import java.util.ArrayList;

public class GetItemList {
    public ArrayList<Item> getList() {
        ItemManagementDAO dao = new ItemManagementDAO();
        return dao.getItemList();
    }
    public Item getItemFromIndex(int index) {
        ItemManagementDAO dao = new ItemManagementDAO();
        ArrayList<Item> arrList = dao.getItemList();
        return arrList.get(index);
    }
}
