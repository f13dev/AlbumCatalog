package com.f13dev.albumcatalog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
// Import the AlbumCore system
import com.f13dev.AlbumCore.*;

import java.io.Serializable;

public class AlbumCatalogMain extends AppCompatActivity implements View.OnClickListener, Serializable {

    // Button variables
    Button buttonAddArtist;
    Button buttonViewCatalog;
    Button buttonAddAlbum;
    Button buttonQuit;
    AlbumCoord coord;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_catalog_main);

        buttonAddArtist = (Button) findViewById(R.id.buttonAddArtist);
        buttonAddArtist.setOnClickListener(this);

        buttonViewCatalog = (Button) findViewById(R.id.buttonViewCatalog);
        buttonViewCatalog.setOnClickListener(this);

        buttonAddAlbum = (Button) findViewById(R.id.buttonAddAlbum);
        buttonAddAlbum.setOnClickListener(this);

        buttonQuit = (Button) findViewById(R.id.buttonQuit);
        buttonQuit.setOnClickListener(this);


        // Initialize the AlbumCoord object
        coord = new AlbumCoord();

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

    }


    @Override
    public void onClick(View v) {
        Intent i = new Intent (this, AlbumCatalogMain.class);
        switch (v.getId())
        {
            case R.id.buttonViewCatalog:
                i = new Intent(this, ViewCatalog.class);
                i.putExtra("AlbumCoord", (Serializable) coord);
                startActivity(i);
                break;
            case R.id.buttonAddArtist:
                i = new Intent(this, AddArtistActivity.class);
                startActivity(i);
                break;
            case R.id.buttonAddAlbum:
                i = new Intent(this, AddAlbumActivity.class);
                startActivity(i);
                break;
            case R.id.buttonQuit:
                finish();
                System.exit(0);
                break;
        }
    }
}
