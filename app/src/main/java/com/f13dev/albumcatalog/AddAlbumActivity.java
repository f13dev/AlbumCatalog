package com.f13dev.albumcatalog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddAlbumActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_album);

        Button buttonBack = (Button) findViewById(R.id.btnBack);

        buttonBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent();

        if (view.getId() == R.id.btnBack)
        {
            i = new Intent(this, AlbumCatalogMain.class);
        }
        else
        {
            i = new Intent(this, AddAlbumActivity.class);
        }
        startActivity(i);

    }
}
