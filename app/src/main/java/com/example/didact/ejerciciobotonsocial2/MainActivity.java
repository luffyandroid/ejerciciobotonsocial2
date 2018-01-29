package com.example.didact.ejerciciobotonsocial2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tvFacebook, tvTwitter, tvInstagram, tvAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFacebook = (TextView)findViewById(R.id.tvFacebook);
        tvTwitter = (TextView)findViewById(R.id.tvTwitter);
        tvInstagram = (TextView)findViewById(R.id.tvInstagram);
        tvAceptar = (TextView)findViewById(R.id.tvAceptar);

    }//fin oncreate

    public void clickbotonFacebook (View view){
        tvFacebook.setText("Facebook");
        tvTwitter.setText("");
        tvInstagram.setText("");
        tvAceptar.setText("");
    }
    public void clickbotonTwitter (View view){
        tvTwitter.setText("Twitter");
        tvFacebook.setText("");
        tvInstagram.setText("");
        tvAceptar.setText("");
    }
    public void clickbotonInstagram (View view){
        tvInstagram.setText("Instagram");
        tvTwitter.setText("");
        tvFacebook.setText("");
        tvAceptar.setText("");
    }
    public void clickbotonAceptar (View view){
        String etiquetaFacebook = tvFacebook.getText().toString();
        String etiquetaTwitter = tvTwitter.getText().toString();
        String etiquetaInstagram = tvInstagram.getText().toString();
        tvAceptar.setText("Has compartido en "+etiquetaFacebook+etiquetaTwitter+etiquetaInstagram);
        tvFacebook.setText("");
        tvTwitter.setText("");
        tvInstagram.setText("");

    }

}//fin MainActivity
