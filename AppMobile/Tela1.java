package br.unicid.edu.aulinha1808;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio1 extends AppCompatActivity {

    private Button btnSomar, btnDividir, btnMultiplicar, btnSubtrair;
    private EditText edtValor1, edtValor2;

    private TextView txtResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnSomar = findViewById(R.id.btnSomar);
        btnDividir = findViewById(R.id.btnDividir);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        edtValor1 = findViewById(R.id.edtValor1);
        edtValor2 = findViewById(R.id.edtValor2);
        txtResultado = findViewById(R.id.txtResultado);

    }

    public void somar(View view){
        int n1 = Integer.parseInt(edtValor1.getText().toString());
        int n2 = Integer.parseInt(edtValor2.getText().toString());

        int soma = n1+n2;

        txtResultado.setText("Resultado " + soma);
    }

    public void subtrair(View view){
        int n1 = Integer.parseInt(edtValor1.getText().toString());
        int n2 = Integer.parseInt(edtValor2.getText().toString());

        int subtrai = n1-n2;

        txtResultado.setText("Resultado " + subtrai);
    }

    public void multiplicar(View view){
        int n1 = Integer.parseInt(edtValor1.getText().toString());
        int n2 = Integer.parseInt(edtValor2.getText().toString());

        int multiplica = n1*n2;

        txtResultado.setText("Resultado " + multiplica);
    }


    public void dividir(View view){
        int n1 = Integer.parseInt(edtValor1.getText().toString());
        int n2 = Integer.parseInt(edtValor2.getText().toString());

        int divide = n1/n2;

        txtResultado.setText("Resultado " + divide);
    }


}
