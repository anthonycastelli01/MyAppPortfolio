package com.anthony_castelli.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button popularMoviesButton = (Button) findViewById(R.id.button);
        Button stockHawkButton = (Button) findViewById(R.id.button2);
        Button buildItBiggerButton = (Button) findViewById(R.id.button3);
        Button materialButton = (Button) findViewById(R.id.button4);
        Button ubiquitousButton = (Button) findViewById(R.id.button5);
        Button capstoneButton = (Button) findViewById(R.id.button6);

        assert popularMoviesButton != null;
        popularMoviesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.popular_movies_toast, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        assert stockHawkButton != null;
        stockHawkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.stock_hawk_toast, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        assert buildItBiggerButton != null;
        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.build_it_bigger_toast, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        assert materialButton != null;
        materialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.make_your_app_material_toast, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        assert ubiquitousButton != null;
        ubiquitousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.go_ubiquitous_toast, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        assert capstoneButton != null;
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.capstone_toast, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}
