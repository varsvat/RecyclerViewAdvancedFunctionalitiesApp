package com.example.edunomicsprobationtask1;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent i = getIntent();
        ExampleItem exampleItem = i.getParcelableExtra("Example Item");

        int imagestore = exampleItem.getmImageResource();
        String text1store = exampleItem.getmText1();
        String text2store = exampleItem.getmText2();

        ImageView imagelast = findViewById(R.id.imageViewdetails);
        imagelast.setImageResource(imagestore);

        TextView textlast = findViewById(R.id.textView1details);
        textlast.setText(text1store);

        TextView text2last = findViewById(R.id.textView2details);
        text2last.setText(text2store);

    }
}