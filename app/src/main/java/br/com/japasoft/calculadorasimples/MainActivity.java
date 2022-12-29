package br.com.japasoft.calculadorasimples;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Double num1, num2, res;
    TextView txtResultant;
    EditText edtValor1;
    EditText edtValor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        Button btnSomar = findViewById(R.id.btnSomar);
        Button btnSubtracao = findViewById(R.id.btnSubtrair);
        Button btnMultiplicar = findViewById(R.id.btnMultiplicar);
        Button btnDividir = findViewById(R.id.btnDividir);

 */

        edtValor1 = findViewById(R.id.edtValor1);
        edtValor2 = findViewById(R.id.edtValor2);
        txtResultant = findViewById(R.id.txtResultado);
    }

    public void somar() {
        num1 = Double.parseDouble(edtValor1.getText().toString());
        num2 = Double.parseDouble(edtValor2.getText().toString());
        res = num1 + num2;
        txtResultant.setText(String.valueOf(res));
    }

    public void subtrair() {
        num1 = Double.parseDouble(edtValor1.getText().toString());
        num2 = Double.parseDouble(edtValor2.getText().toString());
        res = num1 - num2;
        txtResultant.setText(String.valueOf(res));
    }

    public void multiplicar() {
        num1 = Double.parseDouble(edtValor1.getText().toString());
        num2 = Double.parseDouble(edtValor2.getText().toString());
        res = num1 * num2;
        txtResultant.setText(String.valueOf(res));
    }

    public void dividir() {
        num1 = Double.parseDouble(edtValor1.getText().toString());
        num2 = Double.parseDouble(edtValor2.getText().toString());
        res = num1 / num2;
        txtResultant.setText(String.valueOf(res));
    }

    @SuppressLint("NonConstantResourceId")
    public void operacao(View v) {
        switch (v.getId()) {
            case R.id.btnSomar:
                somar();
                break;
            case R.id.btnSubtrair:
                subtrair();
                break;
            case R.id.btnMultiplicar:
                multiplicar();
                break;
            case R.id.btnDividir:
                dividir();
                break;
            default:
                throw new IllegalStateException("Valor invalido: " + v.getId());
        }
    }

}