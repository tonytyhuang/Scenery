package com.forrestfan.scenery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class Review extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
        accessibility.setText(accessibilitySeek.getProgress() + "/5");
        accessibilitySeek.setOnSeekBarChangeListener(
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
        accessibility.setText(accessibilitySeek.getProgress() + "/5");
        accessibilitySeek.setOnSeekBarChangeListener(
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
}
