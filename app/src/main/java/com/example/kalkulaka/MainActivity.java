package com.example.kalkulaka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void Vypocitaj(View v) {

        EditText et1, et2;

        et1 = (EditText) findViewById(R.id.cislo1);
        et2 = (EditText) findViewById(R.id.cislo2);

        String c1, c2;

        c1 = et1.getText().toString();
        c2 = et2.getText().toString();

        if(c1.equals("") || c2.equals("")){
            Toast.makeText(this, "Nič si nezadal.", Toast.LENGTH_LONG).show();
            return;
        }

        Double cislo1, cislo2;


        cislo1 = Double.parseDouble(c1);
        cislo2 = Double.parseDouble(c2);

        RadioButton rbPlus, rbMinus, rbKrat, rbDeleno;

        rbPlus = (RadioButton) findViewById(R.id.plus);
        rbMinus = (RadioButton) findViewById(R.id.minus);
        rbKrat = (RadioButton) findViewById(R.id.krat);
        rbDeleno = (RadioButton) findViewById(R.id.deleno);

        if (rbPlus.isChecked())
            plus(cislo1, cislo2);
        else if (rbMinus.isChecked())
            minus(cislo1, cislo2);
        else if (rbKrat.isChecked())
            krat(cislo1, cislo2);
        else if (rbDeleno.isChecked())
            delene(cislo1, cislo2);
        else {
             Toast.makeText(this, "Nebolo zvolené políčko.", Toast.LENGTH_LONG ).show();
        }

    }

    private void plus(Double cislo1, Double cislo2){
        Double vysledok = cislo1 + cislo2;
        vypisVysledok(vysledok);
    }

    private void minus(Double cislo1, Double cislo2){
        Double vysledok = cislo1 - cislo2;
        vypisVysledok(vysledok);

    }

    private void krat(Double cislo1, Double cislo2){
        Double vysledok = cislo1 * cislo2;
        vypisVysledok(vysledok);

    }

    private void delene(Double cislo1, Double cislo2){
        Double vysledok = cislo1 / cislo2;
        vypisVysledok(vysledok);

    }
    private void vypisVysledok(Double result){
        String txt = String.valueOf(result);
        Toast.makeText(this, "Výsledok je:" + txt, Toast.LENGTH_LONG).show();
    }
}
