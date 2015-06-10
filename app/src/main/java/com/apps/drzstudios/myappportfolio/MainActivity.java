package com.apps.drzstudios.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spot_btn, score_btn, lib_btn, build_btn, reader_btn, capstone_btn;

        spot_btn = (Button) findViewById(R.id.spot_btn);
        score_btn = (Button) findViewById(R.id.score_btn);
        lib_btn = (Button) findViewById(R.id.lib_btn);
        build_btn = (Button) findViewById(R.id.build_btn);
        reader_btn = (Button) findViewById(R.id.reader_btn);
        capstone_btn = (Button) findViewById(R.id.capstone_btn);


        spot_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                featureUnavailable("Spotify Streamer");
            }
        });

        score_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                featureUnavailable("Scores App");
            }
        });

        lib_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                featureUnavailable("Library App");
            }
        });

        build_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                featureUnavailable("Build It Bigger");
            }
        });

        reader_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                featureUnavailable("XYZ Reader");
            }
        });

        capstone_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                featureUnavailable("Capstone App");
            }
        });

    }

    private void featureUnavailable(String string) {
        Toast.makeText(getApplicationContext(), (string +" feature is currently under development."),
                Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
