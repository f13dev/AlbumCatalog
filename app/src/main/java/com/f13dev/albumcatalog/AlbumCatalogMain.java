package com.f13dev.albumcatalog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
// Import the AlbumCore system
import com.f13dev.AlbumCore.*;

public class AlbumCatalogMain extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_catalog_main);

        // Initialize the AlbumCoord object
        AlbumCoord coord = new AlbumCoord();

        // Initialize a number of Artist objects
        coord.addArtist("Metallica");
        coord.addArtist("Guns n Roses");
        coord.addArtist("Placebo");
        coord.addArtist("Korn");

        // Initialize a number of Album objects
        coord.addAlbum("The Black Album", "Metallica", true);
        coord.addAlbum("Ride the lightning", "Metallica", false);
        coord.addAlbum("Without you I'm nothing", "Placebo", true);
        coord.addAlbum("Sleeping with ghosts", "Placebo", true);
        coord.addAlbum("Placebo", "Placebo", true);
        coord.addAlbum("Battle for the sun", "Placebo", true);
        coord.addAlbum("Untouchables", "Korn", true);
        coord.addAlbum("Follow the leader", "Korn", true);

        // Create links to buttons
        Button buttonAddArtist = (Button) findViewById(R.id.btnAddArtist);
        Button buttonAddAlbum = (Button) findViewById(R.id.btnAddAlbum);
        Button buttonViewCatalog = (Button) findViewById(R.id.btnViewCatalog);
        Button buttonQuit = (Button) findViewById(R.id.btnQuit);

        buttonAddArtist.setOnClickListener(this);
        buttonAddAlbum.setOnClickListener(this);
        buttonViewCatalog.setOnClickListener(this);
        buttonQuit.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent();

        if (view.getId() == R.id.btnQuit)
        {
            finish();
            System.exit(0);
        }
        else
        {
            if(view.getId() == R.id.btnAddArtist)
            {
                i = new Intent(this, AddArtistActivity.class);
            }
            else if (view.getId() == R.id.btnAddAlbum)
            {
                i = new Intent(this, AddAlbumActivity.class);
            }
            else if (view.getId() == R.id.btnViewCatalog)
            {
                i = new Intent(this, ViewCatalogActivity.class);
            }
            startActivity(i);
        }
    }
}
