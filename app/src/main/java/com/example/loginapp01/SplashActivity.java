package com.example.loginapp01;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // Vincula el diseño de la pantalla splash

        // Duración de la pantalla splash (3 segundos)
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Después de 3 segundos, inicia la actividad de inicio de sesión
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Cierra la actividad Splash
            }
        }, 3000); // 3000 milisegundos = 3 segundos
    }
}
