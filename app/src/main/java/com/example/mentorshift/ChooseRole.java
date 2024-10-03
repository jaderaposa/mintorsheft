package com.example.mentorshift;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

public class ChooseRole extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_role); // Set the layout for this activity

        // Find views
        ImageView menteeImage = findViewById(R.id.mentee_image);
        ImageView mentorImage = findViewById(R.id.mentor_image);


        // Set click listeners for the images or texts to navigate to respective activities
        menteeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToMenteeLogin();
            }
        });

        mentorImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToMentorLogin();
            }
        });




    }

    private void navigateToMenteeLogin() {
        Intent intent = new Intent(ChooseRole.this, ChooseRole.class);
        startActivity(intent);
    }

    private void navigateToMentorLogin() {
        Intent intent = new Intent(ChooseRole.this, ChooseRole.class);
        startActivity(intent);
    }
}
