package com.example.main_activiti;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
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

        new CountDownTimer(30000, 1000) {

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
                Intent i = new Intent(this, MainActivity2.class);
                startActivity(i);
            }
            else if (view.getId() == R.id.boton_2) {


                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
                startActivity(i);
            }

            else if (view.getId()==R.id.boton_3){

                Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
                startActivity(intent);


            }


            else if (view.getId()==R.id.boton_4){

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                startActivity(intent);

            }


            else if (view.getId()==R.id.boton_5){

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Echa un vistazo a este enlace: https://www.ejemplo.com");
                startActivity(intent);

            }


            else if (view.getId()==R.id.boton_6){
                Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194?z=10");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps"); // Abre en Google Maps
                startActivity(mapIntent);
            }

        }
        public void ir(){
            Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"));
            startActivity(i);

        }
    }
