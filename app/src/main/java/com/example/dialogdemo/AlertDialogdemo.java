package com.example.dialogdemo;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class AlertDialogdemo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alertdialog);
	}
	 public void open(View view){
	      AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
	      alertDialogBuilder.setMessage("Are you Sure?");
	      alertDialogBuilder.setIcon(R.drawable.ic_launcher);
	      alertDialogBuilder.setTitle("Next Intent");
	      alertDialogBuilder.setPositiveButton("YES",
	           new DialogInterface.OnClickListener() {
			
	         @Override
	         public void onClick(DialogInterface arg0, int arg1) {
	            Intent positveActivity = new Intent(getApplicationContext(),PositiveActivity.class);
	            startActivity(positveActivity);
				
	         }
	      });
	      alertDialogBuilder.setNegativeButton("NO", 
	         new DialogInterface.OnClickListener() {
				
	         @Override
	         public void onClick(DialogInterface dialog, int which) {
	            Intent negativeActivity = new Intent(getApplicationContext(),NegativeActivity.class);
	            startActivity(negativeActivity);
			 }
	      });
		    
	      AlertDialog alertDialog = alertDialogBuilder.create();
	      alertDialog.show();
		 final CharSequence[] items = {"Red", "Green", "Blue"};

		 AlertDialog.Builder builder = new AlertDialog.Builder(this);
		 builder.setTitle("Pick a color");
		 builder.setItems(items, new DialogInterface.OnClickListener() {
		     public void onClick(DialogInterface dialog, int item) {
		         Toast.makeText(getApplicationContext(), items[item], Toast.LENGTH_SHORT).show();
		     }
		 });
		 AlertDialog alert = builder.create();
		    alert.show();
	   }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alert_dialogdemo, menu);
		return true;
	}

}
