package com.example.smartacremort;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.ColorUtils;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAcName, txtTmprtr, txtHmdty, valTmprtr, valHmdty, txtEql1, txtEQl2, txtSetTmptr;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button turnOnBtn = (Button) findViewById(R.id.turnOnBtn);

        // Add function for On/Off button
        turnOnBtn.setOnClickListener(new View.OnClickListener() {
            private boolean isTextTurnOn = true;
            @Override
            public void onClick(View view) {
                if (isTextTurnOn){
                    turnOnBtn.setText("Off");
                    isTextTurnOn = false;
                }else{
                    turnOnBtn.setText("ON");
                    isTextTurnOn = true;
                }

            }
        });

        txtAcName = (TextView) findViewById(R.id.txtAcName);
        txtTmprtr = (TextView) findViewById(R.id.txtTmprtr);
        txtHmdty = (TextView) findViewById(R.id.txtHmdty);
        valTmprtr = (TextView) findViewById(R.id.valTmprtr);
        valHmdty = (TextView) findViewById(R.id.valHmdty);
        txtEql1 = (TextView) findViewById(R.id.txtEql1);
        txtEQl2 = (TextView) findViewById(R.id.txtEql2);
        txtSetTmptr = (TextView) findViewById(R.id.txtSetTmptr);

        // Change Text View background color opacity
        Drawable backgroundDrawable = txtAcName.getBackground();
        if(backgroundDrawable instanceof ColorDrawable){
            int currentColor = ((ColorDrawable) backgroundDrawable).getColor();
            int newColor = ColorUtils.setAlphaComponent(currentColor,128);
            txtAcName.setBackgroundColor(newColor);
            txtTmprtr.setBackgroundColor(newColor);
            txtHmdty.setBackgroundColor(newColor);
            valTmprtr.setBackgroundColor(newColor);
            valHmdty.setBackgroundColor(newColor);
            txtEql1.setBackgroundColor(newColor);
            txtEQl2.setBackgroundColor(newColor);
            txtSetTmptr.setBackgroundColor(newColor);
        }


    }
}