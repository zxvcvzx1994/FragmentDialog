package com.example.kh.myapplication;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by kh on 5/10/2017.
 */

public class Dialogue_Fragment extends DialogFragment implements View.OnClickListener{
    Button btnyes,btnno;
    Comunicator comunicator;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        comunicator= (Comunicator) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.dialogue_layout, container, false);
           btnyes= (Button) view.findViewById(R.id.btnYes);
           btnno= (Button) view.findViewById(R.id.btnNo);
        btnyes.setOnClickListener(this);
        btnno.setOnClickListener(this);
        setCancelable(false);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnYes){
          comunicator.respond("Button Yes was Clicked");
            dismiss();
        }else{
          comunicator.respond("Button No was clicked");
            dismiss();
        }
    }
    public interface Comunicator{
        public void respond(String text);
    }
}

