package com.example.myapplication;

import android.location.Location;
import android.media.Image;

import java.io.Serializable;

public class myItem implements Serializable {
//    Image myImage;
    String nameFood;
    String price;
//    Location foodLocation;
    String phoneNumber;
    //friend attribute
    public myItem()//defaultConstructor
    {
        nameFood="Change Food Name Here";
        price="Change Price Here";
        phoneNumber="Enter Phone Number";
    }
    public myItem(String nameFood,String price,String phoneNumber)
    {
        this.nameFood=nameFood;
        this.price=price;
        this.phoneNumber=phoneNumber;
    }
    public myItem(myItem myItemIn)
    {
        nameFood=myItemIn.nameFood;
        price=myItemIn.price;
        phoneNumber=myItemIn.phoneNumber;
    }
//    public void setMyImage(Image in)
//    {
//        myImage=in;
//    }
//    public void setPrice(String price)
//    {
//        this.price=price;
//    }
    public void setNameFood(String nameFood)
    {
        this.nameFood=nameFood;
    }
//    public void setFoodLocation(Location foodLocation)
//    {
//        this.foodLocation=foodLocation;
//    }
    public void setPhonenNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
}
