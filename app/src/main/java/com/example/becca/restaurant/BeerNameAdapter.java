package com.example.becca.restaurant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Becca on 3/20/2018. This is a custom array adapter that allows us to work with
 * BeerName
 */

public class BeerNameAdapter extends ArrayAdapter<BeerName> {

    public BeerNameAdapter(Context context, ArrayList<BeerName> beerList) {

        super(context, 0, beerList);
    }

    /*
     * Define getView method
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Beer name object located at this position in the list
        BeerName currentBeerName = getItem(position);

        // Find the Name TextView in the list_item.xml layout
        TextView beernameTextView = (TextView) listItemView.findViewById(R.id.beer_name);
        // Get the  beer name from the current Beer name object and
        // set this text on the name TextView
        beernameTextView.setText(currentBeerName.getName());

        // Find the ABV TextView in the list_item.xml layout
        TextView abvTextView = (TextView) listItemView.findViewById(R.id.abv);
        // Get the ABV from the current Beer name object and
        // set this text on the number TextView
        abvTextView.setText(currentBeerName.getABV());

        // Find the description TextView in the list_item.xml layout
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);

        // Get the description from the current Beer name object and
        // set this text on the number TextView
        descriptionTextView.setText(currentBeerName.getDescription());



        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        //ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        //iconView.setImageResource(currentAndroidFlavor.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }


}
