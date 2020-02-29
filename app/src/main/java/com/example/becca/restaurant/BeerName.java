package com.example.becca.restaurant;

/**
 * Created by Becca on 3/19/2018. Creates a new class called Beer Name that contains
 * the beer name, ABV, and description.
 */

public class BeerName {

    // declare mName variable: Name of Beer
    private String mName;

    //declare private variable: ABV
    private String mABV;

    //declare private mDescription variable: Description of beer

    private String mDescription;

    //Create new BeerName object

    public BeerName (String Name, String ABV, String Description){

        mName = Name;
        mABV = ABV;
        mDescription = Description;
    }

    public String getName(){
        return mName;
    }


    public String getABV(){
        return mABV;
    }


    public String getDescription(){
        return mDescription;
    }
}
