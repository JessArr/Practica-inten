package com.example.main_activiti;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.texto1);

        Button B = (Button) findViewById(R.id.boton_1) ;
        Button B2 = (Button) findViewById(R.id.boton_2);
        Button B3 = (Button) findViewById(R.id.boton_3);
        Button B4 = (Button) findViewById(R.id.boton_4);
        Button B5 = (Button) findViewById(R.id.boton_5);
        Button B6 = (Button) findViewById(R.id.boton_6);


        B.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);
        B5.setOnClickListener(this);
        B6.setOnClickListener(this);

        new CountDownTimer(2000, 1000) {

            public void onTick(long millisUntilFinished) {
                text1.setText("seconds remaining: " + millisUntilFinished / 1000);
            }
            public void onFinish() {
               ir();
            }
        }.start();

    }

    @Override
    public void onClick(View view) {

            if (view.getId() == R.id.boton_1) {
            Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
            startActivity(i);
        }
            else if (view.getId() == R.id.boton_2) {


                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
                startActivity(i);
            }

            else if (view.getId()==R.id.boton_3){

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
                startActivity(i);

            }


            else if (view.getId()==R.id.boton_4){

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
                startActivity(i);

            }


            else if (view.getId()==R.id.boton_5){

                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
                startActivity(i);

            }


            else if (view.getId()==R.id.boton_6){
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
                startActivity(i);
            }

        }
        public void ir(){
            Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
            startActivity(i);

        }
    }
