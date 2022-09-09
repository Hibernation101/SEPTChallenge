package com.sept.philiplee.rest.septchallenge.model;

import com.sept.philiplee.rest.septchallenge.dao.ItemManagementDAO;

import java.util.ArrayList;

public class DeleteItem {
    public void deleteItem(Item item){
        ItemManagementDAO dao = new ItemManagementDAO();
        dao.delete(item);
        item = null;
    }
}
