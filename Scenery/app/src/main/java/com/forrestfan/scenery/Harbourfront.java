package com.forrestfan.scenery;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Harbourfront extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harbourfront2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button review = (Button) findViewById(R.id.btnReview);
        review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Harbourfront.this, Review.class);
                startActivity(intent);
            }
        });
    }
}
