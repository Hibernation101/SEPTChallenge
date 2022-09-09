package com.sept.philiplee.rest.septchallenge.model;

public class DeleteItem {
    public void deleteItem(Item item){
        for(int i = 0; i < ItemManagementDAO.arrItemList.length() - 1; i++) {
            if (ItemManagementDAO.arrItemList[i] == item) {
                ItemManagementDAO.arrItemList.remove(i);
                break;
            }
        }
        item = null;
    }
}
