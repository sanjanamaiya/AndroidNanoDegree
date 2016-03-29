package com.sanjana.udacity.project.nanodegreeapps;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void buttonClickHandler(View v)
    {
        Toast toast = null;
        switch (v.getId())
        {
            case R.id.button_spotify :
                toast = Toast.makeText(this, R.string.spotify_toast, Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.button_bib :
                toast = Toast.makeText(this, R.string.bib_toast, Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.button_library :
                toast = Toast.makeText(this, R.string.library_toast, Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.button_scores_app :
                toast = Toast.makeText(this, R.string.scores_toast, Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.button_xyz :
                toast = Toast.makeText(this, R.string.xyz_toast, Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.button_capstone :
                toast = Toast.makeText(this, R.string.capstone_toast, Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
    }
}
