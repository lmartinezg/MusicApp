package com.example.lorenzo.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View for Albums
        TextView albums = (TextView) findViewById(R.id.albums_textview);

        // Set a click listener on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new Intent to open the {@link NumbersActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        // Find the View for Artists
        TextView artists = (TextView) findViewById(R.id.artists_textview);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new Intent to open the {@link NumbersActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        // Find the View for Now Playing
        TextView nowplaying = (TextView) findViewById(R.id.nowplaying_textview);

        // Set a click listener on that View
        nowplaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new Intent to open the {@link NumbersActivity}
                Intent nowplayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowplayingIntent);
            }
        });

        // Find the View for Playlists
        TextView playlists = (TextView) findViewById(R.id.playlists_textview);

        // Set a click listener on that View
        playlists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new Intent to open the {@link NumbersActivity}
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

        // Find the View for Podcasts
        TextView podcasts = (TextView) findViewById(R.id.podcasts_textview);

        // Set a click listener on that View
        podcasts.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new Intent to open the {@link NumbersActivity}
                Intent podcastsIntent = new Intent(MainActivity.this, PodcastsActivity.class);
                startActivity(podcastsIntent);
            }
        });

        // Find the View for Search
        TextView search = (TextView) findViewById(R.id.search_textview);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new Intent to open the {@link NumbersActivity}
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

    }
}
