package com.example.kh.myapplication;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Dialogue_Fragment.Comunicator{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void process(View v) {
        if(v.getId()==R.id.btn){
            FragmentManager  manager  =getFragmentManager();
          Dialogue_Fragment dialog  = new Dialogue_Fragment();
            dialog.show(manager, "dialog");
        }
    }

    @Override
    public void respond(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
