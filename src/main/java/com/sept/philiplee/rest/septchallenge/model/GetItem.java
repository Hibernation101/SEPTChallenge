package com.sept.philiplee.rest.septchallenge.model;

import java.util.ArrayList;

public class GetItem {
    //Get Individual Item Information
    public String getItemID(Item item){
        String foundID = item.getId();
        return foundID;
    }
    public String getItemName(Item item){
        String foundName = item.getName();
        return foundName;
    }
    public String getItemDesc(Item item){
        String foundDesc = item.getDesc();
        return foundDesc;
    }
    public double getItemPrice(Item item){
        double foundPrice = item.getPrice();
        return foundPrice;
    }
}
