package edu.fje.dam2.projectesudoku;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class Benvinguda extends AppCompatActivity {

    private Button btJugar;
    private Button btDif1;
    private Button btDif2;
    private Button btDif3;
    private TextView dif;
    private CoordinatorLayout coordinatorLayout;

    private int slDif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.benvinguda);

        btJugar = (Button) findViewById(R.id.btJugar);
        btDif1 = (Button) findViewById(R.id.btDif1);
        btDif2 = (Button) findViewById(R.id.btDif2);
        btDif3 = (Button) findViewById(R.id.btDif3);
        dif = (TextView) findViewById(R.id.dif);

        dif.setText("Dificultat seleccionada\n FACIL");
        slDif = 1;

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinator);

    }

    public void onClickJugar(View view){
        if(String.valueOf(view.getId()).equals("2131296355")){
            dif.setText("Dificultat seleccionada\n FACIL");
            slDif = 1;

        }
        if(String.valueOf(view.getId()).equals("2131296356")){
            dif.setText("Dificultat seleccionada\n MITJA");
            slDif = 2;

        }
        if(String.valueOf(view.getId()).equals("2131296357")){
            dif.setText("Dificultat seleccionada\n DIFICIL");
            slDif = 3;

        }
    }

    public void onClickIniciar(View view){
        Intent intent = new Intent(this, Sudoku.class);

        intent.putExtra("dificultat", slDif);

        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.sudoku:
                Log.i("MENU", "A");
                return true;
            case R.id.app:
                Log.i("MENU", "B");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
