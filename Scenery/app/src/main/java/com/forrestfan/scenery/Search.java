package com.forrestfan.scenery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button search = (Button) findViewById(R.id.btnSearch);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Search.this, SearchResults.class);
                startActivity(intent);
            }
        });

        final SeekBar distanceSeek = (SeekBar) findViewById(R.id.DistanceSeek);
        final TextView distance = (TextView) findViewById(R.id.Distance);
        distance.setText(((distanceSeek.getProgress() + 1) * 5) + "km");
        distanceSeek.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int distanceProgress;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        distanceProgress = (progress + 1) * 5;
                        distance.setText(distanceProgress + "km");
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        distance.setText(distanceProgress + "km ");
                    }
                }
            );

        final SeekBar ratingSeek = (SeekBar) findViewById(R.id.ReviewSeek);
        final TextView rating = (TextView) findViewById(R.id.Review);
        rating.setText(ratingSeek.getProgress() + "/5");
        ratingSeek.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int ratingProgress;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        ratingProgress = progress;
                        rating.setText(ratingProgress + "/5");
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        rating.setText(ratingProgress + "/5");
                    }
                }
        );
        }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
