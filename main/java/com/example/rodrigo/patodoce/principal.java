package com.example.rodrigo.patodoce;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class principal extends ActionBarActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Button goiaba = (Button) findViewById(R.id.btnDoceGoiaba);
        Button caju = (Button) findViewById(R.id.btnDoceCaju);
        Button amora = (Button) findViewById(R.id.btnDoceAmora);

        caju.setOnClickListener(this);
        goiaba.setOnClickListener(this);
        amora.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
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

    @Override
    public void onClick(View v) {
        Intent it;

        if(v.getId() == R.id.btnDoceAmora){
            it = new Intent(this,amora.class);
            startActivity(it);
        }

        if(v.getId() == R.id.btnDoceCaju){
            it = new Intent(this,caju.class);
            startActivity(it);
        }

        if(v.getId() == R.id.btnDoceGoiaba){
            it = new Intent(this,goiaba.class);
            startActivity(it);
        }
    }
}
