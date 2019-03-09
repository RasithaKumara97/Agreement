package com.example.kavishkam.agreement;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    boolean checked2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void go1(View view) {

        boolean checked =((CheckBox)view).isChecked();
        switch (view.getId()){


            case R.id.checkBox:

                if (checked)
                    checked2 = true;
                    break;
        }


    }

    public void go2(View view) {

        if (checked2){

            startActivity(new Intent(this,Main2Activity.class));
            }

            else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Please check the agreement");
            builder.setMessage("Make sure to please agree to our terms and agreement");
            builder.setPositiveButton("I like", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });

            builder.setNegativeButton("I Dont Like", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.show();

        }


    }
}
