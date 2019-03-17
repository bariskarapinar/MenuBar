package com.example.menubar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public  boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()){
            case R.id.my_menu_settings:
                Toast.makeText(getApplicationContext(), "Settings", Toast.LENGTH_LONG).show();
            break;
            case R.id.my_menu_help:
                Toast.makeText(getApplicationContext(), "Help", Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }

}
