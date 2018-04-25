package unitri.edu.br.imc;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText altura, peso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        altura = (EditText) findViewById(R.id.txtAltura);
        peso = (EditText) findViewById(R.id.txtPeso);
        Button botao = (Button) findViewById(R.id.btCalcular);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double altura = Double.parseDouble((MainActivity.this.altura.getText().toString()));
                double peso = Double.parseDouble((MainActivity.this.peso.getText().toString()));
                double resultado = peso / (altura * altura);
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado");

                if (resultado < 18.5) {
                    dialogo.setMessage("IMC: " + resultado + " Você está abaixo do peso ideal.");
                } else {
                    if ((resultado >= 18.5) && (resultado <= 24.9)) {
                        dialogo.setMessage("IMC: " + resultado + " Parabéns! Você está no seu peso normal!");
                    } else {
                        if ((resultado >= 25) && (resultado <= 29.9)) {
                            dialogo.setMessage("IMC: " + resultado + " Você está acima do peso (sobrepeso)");
                        } else {
                            if ((resultado >= 30) && (resultado <= 34.9)) {
                                dialogo.setMessage("IMC: " + resultado + " Obesidade grau I.");
                            } else {
                                if (resultado >= 35) {
                                    dialogo.setMessage("IMC: " + resultado + " Obesidade grau II.");
                                }
                            }
                        }
                    }
                }
                dialogo.setNeutralButton("OK", null);
                dialogo.show();



            }
        });
    }
}
