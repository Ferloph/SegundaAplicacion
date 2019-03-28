package fernanda.itics.tesoem.edu.segundaaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity {

    EditText num1, num2;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);
        num1 = (EditText) findViewById(R.id.txtnum1);
        num2 = (EditText) findViewById(R.id.txtnum2);
        resultado = (TextView) findViewById(R.id.lblresultado);
    }

    public void calculaSuma(View view) {
        int a,b,r;
        a = Integer.parseInt(num1.getText().toString());
        b = Integer.parseInt(num2.getText().toString());
        r = a+b;
        resultado.setText(String.valueOf(r));
        }
    }
