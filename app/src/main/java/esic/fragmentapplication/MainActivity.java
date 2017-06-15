package esic.fragmentapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import esic.fragmentapplication.fragments.AboutFragment;
import esic.fragmentapplication.fragments.HomeFragment;
import esic.fragmentapplication.fragments.NewsFragment;
import esic.fragmentapplication.fragments.SettingsFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // premier Fragment chargé
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.framelayout,new HomeFragment())
                .commit();

        findViewById(R.id.button_menu_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.framelayout,new HomeFragment())
                        .commit();
            }
        });

        findViewById(R.id.button_menu_news).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.framelayout,new NewsFragment())
                        .commit();
            }
        });

        findViewById(R.id.button_menu_about).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.framelayout,new AboutFragment())
                        .commit();
            }
        });

        findViewById(R.id.button_menu_settings).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.framelayout,new SettingsFragment())
                        .commit();
            }
        });

    }
}
