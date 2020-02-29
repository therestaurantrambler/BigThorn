package com.example.becca.restaurant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class BeerListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer_list);

        ArrayList<BeerName> beerList = new ArrayList<BeerName>();

        beerList.add(new BeerName("Scruit", "5%", "Barrel-Aged Gruit"));
        beerList.add(new BeerName("Farm Pale w/ Citra", "5%", "Barrel-Aged Pale Ale"));
        beerList.add(new BeerName("Farm Red", "6%", "Barrel-Aged Red Ale"));
        beerList.add(new BeerName("Roasted Hickory", "7%", "Log-Aged Kettle-Sour"));
        beerList.add(new BeerName("Citra Sour", "5%", "Dry-Hopped Kettle-Sour"));
        beerList.add(new BeerName("Mad Coffee Brown", "8%", "Log-Aged Brown Ale"));
        beerList.add(new BeerName("Farm Porter", "6%", "Log-Aged Porter"));
        beerList.add(new BeerName("Ginger Juice", "5%", "Log-Aged Sour Ale"));
        beerList.add(new BeerName("Beer 9", "" ,"" ));
        beerList.add(new BeerName("Beer 10", "", ""));
        beerList.add(new BeerName("Beer 11","" ,"" ));
        beerList.add(new BeerName("Beer 12","" , ""));
        beerList.add(new BeerName("Beer 13","" , ""));
        beerList.add(new BeerName("Beer 14","" ,"" ));
        beerList.add(new BeerName("Beer 15","" , ""));

//Create arrayAdapter to recycle views. This uses a single list item.
        BeerNameAdapter itemsAdapter = new BeerNameAdapter(this, beerList);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }
}
