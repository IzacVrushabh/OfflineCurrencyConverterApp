package com.IzacCurrency.currencyconverter;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     public void btnclick(View view){
         EditText dollaramt = (EditText) findViewById(R.id.dollaramt);
         String dollars=dollaramt.getText().toString();

         Double doubledollars = Double.parseDouble(dollars);
         Double doubleinr1 =  75.49 * doubledollars;
         String toastText1 = "DOLLAR:" + doubleinr1.toString() + "$";
         Toast.makeText(this, toastText1 , Toast.LENGTH_SHORT).show();

         Double doubledhiram = Double.parseDouble(dollars);
         Double doubleinr2 = 56.7 * doubledhiram;
         String toastText2 = "DHIRAM:" + doubleinr2.toString() + "D";
         Toast.makeText(this, toastText2 , Toast.LENGTH_SHORT).show();

         Double doubleeuro = Double.parseDouble(dollars);
         Double doubleinr3 = 85.01 * doubleeuro;
         String toastText3 = "EURO:" + doubleinr3.toString() + "E";
         Toast.makeText(this, toastText3 , Toast.LENGTH_SHORT).show();

         Double doublebaht = Double.parseDouble(dollars);
         Double doubleinr4 = 2.43 * doublebaht;
         String toastText4 = "BAHT:" + doubleinr4.toString() + "T";
         Toast.makeText(this, toastText4 , Toast.LENGTH_SHORT).show();
     }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
