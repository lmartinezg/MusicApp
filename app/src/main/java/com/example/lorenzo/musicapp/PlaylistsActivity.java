package com.example.lorenzo.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        // Find the View for playlist (TextView)
        TextView list = (TextView) findViewById(R.id.playlist_textview);

        // Set a click listener on that View
        list.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new Intent to open the {@link NowPlaying}
                Intent nowPlayingIntent = new Intent(PlaylistsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Find the View for Go to Main (Button)
        TextView mainButton = (TextView) findViewById(R.id.button_goto_main);

        // Set a click listener on that View
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new Intent to open the {@link Main}
                Intent mainIntent = new Intent(PlaylistsActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
    }
}
