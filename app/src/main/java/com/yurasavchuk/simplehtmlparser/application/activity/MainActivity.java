package com.yurasavchuk.simplehtmlparser.application.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yurasavchuk.simplehtmlparser.R;
import com.yurasavchuk.simplehtmlparser.application.fragment.StartupListFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, new StartupListFragment(), StartupListFragment.class.getName())
                    .commit();
        }
    }
}
