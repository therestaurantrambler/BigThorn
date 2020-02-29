package com.example.becca.restaurant;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//Find the view that shows the beerList catergory.

        TextView beerList = (TextView) findViewById(R.id.beerList);

        // Set the onClickListener to that view.
        beerList.setOnClickListener(new View.OnClickListener() {
            // This method will execute when the "Our Beers" button is pressed.
            @Override
            public void onClick(View view) {
                Intent beerListIntent = new Intent(MainActivity.this, BeerListActivity.class);
                startActivity(beerListIntent);
            }
        });
    }
        //main buttons listener

    public void sendAnnaEmail(View view) {

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"anna@bigthormfarm.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Beer Order");
        //  intent.putExtra(Intent.EXTRA_TEXT, priceMessage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    //main buttons listener
    public void sendText(View view) {
        Intent intentsms = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + "2175503433"));
        intentsms.putExtra("sms_body", "We need more beer.");


        if (intentsms.resolveActivity(getPackageManager()) != null) {
            startActivity(intentsms);
        }
    }


    public void dialPhone(View view) {

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + "2175503433"));
        // intent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] {"aaron@bigthormfarm.com"});
        // intent.putExtra(Intent.EXTRA_SUBJECT, "NeW MeSSage");
        //  intent.putExtra(Intent.EXTRA_TEXT, priceMessage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


}
