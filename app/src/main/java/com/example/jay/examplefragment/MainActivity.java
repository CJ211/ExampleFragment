package com.example.jay.examplefragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements first.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(String msg)
    {
        second s=(second)getSupportFragmentManager().findFragmentById(R.id.fr2);
        s.receivedinfo(msg);
    }

}
