package unitri.edu.br.calculovalorfuturo;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculaValorFuturo(View view) {

        EditText val = findViewById(R.id.edtValorPresente);
        EditText mes = findViewById(R.id.edtMeses);
        EditText tx = findViewById(R.id.edtJuros);
        Button botao = findViewById(R.id.btnCalcula);

        double valor = Double.parseDouble((val).getText().toString());
        double prazo = Double.parseDouble((mes).getText().toString());
        double taxa = Double.parseDouble((tx).getText().toString());
        double resultado = 0;
        double juros = 0;

        juros = valor * prazo * (taxa/100);
        resultado = valor + juros;

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Resultado");
        dialog.setMessage("Valor atualizado: " + resultado);
        dialog.show();

    }
}