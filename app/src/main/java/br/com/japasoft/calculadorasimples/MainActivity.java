package br.com.japasoft.calculadorasimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.app.AlertDialog;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Double num1, num2, res;
    TextView txtResultant;
    EditText edtValor1;
    EditText edtValor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor1 = findViewById(R.id.edtValor1);
        edtValor2 = findViewById(R.id.edtValor2);
        txtResultant = findViewById(R.id.txtResultado);


    }

    public void somar() {
        try {
            num1 = Double.parseDouble(edtValor1.getText().toString());
            num2 = Double.parseDouble(edtValor2.getText().toString());
            res = num1 + num2;
            txtResultant.setText(String.valueOf(res));
        } catch (Exception e) {
            AlertDialog.Builder cxmsg;
            cxmsg = new AlertDialog.Builder(this);
            cxmsg.setMessage("Preencha os valores");
            cxmsg.setNeutralButton("OK", null);
            cxmsg.show();
        }

    }

    public void subtrair() {
        try {
            num1 = Double.parseDouble(edtValor1.getText().toString());
            num2 = Double.parseDouble(edtValor2.getText().toString());
            res = num1 - num2;
            txtResultant.setText(String.valueOf(res));
        } catch (Exception e) {
            AlertDialog.Builder cxmsg;
            cxmsg = new AlertDialog.Builder(this);
            cxmsg.setMessage("Preencha os valores");
            cxmsg.setNeutralButton("OK", null);
            cxmsg.show();
        }
    }

    public void multiplicar() {
        try {
            num1 = Double.parseDouble(edtValor1.getText().toString());
            num2 = Double.parseDouble(edtValor2.getText().toString());
            res = num1 * num2;
            txtResultant.setText(String.valueOf(res));
        } catch (Exception e) {
            AlertDialog.Builder cxmsg;
            cxmsg = new AlertDialog.Builder(this);
            cxmsg.setMessage("Preencha os valores");
            cxmsg.setNeutralButton("OK", null);
            cxmsg.show();
        }
    }

    public void dividir() {
        try {
            num1 = Double.parseDouble(edtValor1.getText().toString());
            num2 = Double.parseDouble(edtValor2.getText().toString());
            res = num1 / num2;
            txtResultant.setText(String.valueOf(res));
        } catch (Exception e) {
            AlertDialog.Builder cxmsg;
            cxmsg = new AlertDialog.Builder(this);
            cxmsg.setMessage("Preencha os valores");
            cxmsg.setNeutralButton("OK", null);
            cxmsg.show();
        }
    }

    public void opera(View v) {
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
                throw new IllegalStateException("Valor invalid: " + v.getId());
        }


        //   Toast.makeText(this, "Olha que bacana. Vários Toast", Toast.LENGTH_SHORT).show();
        //   Toast.makeText(this, "Valor da locação calculado", Toast.LENGTH_LONG).show();
    }

}