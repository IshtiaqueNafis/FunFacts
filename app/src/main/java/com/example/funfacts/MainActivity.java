package com.example.funfacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //region declare view variables
    //
    private TextView factsTextView;
    private Button showFactsButton;
    private FactBook factbook = new FactBook();
    private ConstraintLayout layout;
    private ColorWheel colorWheel = new ColorWheel();
    //endregion


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //region Assigin views from thje layout to the corrosponding variables
        factsTextView = findViewById(R.id.factsTextView);
        showFactsButton = findViewById(R.id.showFact);
        layout = findViewById(R.id.relativeLayout);
        //endregion

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// the button was
                //randmonly select a fact


                // update a string with new fact.
                factsTextView.setText(factbook.getFact());
                layout.setBackgroundColor(colorWheel.getColors());
                showFactsButton.setTextColor(colorWheel.getColors());

            }
        };
        showFactsButton.setOnClickListener(listener);

    }
}