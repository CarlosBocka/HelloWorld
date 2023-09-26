package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

/**
 * @author Carlos Bocka López
 * @version 1.0
 * Aplicación que muestra el típico ejemplo de Hola Mundo
 * <ol>
 *     <li>Hemos visto cómo se crean los recursos en XML</li>
 *     <li>Hemos instanciado en Java unos objetos TextView</li>
 *     <li>Se ha personalizado la imagen de la aplicación</li>
 * </ol>
 */
public class MainActivity extends AppCompatActivity {
    private TextView tvMessageStart;
    private TextView tvMessageEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        tvMessageStart = findViewById(R.id.tvMessageStart);
        tvMessageStart.setTextColor(getColor(R.color.white));

        tvMessageEnd = findViewById(R.id.tvMessageEnd);
        tvMessageEnd.setText(R.string.txtMessageOptimist);
    }
}