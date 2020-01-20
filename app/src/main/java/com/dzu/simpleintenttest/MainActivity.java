package com.dzu.simpleintenttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnMovewithData = findViewById(R.id.btn_move_with_data);
        btnMovewithData.setOnClickListener(this);

        Button btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(this, MoveActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_move_with_data:
                Intent moveWithData = new Intent(this, MoveWithData.class);
                moveWithData.putExtra(MoveWithData.EXTRA_NAME, "DZULKIFLI");
                moveWithData.putExtra(MoveWithData.EXTRA_AGE, 19);
                startActivity(moveWithData);
                break;

            case R.id.btn_dial_number:
                String phoneNumber = "085747000130";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}
