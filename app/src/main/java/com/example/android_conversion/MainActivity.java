package com.example.android_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.example.android_conversion.models.Celcius;
import com.example.android_conversion.models.Farenheit;
import com.example.android_conversion.models.Kelvin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Celcius c = new Celcius(0.0);
        // Kelvin k = new Kelvin(0.0);
        // Farenheit f = new Farenheit(0.0);

        Button btnKelvin = findViewById(R.id.btnKelvin);
        Button btnCelcius = findViewById(R.id.btnCelcius);
        Button btnFarenheit = findViewById(R.id.btnFarenheit);
        TextView Resultado1 = findViewById(R.id.Conversion1);
        TextView Resultado2 = findViewById(R.id.Conversion2);
        TextView camporesultado1 = findViewById(R.id.res1);
        TextView camporesultado2 = findViewById(R.id.res2);
        EditText campoIngreso =  findViewById(R.id.IngresarGrados);
        LinearLayout recuadro1 = findViewById(R.id.uno);
        LinearLayout recuadro2 = findViewById(R.id.dos);
        TextView TemperaturaOrg = findViewById(R.id.TempOriginal);
        TextView Texto3 = findViewById(R.id.Text3);

        btnKelvin.setOnClickListener(view -> {
            String grado = campoIngreso.getText().toString();

            if(grado.isEmpty()) {
                Toast.makeText(this, "El campo no puede estar vacio", Toast.LENGTH_SHORT).show();
            }
            else {
                Double valor = Double.parseDouble(grado);

                Celcius celcius = new Celcius(valor);
                Farenheit farenheit = new Farenheit(valor);

                Kelvin kelvinCelcius = new Kelvin(0.0);
                Kelvin kelvinFarenheit = new Kelvin(0.0);

                kelvinCelcius = kelvinCelcius.parse(celcius);
                kelvinFarenheit = kelvinFarenheit.parse(farenheit);

                Texto3.setVisibility(View.VISIBLE);
                recuadro1.setVisibility(View.VISIBLE);
                recuadro2.setVisibility(View.VISIBLE);
                TemperaturaOrg.setVisibility(View.VISIBLE);
                TemperaturaOrg.setText(valor + " " + kelvinCelcius.getUnidad());
                Resultado1.setText("Celcius");
                Resultado2.setText("Farenheit");
                camporesultado1.setText(String.format("%.2f", kelvinCelcius.getValor()));
                camporesultado2.setText(String.format("%.2f", kelvinFarenheit.getValor()));
                campoIngreso.setText("");
            }
        });

        btnCelcius.setOnClickListener(view -> {
            String grado = campoIngreso.getText().toString();

            if(grado.isEmpty()) {
                Toast.makeText(this, "El campo no puede estar vacio", Toast.LENGTH_SHORT).show();
            }
            else {
                Double valor = Double.parseDouble(grado);

                Kelvin kelvin = new Kelvin(valor);
                Farenheit farenheit = new Farenheit(valor);

                Celcius CelciusFarenheit = new Celcius(0.0);
                Celcius CelciusKelvin = new Celcius(0.0);

                CelciusFarenheit = CelciusFarenheit.parse(farenheit);
                CelciusKelvin =  CelciusKelvin.parse(kelvin);

                Texto3.setVisibility(View.VISIBLE);
                recuadro1.setVisibility(View.VISIBLE);
                recuadro2.setVisibility(View.VISIBLE);
                TemperaturaOrg.setVisibility(View.VISIBLE);
                TemperaturaOrg.setText(valor + " " + CelciusFarenheit.getUnidad());
                Resultado1.setText("Farenheit");
                Resultado2.setText("Kelvin");
                camporesultado1.setText(String.format("%.2f", CelciusFarenheit.getValor()));
                camporesultado2.setText(String.format("%.2f", CelciusKelvin.getValor()));
                campoIngreso.setText("");
            }
        });

        btnFarenheit.setOnClickListener(view -> {
            String grado = campoIngreso.getText().toString();

            if(grado.isEmpty()) {
                Toast.makeText(this, "El campo no puede estar vacio", Toast.LENGTH_SHORT).show();
            }
            else {
                Double valor = Double.parseDouble(grado);

                Celcius Celcius = new Celcius(valor);
                Kelvin Kelvin = new Kelvin(valor);

                Farenheit FarenheitCelcius = new Farenheit(0.0);
                Farenheit FarenheitKelvin = new Farenheit(0.0);

                FarenheitCelcius = FarenheitCelcius.parse(Celcius);
                FarenheitKelvin = FarenheitKelvin.parse(Kelvin);

                Texto3.setVisibility(View.VISIBLE);
                recuadro1.setVisibility(View.VISIBLE);
                recuadro2.setVisibility(View.VISIBLE);
                TemperaturaOrg.setVisibility(View.VISIBLE);
                TemperaturaOrg.setText(valor + " " + FarenheitCelcius.getUnidad());
                Resultado1.setText("Celcius");
                Resultado2.setText("Kelvin");
                camporesultado1.setText(String.format("%.2f", FarenheitCelcius.getValor()));
                camporesultado2.setText(String.format("%.2f", FarenheitKelvin.getValor()));
                campoIngreso.setText("");
            }
        });

    }
}