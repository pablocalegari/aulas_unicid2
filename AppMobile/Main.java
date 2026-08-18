package br.unicid.edu.aulinha1808;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnExercicio1, btnExercicio2, btnExercicio3, btnExercicio4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //java x XML
        btnExercicio1 = findViewById(R.id.btnExercicio1);
        btnExercicio2 = findViewById(R.id.btnExercicio2);
        btnExercicio3 = findViewById(R.id.btnExercicio3);
        btnExercicio4 = findViewById(R.id.btnExercicio4);
    }
    // metodo para mudar de tela do EX1
    public void exercicio1(View view){
        Intent it = new Intent(getApplicationContext(), Exercicio1.class);
        startActivity(it);
    }
    // metodo para mudar de tela do EX2
    public void exercicio2(View view){
        Intent it = new Intent(getApplicationContext(), Exercicio2.class);
        startActivity(it);
    }

}
