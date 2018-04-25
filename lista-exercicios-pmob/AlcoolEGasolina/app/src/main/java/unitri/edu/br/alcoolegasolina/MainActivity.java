package unitri.edu.br.alcoolegasolina;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculaPrecoCombustivel(View view) {

        final EditText val1 = findViewById(R.id.alcoolTxt);
        final EditText val2 = findViewById(R.id.gasolinaTxt);

        double valor1 = Double.parseDouble((val1).getText().toString());
        double valor2 = Double.parseDouble((val2).getText().toString());

        double percentual = (valor1/valor2) * 100;
        DecimalFormat df = new DecimalFormat("0.##");
        String dx = df.format(percentual);

        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
        dialogo.setTitle("Atenção");
        if (percentual <= 70) {
            dialogo.setMessage("Percentual: "+ dx + " Abasteça com Etanol");
        } else {
            dialogo.setMessage("Percentual: "+ dx + " Abasteça com Gasolina");
        }
        dialogo.setNeutralButton("OK", null);
        dialogo.show();

    }
}