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
    }
}
