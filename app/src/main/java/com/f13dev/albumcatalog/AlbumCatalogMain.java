package com.f13dev.albumcatalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
// Import the AlbumCore system
import com.f13dev.AlbumCore.*;

public class AlbumCatalogMain extends AppCompatActivity {

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


    }
}
