package com.example.fazeel.buttonlistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ButtonScreen extends AppCompatActivity {
    private Button EventsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_screen);

        EventsButton =  findViewById(R.id.EventsButton);
        setupListeners();

    }


    private void setupListeners() {
        EventsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View buttonView) {
                Intent changeScreen = new Intent(buttonView.getContext(), Eventlist.class);
                startActivityForResult(changeScreen, 0);
            }

        });


    }
}
