package com.forrestfan.scenery;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Review extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button submit = (Button) findViewById(R.id.btnSubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Review.this, MainActivity.class);
                startActivity(intent);
                Snackbar msg = Snackbar.make(findViewById(R.id.reviewWrap), "Thank you for your review", Snackbar.LENGTH_SHORT);
                msg.show();
            }
        });

        final SeekBar accessibilitySeek = (SeekBar) findViewById(R.id.AccessibilitySeek);
        final TextView accessibility = (TextView) findViewById(R.id.Accessibility);
        accessibility.setText(accessibilitySeek.getProgress() + "/5");
        accessibilitySeek.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int accessibilityProgress;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        accessibilityProgress = progress;
                        accessibility.setText(accessibilityProgress + "/5");
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        accessibility.setText(accessibilityProgress + "/5");
                    }
                }
        );

        final SeekBar spaceSeek = (SeekBar) findViewById(R.id.SpaceSeek);
        final TextView space = (TextView) findViewById(R.id.Space);
        space.setText(accessibilitySeek.getProgress() + "/5");
        spaceSeek.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int spaceProgress;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        spaceProgress = progress;
                        space.setText(spaceProgress + "/5");
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        space.setText(spaceProgress + "/5");
                    }
                }
        );

        final SeekBar varietySeek = (SeekBar) findViewById(R.id.VarietySeek);
        final TextView variety = (TextView) findViewById(R.id.Variety);
        variety.setText(accessibilitySeek.getProgress() + "/5");
        varietySeek.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int varietyProgress;
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        varietyProgress = progress;
                        variety.setText(varietyProgress + "/5");
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        variety.setText(varietyProgress + "/5");
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
