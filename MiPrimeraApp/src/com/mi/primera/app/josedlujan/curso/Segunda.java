package com.mi.primera.app.josedlujan.curso;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Segunda extends Activity{
	String nuevovalor;
	TextView textview;
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.segunda_acvitity);
		
		textview = (TextView) findViewById(R.id.texto);
		
		Bundle extras = getIntent().getExtras();
		if(extras != null){
			nuevovalor = extras.getString("valor");
			textview.setText(nuevovalor);
		}
		
		
    }
}
