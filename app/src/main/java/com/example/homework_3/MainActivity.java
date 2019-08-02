package com.example.homework_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText firstName;
    EditText secondName;
    EditText thirdName;
    Button share;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         firstName = findViewById(R.id.editFirstName);
         secondName = findViewById(R.id.editSeconName);
         thirdName = findViewById(R.id.editThirdName);
         share.findViewById(R.id.SHARE);
         save.findViewById(R.id.SHARE);

        firstName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ObvActivity.class);

                startActivity(intent);

            }
        });

                secondName.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent();

                        intent.putExtra(intent.EXTRA_TEXT,"lol");
                        intent.setAction(intent.ACTION_SEND);
                        intent.setType("text/plain");

                        if (intent.resolveActivity(getPackageManager()) != null);
                        startActivity(intent);

                    }
                });

                thirdName.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(MainActivity.this, ForResultActivity.class);

                        startActivityForResult(intent,606);

                    }
                });

                share.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                });

    }
}
