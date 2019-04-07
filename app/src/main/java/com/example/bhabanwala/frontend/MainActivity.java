package com.example.bhabanwala.frontend;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_UserTitle;
    Switch userSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_UserTitle = findViewById(R.id.user_title);
        userSwitch= findViewById(R.id.user_switch);

        userSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked) tv_UserTitle.setText("Owner Login");
                else tv_UserTitle.setText("Care Taker Login");
            }
        });
    }

    public void goToRegistration(View view) {
        Intent registerIntent= new Intent(MainActivity.this, Registration.class);
        startActivity(registerIntent);
    }
}
