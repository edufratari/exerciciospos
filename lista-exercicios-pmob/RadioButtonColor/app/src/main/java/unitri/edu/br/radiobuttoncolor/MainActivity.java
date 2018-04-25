package unitri.edu.br.radiobuttoncolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        RadioButton rb1 = findViewById(R.id.rbBranco);
        RadioButton rb2 = findViewById(R.id.rbAmarelo);
        RadioButton rb3 = findViewById(R.id.rbRosa);
        RadioButton rb4 = findViewById(R.id.rbAzul);

        LinearLayout layout = findViewById(R.id.lCores);
        view = findViewById(R.id.view);

        if (rb1.isChecked()) {
            view.setBackgroundColor(255255255);
        }
        if (rb2.isChecked()) {
            view.setBackgroundColor(2552550);
        }
        if (rb3.isChecked()) {
            view.setBackgroundColor(255192203);
        }
        if (rb4.isChecked()) {
            view.setBackgroundColor(30144255);

        }
    }
}
