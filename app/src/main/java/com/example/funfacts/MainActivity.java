package com.example.funfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //region declare view variables
    //
    private TextView factsTextView;
    private Button showFactsButton;
    //endregion


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //region Assigin views from thje layout to the corrosponding variables
        factsTextView = findViewById(R.id.factsTextView);
        showFactsButton = findViewById(R.id.showFact);
        //endregion

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
        showFactsButton.setOnClickListener(listener);

    }
}