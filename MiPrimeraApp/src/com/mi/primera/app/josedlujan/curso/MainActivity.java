package com.mi.primera.app.josedlujan.curso;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener{
	EditText campo;
	Button enviar;
	String msg;
	
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		campo = (EditText) findViewById(R.id.campo);
		enviar = (Button) findViewById(R.id.boton);
		
		enviar.setOnClickListener(this);
				
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.boton:
			msg = campo.getText().toString();
			Intent intent = new Intent(getBaseContext(),Segunda.class);
			intent.putExtra("valor", msg);
			startActivity(intent);
			break;

		default:
			break;
		}
	}

	


	
	

}
